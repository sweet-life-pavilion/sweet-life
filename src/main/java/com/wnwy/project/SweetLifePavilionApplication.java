package com.wnwy.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wnwy.project.mapper")
@SpringBootApplication
public class SweetLifePavilionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetLifePavilionApplication.class, args);
    }

}
