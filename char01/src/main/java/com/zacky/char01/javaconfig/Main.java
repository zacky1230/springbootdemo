package com.zacky.char01.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean
                (UseFunctionService.class);
        useFunctionService.SayHello("java config");
        context.close();
    }
}
