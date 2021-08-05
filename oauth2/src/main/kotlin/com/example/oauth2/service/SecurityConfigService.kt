package com.example.oauth2.service

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
class SecurityConfigService : WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)

    override fun configure(http: HttpSecurity) {
        http
            .antMatcher("/**").authorizeRequests()
            .antMatchers("/").permitAll()
            .anyRequest().authenticated()
            .and().oauth2Login();
    }
}

