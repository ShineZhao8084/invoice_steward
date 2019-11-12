package com.asiainfo.invoice_steward.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String scanCode(HttpServletRequest request) {
        return "html/index";
    }

}
