package com.zacky.char01.di;

import org.springframework.stereotype.Service;

/**
 * 基于注解的Bean的初始化和依赖注入
 */

@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word;
    }
}
