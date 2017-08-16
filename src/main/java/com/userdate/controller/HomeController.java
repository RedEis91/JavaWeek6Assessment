package com.userdate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home () {

        ModelAndView mv = new
                ModelAndView("index");
        mv.addObject("desc","Ship early, ship often!");
        return mv;
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome () {

        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message","Thank you for visiting.");
        return mv;
    }

    //action that gets called>
    @RequestMapping("/receipt")
        public ModelAndView formhandler(
                @RequestParam("ordernumber") int ordernumber)

        {
            ModelAndView mv = new ModelAndView("receipt");
            mv.addObject("ordernumber", ordernumber);
            return mv;
        }

    }
