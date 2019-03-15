# spring-boot + oracle + mybatis + druid

maven 配置
```
<!--mybatis-->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>1.3.3</version>
</dependency>
<!--druid-->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid-spring-boot-starter</artifactId>
    <version>1.1.10</version>
</dependency>
<!--driver-->
<dependency>
    <groupId>com.oracle</groupId>
    <artifactId>ojdbc14</artifactId>
    <version>10.2.0.1.0</version>
</dependency>
```
application.properties

```$xslt
#MYBATIS 多路径 mapper.xml 配置，适用 spring-mvc 项目迁移
mybatis.type-aliases-package=com.sample.bean

# mybatis.mapper-locations=classpath*:com/**/dao/*Mapper.xml,mapper/*Mapper.xml 可以实现
# mybatis.mapper-locations=classpath*:mapper/*Mapper.xml,com/**/dao/*Mapper.xml 路径反过来报错

mybatis.mapper-locations[0]=classpath*:com/**/dao/*Mapper.xml  #注意 classpath*
mybatis.mapper-locations[1]=classpath*:mapper/*Mapper.xml

mybatis.configuration.map-underscore-to-camel-case=true
mybatis.configuration.use-generated-keys=true
mybatis.configuration.default-fetch-size=100
mybatis.configuration.default-statement-timeout=30
```
Mapper
- @Mapper 方式
```$xslt
//在 mapper接口加
@Mapper
public interface RoleMapper {
    Role findById(String roleId);
}
```
- @MapperScan 方式
```$xslt
@MapperScan(basePackages = {"com.*.userdao", "com.*.roledao"})
public class SpringBootSampleMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleMybatisApplication.class, args);
    }
}
```