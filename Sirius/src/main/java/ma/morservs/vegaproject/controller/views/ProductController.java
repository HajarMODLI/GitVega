package ma.morservs.vegaproject.controller.views;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Ayoub on 02/09/2016.
 */
@Controller
@RequestMapping(value ="/product")
public class ProductController {


    Logger logger =Logger.getLogger(ProductController.class);





    @RequestMapping(method = RequestMethod.GET,value = "/table")
    public String getProductListPage(ModelMap modelMap){

        return "product/pages/table";

    }


    @RequestMapping(method = RequestMethod.GET,value = "/home")
    public String getHomePage(ModelMap modelMap){

        return "product/pages/home";

    }

    @RequestMapping(method = RequestMethod.GET,value = "/create")
    public String hello(){
        try {

            this.getClass().getResource("/");
            Path currentRelativePath = Paths.get(this.getClass().getResource("/").toURI());
            String s = currentRelativePath.toAbsolutePath().toString();
            logger.info("Current relative path is: " + s);
            File file = new File(s+"/newfile.txt");
            if (file.createNewFile()){
                logger.info("File is created!");
            }else{
                logger.info("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return "product/pages/home";
    }
}
