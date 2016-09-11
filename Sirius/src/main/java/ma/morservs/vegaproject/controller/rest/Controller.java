package ma.morservs.vegaproject.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayoub on 30/08/2016.
 */

@RestController
public class Controller {


    @RequestMapping(value="/hello" ,method= RequestMethod.GET)
    public String sayHello(){
        return "Hello world";
    }

}
