package com.fh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.product.mapper")
public class ShopCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopCloudApplication.class, args);
    }

}
