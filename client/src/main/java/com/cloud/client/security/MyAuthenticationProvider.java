package com.cloud.client.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component("myAuthenticationProvider")
public class MyAuthenticationProvider  implements AuthenticationProvider {
    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * 自定义验证方式
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        UserDetails user = userDetailsService.loadUserByUsername(username);
        if(user==null){
            throw new RuntimeException("用户为空");
        }
        if(user.getPassword().equals(password)) {
            return new UsernamePasswordAuthenticationToken(username, null, user.getAuthorities());
        }
        if(user.getPassword().equals(password)){
            throw new RuntimeException("密码为空");
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }

}
