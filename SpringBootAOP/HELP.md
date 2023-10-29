# Getting Started

## what
SpringAOP的实现方法响应日志记录，流程如下：
1. 创建日志对象SysLog。
2. 创建切面对象LogAspect，使用@Aspect标注，对象内使用@Pointcut确定哪些方法需要执行aop，@around表示chi'zhi。
3. @Pointcut中通常用切面表达式，但是这里用了@annotation，表示在自定义注释@Log下需要执行aop。

## pits
1. jdbc template中sql语句的编写，那些属性名通过反射进行注入，mysql中id主键需要自增。 
2. Java中Date的使用，向mysql中插入的是java.util.Date。
3. @RestController 如果只是接口，那么就用 RestController 来注解. 例如前端页面全部使用了 Html、Jquery来开发，
通过 Ajax 请求服务端接口，那么接口就使用 @RestController 统一注解。 @Controller 一般应用在有返回界面的应用场景下. 
例如，管理后台使用了 thymeleaf 作为模板开发，需要从后台直接返回 Model 对象到前台，那么这时候就需要使用 @Controller 来注解。

## reference
[reference blog](https://mrbird.cc/Spring-Boot-AOP%20log.html)

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.13/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.13/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.13/reference/htmlsingle/#web)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)




