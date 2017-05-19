package com.app;

import com.app.configuration.MyBatisConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableConfigurationProperties(MyBatisConfiguration.class)
@MapperScan("com.app.mapper.*Mapper")
public class SpringbootsampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsampleApplication.class, args);
    }
}
