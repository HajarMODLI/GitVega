package ma.morservs.vegaproject.controller.rest;

import ma.morservs.vegaproject.tools.logging.Logging;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayoub on 30/08/2016.
 */

@RestController
public class Controller {



    @Logging
    private static Logger logger;

    @RequestMapping(value="/hello" ,method= RequestMethod.GET)
    public String sayHello(){

        logger.info("hello world  this is first logger");
        return "Hello world";
    }

}
