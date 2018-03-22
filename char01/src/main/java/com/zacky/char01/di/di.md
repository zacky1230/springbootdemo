### 依赖注入
#### 目的
主要是实现解耦，体现一种“组合”的概念。相比较继承，组合可以使耦合度大大降低。

Spring IoC 容器（ApplicationContext）负责创建 Bean，通过容器将功能 Bean 注入到需要的
Bean 中。

方式有： xml、注解、Java配置实现Bean的创建和注入。

声明Bean的注解：@Component、@Service、@Repository、@Controller
注入Bean的注解：@Autowired、@Inject、@Resource

@Configuration 声明当前类是一个配置类，使用 @ComponentScan 自动扫描包下所有使用声明
Bean 注解，并注册为Bean

@AnnotationConfigApplicationContext 作为 Spring容器，接受输入一个配置类作为参数
