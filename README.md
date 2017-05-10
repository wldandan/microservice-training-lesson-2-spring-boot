### 第2课 SpringBoot 101

#### 核心知识点

* Spring Boot 101
* Spring Boot的核心
	* 通过Starter定义依赖
	* 内嵌的WebServer(Tomcat/Jetty/Undertow)
	* 通过注解的方式/一行代码启动应用
	* 自动配置和装载机制
	* @Configuration/@EnableAutoConfiguration/@ComponentScan

### 安装SpringBoot CLI

* Mac平台

	* 安装[SDKMan](http://sdkman.io)

* Windows 平台

	* [Install Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html#getting-started-manual-cli-installation)

### SpringBoot热身

运行如下命令：

```
spring run WebApp.groovy
spring jar hello-world.jar WebApp.groovy
java -jar hello-world.jar
```

### 其他

本代码来源于《微服务架构与实践》视频课，更多内容请访问[详情](http://www.stuq.org/course/1149)