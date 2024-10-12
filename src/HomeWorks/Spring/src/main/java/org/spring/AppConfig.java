package org.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    public Parent parent() {
        return new Parent(child());
    }

    @Bean
    public Child child() {
        return new Child();
    }
}
