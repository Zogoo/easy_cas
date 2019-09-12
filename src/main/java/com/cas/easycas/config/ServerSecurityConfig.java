package com.cas.easycas.config;

import com.cas.easycas.config.filter.CasAuthenticationFilter;
import com.cas.easycas.repository.UsersRepository;
import com.cas.easycas.service.PasswordAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class ServerSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CasUserDetailsService casUserDetailsServiceInterface;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider());
    }

//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class)
                .csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/password");
    }

    public AuthenticationProvider authProvider() {
        PasswordAuthenticationService passwordAuthenticationProvider
                = new PasswordAuthenticationService(passwordEncoder(), casUserDetailsServiceInterface);
        return passwordAuthenticationProvider;
    }

    public CasAuthenticationFilter authenticationFilter() throws Exception {
        CasAuthenticationFilter filter = new CasAuthenticationFilter();
        filter.setAuthenticationManager(authenticationManagerBean());
        filter.setAuthenticationFailureHandler(authFailureHandler());
        return filter;
    }

    public SimpleUrlAuthenticationFailureHandler authFailureHandler() {
        return new SimpleUrlAuthenticationFailureHandler("/login?error=true");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(25);
    }
}
