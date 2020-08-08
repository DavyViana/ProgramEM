package com.programem.site;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class securityWebConfig extends WebSecurityConfigurerAdapter {
   
  @Override
  protected void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder
        .inMemoryAuthentication()
        .withUser("davy").password("{noop}davy")
            .roles("USER")
        .and()
        .withUser("luis").password("{noop}8125")
            .roles("USER")
        .and()
        .withUser("marcos").password("{noop}8579")
            .roles("USER");
  }
 
 
}