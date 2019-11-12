package com.asiainfo.invoice_steward.main.controller;

import com.asiainfo.invoice_steward.main.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/auth")
public class AuthController {

    @Resource
    private AuthService authService;

    @RequestMapping(path = "/check", method = RequestMethod.GET)
    public String scanCode(@RequestParam("accountCode") Long accountCode) {
        int count = authService.checkAuthStatus(accountCode);
        if (count == 0) {
            return "html/shouquan";
        } else {
            return "html/index";
        }

    }

    @ResponseBody
    @RequestMapping(path = "/sdf1", method = RequestMethod.GET)
    public String scanCode1(HttpServletRequest request) {

        return "2345";
    }

}
