package org.example.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer(@RequestParam String name) {
        // 请求并获取结果（springcloud-nacos-provider 为 Nacos 服务id）
        String result = restTemplate.getForObject("http://springcloud-nacos-provider/call/" + name, String.class);
        return result;
    }
}
