package com.ohc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/23 21:23
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id){
        return "nacos registry, serverPort: " + serverPort + "\t id: " + id;
    }

}
