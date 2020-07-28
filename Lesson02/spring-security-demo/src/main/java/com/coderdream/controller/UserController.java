package com.coderdream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.filter.DelegatingFilterProxy;

@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    /***
     * 用户管理
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(){
        DelegatingFilterProxy d = null;
        return "user_list";
    }
}
