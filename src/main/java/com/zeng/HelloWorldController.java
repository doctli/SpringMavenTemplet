package com.zeng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Zeng sp
 * @description Hello
 * @package com.zeng
 * @name HelloWorldController
 * @create 2016-11-28-9:31 AM
 */
@Controller
public class HelloWorldController {
    String message = "Welcome to Spring MVC!";

    @RequestMapping ("/hello")
    public ModelAndView showMessage(
            @RequestParam (value = "name", required = false, defaultValue = "World") String name) {
        System.out.println("in controller");

        ModelAndView mv = new ModelAndView("helloworld");
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
}
