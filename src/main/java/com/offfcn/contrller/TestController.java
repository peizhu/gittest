package com.offfcn.contrller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/*
 *TestController
 *@author peizhu
 *@date 2020/10/8 19:08
 *@Version 1.0
 */
@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","Hello");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }
}
