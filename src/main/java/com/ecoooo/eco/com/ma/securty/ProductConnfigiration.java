package com.ecoooo.eco.com.ma.securty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProductConnfigiration {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       http.csrf(AbstractHttpConfigurer::disable)
       .authorizeHttpRequests(auth -> auth
       .requestMatchers(HttpMethod.PUT,"").hasRole("ADIMN")
       .requestMatchers(HttpMethod.POST,"").hasRole("ADMIN")
       .requestMatchers(HttpMethod.DELETE,"").hasRole("ADMIN")
       .requestMatchers(HttpMethod.GET,"").permitAll()
       );
       return http.build();
    }
}
