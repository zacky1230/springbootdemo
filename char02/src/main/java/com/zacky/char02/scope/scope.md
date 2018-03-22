### Scope
描述Spring容器如何新建Bean的实例

1. Singleton:一个容器只有一个实例，默认，共享
2. Prototype:每次调用新建一个Bean的实例
3. Request:给http request新建一个bean的实例
4. Session:给http session新建一个bean的实例
5. GlobalSession
6. StepSession:批处理