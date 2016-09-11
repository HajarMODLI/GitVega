package ma.morservs.vegaproject.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ayoub on 02/09/2016.
 */

@Controller
@RequestMapping(value = "/layout")
public class Layout {


    /*header Layout and tiles*/

    @RequestMapping(value="/header" ,method= RequestMethod.GET)
    public String getHeader(ModelMap modelMAp){

        return "layout/header";
    };

    @RequestMapping(value="/apps-dropdown" ,method= RequestMethod.GET)
    public String getAppsDropDown(ModelMap modelMAp){
        return "layout/header/apps-dropdown";
    };

    @RequestMapping(value="/notifications-dropdown" ,method= RequestMethod.GET)
    public String getNotificationsDropDown(ModelMap modelMAp){
        return "layout/header/notifications-dropdown";
    };




    @RequestMapping(value="/footer" ,method=RequestMethod.GET)
    public String getFooter(ModelMap modelMap){
        return "layout/footer";
    }
    @RequestMapping(value="/sidebar-left" ,method=RequestMethod.GET)
    public String getsideBarLeft(ModelMap modelMap){

        return "layout/side-bar-left";
    }

    /* Layouts of Products */


    @RequestMapping(value="/product/common" ,method=RequestMethod.GET)
    public String getProductCommonPage(ModelMap modelMap){
        return "product/layout/common";
    }

}
