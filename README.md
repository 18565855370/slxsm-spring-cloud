# slxsm-spring-cloud
项目为自己平时练习记录以及以后复习，也欢迎其他同僚意见

学习过程通常是学了忘忘了学，不记笔记往往效果不好，故此在这里做好笔记，提高自己。

spring cloud项目自带了注册中心eureka，由于所有微服务都需要注册到注册中心
> 单机启动命令 java -jar eureka-server-spring-cloud.jar <br/>
> 集群启动方式1:java -jar -Dspring.profile.active=cluster eureka-server-spring-cloud.jar <br/>
> 集群启动方式2:java -jar -Dserver.port=...,Deureka... eureka-server-spring-cloud.jar
