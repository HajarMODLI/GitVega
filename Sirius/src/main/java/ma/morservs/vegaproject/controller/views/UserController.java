package ma.morservs.vegaproject.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ayoub on 07/09/2016.
 */
@Controller
@RequestMapping(value ="/user")
public class UserController {


    @RequestMapping(method = RequestMethod.GET,value = "/users")
    public String loadProductsPage(ModelMap model){



        return "user/list";
    }
}
