package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrandServiceApplication {


    public static void main(String[] args) {
        System.out.println("品牌启动");
        SpringApplication.run(BrandServiceApplication.class,args);
    }
}
