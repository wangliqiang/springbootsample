package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@MapperScan("com.app.mapper.*Mapper")
public class SpringbootsampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsampleApplication.class, args);
    }
}
