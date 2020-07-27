package com.coderdream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    /***
     * 用户管理
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(){
        return "user_list";
    }
}
