# DEPENDENCY INJECTION

Spring Framework's <B>Inversion Of Control(IoC)</B> principle is achieved through <B>Dependency Injetion(DI)</B>. DI get rids of individual to define dependencies and switch the tradition control of objects. Here with DI the framework itself take over control of creating dependent objects through its container.

Three type of Injection Exist. <BR>
1. ````Constructor Injection```` - Dependencies Injected during instantiation of the bean<BR>
2. ````Setter Injection```` - Dependencies Injected by calling setter method of the class<BR>
3. ````Field Injection```` - Using @Autowired annotation offered by spring framework field injection can be accomplished.<BR>

Read More On >> https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-dependencies

### Local Setup
1. Add spring core libraries in to classpath.
2. Run like any other simple java application.
