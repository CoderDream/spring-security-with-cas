package com.coderdream.controller;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("1234567"));
        // $2a$10$8dszjSS3l0r.pdzlZcH5y.MZzunCf8BBDZqFW5mRbE72KV/coGXp2
    }

}
