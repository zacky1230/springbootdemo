package com.zacky.char02.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("prod");//set profile prod
        context.getEnvironment().setActiveProfiles("dev");//set profile dev
        context.register(ProfileConfig.class);//register bean
        context.refresh();//refresh container

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
