package org.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Parent parent = context.getBean(Parent.class);
        parent.callChildMethod();
        context.close();
    }
}