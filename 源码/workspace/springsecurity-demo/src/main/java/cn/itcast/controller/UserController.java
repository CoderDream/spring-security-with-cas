package cn.itcast.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***********
 *  @author:itcast
 *  @date:2018/3/23
 *  @description:SpringSecurity+CAS
 ***/
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
