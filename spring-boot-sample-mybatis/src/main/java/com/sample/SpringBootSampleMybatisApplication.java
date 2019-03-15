package com.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//String[] basePackages() default {}; 扫描 mapper接口 代替 @Mapper
@MapperScan(basePackages = {"com.*.userdao", "com.*.roledao"})
public class SpringBootSampleMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleMybatisApplication.class, args);
    }

}
