package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***********
 *  @author:itcast
 *  @date:2018/3/23
 *  @description:SpringSecurity+CAS
 ***/
@Controller
public class LoginController {

    /****
     * /login.shtml
     * 跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    /****
     * 登录失败处理方法
     * @return
     */
    @RequestMapping(value = "/login/fail")
    public String loginfail(Model model) {
        model.addAttribute("msg", "账号或者密码不正确!");
        return  "login";
    }
}
