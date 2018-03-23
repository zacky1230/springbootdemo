package com.zacky.char03.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.zacky.char03.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
