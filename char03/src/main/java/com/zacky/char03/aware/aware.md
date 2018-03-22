###Spring Aware
当项目中使用到Spring容器本身的功能资源，这是你的Bean必须要意识到Spring容器的存在，才
能调用Spring所提供的资源，这就是Spring Aware。一般来讲，这是内部使用的，当你使用后，
你的bean将会和Spring框架耦合。

###目的
让Bean获取Spring容器的服务，因为ApplicationContext接口集成了MessageSource、
ApplicationEventPublisher、ResourceLoader接口。