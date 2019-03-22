/**
 * Created by yang on 2019/3/22.
 */
Spring Cloud Config为分布式系统中的外部配置提供服务器和客户端支持。使用Config Server，您可以在所有环境中管理应用程序的外部属性。客户端和服务器上的概念映射与Spring Environment和PropertySource抽象相同，因此它们与Spring应用程序非常契合，但可以与任何以任何语言运行的应用程序一起使用。随着应用程序通过从开发人员到测试和生产的部署流程，您可以管理这些环境之间的配置，并确定应用程序具有迁移时需要运行的一切。服务器存储后端的默认实现使用git，因此它轻松支持标签版本的配置环境，以及可以访问用于管理内容的各种工具。很容易添加替代实现，并使用Spring配置将其插入。


# 简而言之 这是一个config service 负责提供动态配置的信息给订阅了他的其他服务节点。


HTTP服务具有以下格式的资源：

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

#配置的时候可以依照label大分 profile 进行环境的分配 比如 dev环境的配置文件都放在dev分支 里面都是dev的配置文件

Spring Cloud Config服务器从git存储库（必须提供）为远程客户端提供配置：

spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/spring-cloud-samples/config-repo
          这个uri地址就是从git上建的地址
          
 客户端:bootstrap.yml 配置如下表明 配置信息从service端进行拿取
          spring:
            application:
              name: producer
            cloud:
              config:
                name: user-producer 相当于{application}
                label: master     
          #      profile: test
                enabled: true
                fail-fast: false
                retry:
                  max-attempts: 6
              bus:
                trace:
                  enabled: true