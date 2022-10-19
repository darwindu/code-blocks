package org.code.blocks.springboot.security.config;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.springboot.security.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 *
 * 用户名密码->(Authentication(未认证) -> AuthenticationManager ->AuthenticationProvider->UserDetailService->UserDetails->Authentication(已认证）
 * 登录时触发加载用户信息
 *
 * @author darwindu
 * @date 2020/12/24
 **/
@Component
@Slf4j
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //这里可以可以通过username（登录时输入的用户名）然后到数据库中找到对应的用户信息，并构建成我们自己的UserInfo来返回。
        SysUser sysUser = new SysUser();
        //查无此用户
        if(sysUser == null || StringUtils.isEmpty(sysUser.getUserId())){
            sysUser = new SysUser();
            sysUser.setLoginName("查无此用户");
            sysUser.setPassword("查无此用户");
        }
        String password = "";
        String role = "";
        if (username.equals("admin")) {
            password = passwordEncoder.encode("123456");
            role = "ROLE_ADMIN";
        }
        else if (username.equals("user")) {
            password = passwordEncoder.encode("123123");
            role = "ROLE_USER";
        }
        log.info("### 加载用户, password: {}", password);
        //由于权限参数不能为空，所以这里先使用AuthorityUtils.commaSeparatedStringToAuthorityList方法模拟一个admin的权限，该方法可以将逗号分隔的字符串转换为权限集合。
        return new User(username, password, AuthorityUtils.commaSeparatedStringToAuthorityList(role));
        //return new User(username, sysUser.getPassword(),AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
