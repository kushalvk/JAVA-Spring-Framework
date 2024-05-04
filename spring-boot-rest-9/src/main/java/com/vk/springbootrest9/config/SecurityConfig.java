package com.vk.springbootrest9.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean // it specify a different csrf-token to every time to load
    // default allows login
    // in this seton we dot have to compalsary add csrf-token to add the data (POST Request)
    public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {

        // lambda expression for all
        http.csrf(customizer -> customizer.disable());
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
        http.httpBasic(Customizer.withDefaults());
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
        // you can logout in this section b/s it has a "STATELESS". you can close it.
    }

    // for multiple username and password

    // Dynamic database connectivity

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public AuthenticationProvider authProvider() {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(); // this is use to talk eich database and which table name

        provider.setUserDetailsService(userDetailsService);
//        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // this is use to orignal password
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12)); // this is use to bcypted password

        return provider;
    }
}