package com.qwe.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(User.class);
        context.refresh();
        User bean = context.getBean(User.class);
        System.out.println(bean);


    }
}
