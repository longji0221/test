package com.cloud.client.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //处理登陆密码用户名验证逻辑
        List list=new ArrayList<>();
//        SimpleGrantedAuthority authority=new SimpleGrantedAuthority("ROLE_AUTH");
//        list.add(authority);
        UserDetails userDetails=new User("zhangsan","123456",list);
        return userDetails;
    }


}
