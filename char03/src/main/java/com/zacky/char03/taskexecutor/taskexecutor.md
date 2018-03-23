### Spring 多线程
1. 利用 @EnableAsync 注解开启异步任务支持
2. 实现AsyncConfigurer 接口并重写 getAsyncExecutor 方法，返回一个
ThreadPoolTaskExecutor,这样就获得了一个基于线程池TaskExecutor。

3. @Async 注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步，
方法会自动被注入使用ThreadPoolExecute 作为 TaskExecutor。