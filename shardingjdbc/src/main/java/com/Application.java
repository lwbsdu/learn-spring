package com;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author liuwenbin
 * @date 2020-04-27
 */

@SpringBootApplication
@MapperScan("com.sharding")
public class Application {
    
    /**
     * @author liuwenbin
     * @date 2020-04-27
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
