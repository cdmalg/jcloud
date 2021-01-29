package com.jcloud;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JiangHuiTao
 * @date 2021/1/29
 */
@EnableDubbo
@SpringBootApplication
public class J1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1ServiceApplication.class, args);
    }
}
