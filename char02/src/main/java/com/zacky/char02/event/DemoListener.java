package com.zacky.char02.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();

        System.out.println("I(bean - demoListener) receive from (bean - " +
                "demoPublisher) message:" + msg);
    }
}
