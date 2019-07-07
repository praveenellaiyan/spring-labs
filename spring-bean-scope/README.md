# SCOPE OF BEAN
Bean scope depicts the visibility of the bean from container through out the application life cycle.

````
Below are the list of bean scope offered by spring framework.
````

1. ``singleton`` - (Default) Scopes a single bean definition to a single object instance per Spring IoC container.<br>
2. ``prototype`` - Scopes a single bean definition to any number of object instances.<br>
3. ``request`` - Scopes a single bean definition to the lifecycle of a single HTTP request; that is, each HTTP request has its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.<br>
4. ``session`` - Scopes a single bean definition to the lifecycle of an HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.<br>
5. ``application`` - Scopes a single bean definition to the lifecycle of a ServletContext. Only valid in the context of a web-aware Spring ApplicationContext.<br>
6. ``websocket`` - Scopes a single bean definition to the lifecycle of a WebSocket. Only valid in the context of a web-aware Spring ApplicationContext.<br>

Read More On >> https://docs.spring.io/spring/docs/5.0.0.RELEASE/spring-framework-reference/core.html#beans-factory-scopes

### Local Setup
1. Add spring core libraries in to classpath.
2. Run like any other java application.
