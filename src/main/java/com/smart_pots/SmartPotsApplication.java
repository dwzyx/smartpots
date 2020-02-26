package com.smart_pots;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.smart_pots.dao")
@EnableCaching
@ServletComponentScan
@SpringBootApplication(scanBasePackages ={ "com.smart_pots.controller","com.smart_pots.service","com.smart_pots.dao"})
public class SmartPotsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartPotsApplication.class, args);
    }

}
