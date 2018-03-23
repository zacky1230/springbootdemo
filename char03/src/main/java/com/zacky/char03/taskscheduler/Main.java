package com.zacky.char03.taskscheduler;

import com.zacky.char03.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
