package com.zacky.char01.javaconfig;

/**
 * 同样没有@Service声明bean，和@Autowired注入bean
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
