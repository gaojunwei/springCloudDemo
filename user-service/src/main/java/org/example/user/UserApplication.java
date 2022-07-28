package org.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    /**
     * 为客户端提供可调用的接口
     */
    @RequestMapping("/call/{name}")
    public String call(@PathVariable String name) {
        System.out.println("服务被调用 "+name);
        return "I'm Provider. Received a message from: " + name;
    }
}