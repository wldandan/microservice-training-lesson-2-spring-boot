### SpringBoot介绍

* 快速构建可运行的应用

	* 无XML配置
	* 内嵌的WebServer(Tomcat/Jetty/Undertow)
	* 通过注解的方式/一行代码启动应用

* 自动配置和装载机制

	* 通过Starter定义依赖
	* 自动配置和装载依赖

* 运维接口友好

	* Metrics/health显示健康监控状态
	* Trace/dump显示调用/调试信息

### 安装SpringBoot CLI

* Mac平台

	* 安装[SDKMan](http://sdkman.io)

* Windows 平台

	* [Install Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html#getting-started-manual-cli-installation)

### 热身Groovy

本例中，运行如下命令：

```
spring run WebApp.groovy
spring jar hello-world.jar WebApp.groovy
java -jar hello-world.jar
```

### SpringBoot核心

* @Configuration
* @EnableAutoConfiguration
* @ComponentScan


### 其他

本代码来源于《微服务架构与实践》视频课，更多内容请访问[详情](http://www.stuq.org/course/1149)

![微服务架构与实践](/images/2nd-intro.png)
![微服务架构与实践](/images/content.png)
