package org.code.blocks.springboot.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

/**
 * @author darwindu
 * @date 2020/12/23
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private AuthenticationProvider authenticationProvider;
    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationSuccessHandler myAuthenticationSuccessHandler;
    @Autowired
    private AuthenticationFailureHandler myAuthenticationFailHander;

    /**
     * 密码加密
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 静态密码登录
     * @param auth
     * @throws Exception
     */
    /*@Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .passwordEncoder(passwordEncoder())
            .withUser("admin").password(passwordEncoder().encode("123456")).roles("ADMIN")
            .and()
            .withUser("test").password(passwordEncoder().encode("test123")).roles("USER");
    }*/

    /**
     * 触发security认证
     * @param auth
     * @throws Exception
     */
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            //用户认证处理
            .authenticationProvider(authenticationProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 关闭csrf防护
        http.csrf().disable()
            .headers().frameOptions().disable()
            .and();

        //登录处理
        http.formLogin()
            //表单方式，或httpBasic
            .loginPage("/loginPage")
            .loginProcessingUrl("/login*")
            .successHandler(myAuthenticationSuccessHandler)
            .failureHandler(myAuthenticationFailHander)
            //成功登陆后跳转页面
            //.defaultSuccessUrl("/index")
            //.failureUrl("/loginError")
            //表单登录，permitAll()表示这个不需要验证 登录页面，登录失败页面
            .permitAll()
            .and();

        // 授权配置
        http.authorizeRequests()
            //无需权限访问
            .antMatchers( "/css/**", "/error404").permitAll()
            .antMatchers("/user/**").hasRole("USER")
            .antMatchers("/index").permitAll()
            //.antMatchers(HttpMethod.POST,"/user/").hasRole("ADMIN")
            .antMatchers("/whoim").hasRole("ADMIN") //这就表示/whoim的这个资源需要有ROLE_ADMIN的这个角色才能访问。不然就会提示拒绝访问
            //.anyRequest().access("@rbacService.hasPermission(request,authentication)")    //必须经过认证以后才能访问
            //其他接口需要登录后才能访问
            .anyRequest().authenticated()
            .and();

        //开启记住我
        http
            .rememberMe()
            .tokenValiditySeconds(7200) // remember 过期时间，单为秒
            .tokenRepository(persistentTokenRepository())
            .userDetailsService(userDetailsService)
            .and();

    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        jdbcTokenRepository.setDataSource(dataSource);
        jdbcTokenRepository.setCreateTableOnStartup(false);
        return jdbcTokenRepository;
    }

}
