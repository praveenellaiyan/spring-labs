# SPRING SECURITY

Spring security lets you to add authentication and authorization layer on top of your web application. It support you to integrate with various security provider like LDAP, SSO etc through simple configuration. 

## Problem
Demonstrate spring security by configuring custom credentials using InMemory Authentication and also add authorization to restrict access to end points based on roles associated with each user.

## Solution
Add `spring-boot-starter-security` dependency on to your project.<br>
````
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>
````
<br>The moment you add it, spring does the below list of magic and even more by default.<br>
a. Automatically secure all of the end points<br>
b. Create default login form - `/login`<br>
![spring-default-login-page](https://user-images.githubusercontent.com/36845597/64909014-59638680-d724-11e9-818f-55cbfa43bf00.png)
<br>c. Restrict user who aren't legitimate to access application<br>
![spring-security-default-authentication](https://user-images.githubusercontent.com/36845597/64909041-a6475d00-d724-11e9-845b-1b511186c66a.png)
<br>d. Adds logout functionality as well - `/logout`<br>
![spring-security-default-logout-confirmation-popup](https://user-images.githubusercontent.com/36845597/64909060-d4c53800-d724-11e9-9ffa-3dfb42dd14d0.png)
<br>
![spring-security-logout-page](https://user-images.githubusercontent.com/36845597/64909116-a5fb9180-d725-11e9-9472-f8beb5f34c52.png)

### InMemory Authentication
InMemory authentication can be implemented by either defining a UserDetailsService bean or by overriding `configure(AuthenticationManagerBuider)` method.<br>
Example:<br>
````
@Bean
protected UserDetailsService userDetailsService() {
  UserBuilder users = User.builder();
  InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
  userDetailsManager.createUser(users.username("user").password("{noop}supersecret").roles("ADMIN").build());
  return userDetailsManager;
}
````
> {noop} let spring to know that password shouldn't be encoded.

<br>By leveraging InMemory Authentication you can bypass setting up actual database instance.

### Configure Authorization
Authorization lets you to restrict access to resources based on the roles associated with each user.<br>
To do this,<br> 
Define a component with spring security support by using `@EnableWebSecurity` annotation and extend `WebSecurityConfigurerAdapter` to override some of the methods to configure authorization as below.<br>
````
@Override
protected void configure(HttpSecurity http) throws Exception {
	http
		.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/user").hasAnyRole("ADMIN", "USER")
			.and()
		.formLogin();
}
````

Read more on
> https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#jc-httpsecurity