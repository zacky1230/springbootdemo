package com.zacky.char01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zacky.char01.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
