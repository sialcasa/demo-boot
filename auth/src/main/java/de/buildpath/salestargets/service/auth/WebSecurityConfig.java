package de.buildpath.salestargets.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order(-20)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @Autowired // <-- This is crucial otherwise Spring Boot creates its own
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("stefan")
                .password("password")
                .roles("USER")
                .and()
                .withUser("alex")
                .password("password")
                .roles("USER")

                .and()

                .withUser("admin")
                .password("admin")
                .roles("ADMIN");
    }

    // public void configure(AuthenticationManagerBuilder auth) throws Exception {
    // // Nutzer gegen Datenbank authentifizieren
    // auth.jdbcAuthentication().dataSource(dataSource());
    // }
    //
    // @Bean
    // public DataSource dataSource() {
    // return DataSourceBuilder.create().build();
    // }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .permitAll()
                .and()
                .requestMatchers()
                .antMatchers("/login", "/oauth/authorize", "/oauth/confirm_access")
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
