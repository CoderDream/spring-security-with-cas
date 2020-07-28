package com.coderdream.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/***********
 *  @author:itcast
 *  @date:2018/3/23
 *  @description:SpringSecurity+CAS
 ***/
public class UserDetailServiceImpl implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //校验用户是否是VIP
        //用户相关操作行为

        //从数据库查询出来的密码
        String password = "$2a$10$8dszjSS3l0r.pdzlZcH5y.MZzunCf8BBDZqFW5mRbE72KV/coGXp2";

        //校验通过后放行
        //添加授权信息
        List<GrantedAuthority> grantedList = new ArrayList<GrantedAuthority>();
        //这里需要给用户授权对应的角色
        grantedList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        grantedList.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new User(username, password, grantedList);
    }
}

