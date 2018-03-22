package com.zacky.char02.prepost;

public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("init construct BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }

}
