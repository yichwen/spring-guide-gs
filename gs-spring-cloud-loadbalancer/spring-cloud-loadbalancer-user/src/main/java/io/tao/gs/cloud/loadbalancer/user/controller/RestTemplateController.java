package io.bamu.spring.cloud.loadbalancer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    private RestTemplate restTemplate;
    // do not know how this to be used with RestTemplate
//    private ReactorLoadBalancerExchangeFilterFunction lbFunction;

    @Autowired
    public RestTemplateController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/")
    public String root() {
        String url = "http://say-hello/";
        return restTemplate.getForObject(url, String.class);
    }

    @RequestMapping("/new-hello")
    public String newHello() {
        String url = "http://new-hello/";
        return restTemplate.getForObject(url, String.class);
    }

//    @RequestMapping("/lb")
//    public String lb() {
//    }
}
