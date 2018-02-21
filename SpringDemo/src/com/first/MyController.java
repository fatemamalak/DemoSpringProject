package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
    @RequestMapping("/fatema" )
    ModelAndView MyFun()
    {
        System.out.println();
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg","Hello Folks");
        return mv;

    }
}
