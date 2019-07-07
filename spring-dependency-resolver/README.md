# DEPENDENCY RESOLVER
Every developer either they're experienced or beginner should have gone through finding solution for resolving dependencies when 2 different class implements same interface.

Dependencies can be resolved in 3 ways. <br>
1. ````ByName```` - Spring framework tries to inject the bean using the name explicitly specified over each component/bean.<br>
2. ````ByType```` - Default One and It looks for bean defined in container, if bean of the type not found then throws exception.<br>
3. ````ByQualifiers```` - @Qualifiers takes input value string which is nothing but the qualified name of the bean to resolve dependencies.<br>

Read More On >> https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-autowired-annotation-qualifiers

### Local Setup
1. Add spring core libraries in to classpath.
2. Run like any other java application.
