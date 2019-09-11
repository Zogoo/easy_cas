package com.cas.easycas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PasswordAuthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PasswordAuthController.class);

    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public ModelAndView passwordAuth() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("password");
        return modelAndView;
    }
}
