package io.bamu.spring.cloud.loadbalancer.user.controller;

import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@ResponseBody
public class WebClientController {

//    private WebClient.Builder builder;
//    private ReactorLoadBalancerExchangeFilterFunction lbFunction;
//
//    public WebClientController(WebClient.Builder builder, ReactorLoadBalancerExchangeFilterFunction lbFunction) {
//        this.builder = builder;
//        this.lbFunction = lbFunction;
//    }
//
//    @RequestMapping("/")
//    public Mono<String> root() {
//        return builder.build().get().uri("http://say-hello/")
//                .retrieve().bodyToMono(String.class);
//    }

//    @RequestMapping("/hi")
//    public Mono<String> hi(@RequestParam(value = "name", defaultValue = "Mary") String name) {
//        return builder.build().get().uri("http://say-hello/greeting")
//                .retrieve().bodyToMono(String.class)
//                .map(greeting -> String.format("%s, %s!", greeting, name));
//    }

//    @RequestMapping("/hello")
//    public Mono<String> hello(@RequestParam(value = "name", defaultValue = "John") String name) {
//        return WebClient.builder()
//                .filter(lbFunction)
//                .build().get().uri("http://say-hello/greeting")
//                .retrieve().bodyToMono(String.class)
//                .map(greeting -> String.format("%s, %s!", greeting, name));
//    }

}
