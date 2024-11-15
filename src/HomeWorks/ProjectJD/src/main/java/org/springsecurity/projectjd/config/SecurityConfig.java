package org.springsecurity.projectjd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailService();
    }



    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService());
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(request -> request
                        .requestMatchers("/login", "/register").permitAll() // Разрешаем доступ к логину и регистрации
                        .requestMatchers("/home").authenticated() // Защищаем /home, только аутентифицированные могут получить доступ
                        .anyRequest().authenticated() // Остальные запросы требуют аутентификации
                )
                .formLogin(form -> form
                        .loginPage("/login") // Настройка страницы логина
                        .failureUrl("/error") // Настройка страницы ошибки аутентификации
                        .permitAll() // Разрешаем доступ к форме логина
                )
                .logout(logout -> logout
                        .logoutUrl("/logout") // Выход (если потребуется)
                        .permitAll()
                );

        return http.build();
    }
}