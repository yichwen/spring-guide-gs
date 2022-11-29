package io.bamu.spring.cloud.loadbalancer.user.config;

import io.bamu.spring.cloud.loadbalancer.config.SayHelloConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@LoadBalancerClients(value = {
        @LoadBalancerClient(name = "say-hello", configuration = { SayHelloConfiguration.class }),
//        @LoadBalancerClient(name = "new-hello")
})
public class LoadBalancerClientConfiguration {

    @Configuration
    @ConditionalOnClass(RestTemplate.class)
    public static class RestTemplateConfiguration {

        @LoadBalanced
        @Bean
        RestTemplate restTemplate() {
            return new RestTemplate();
        }

//        @Bean
//        RestTemplateController restTemplateController(RestTemplate restTemplate) {
//            return new RestTemplateController(restTemplate);
//        }
    }

//    @Configuration
//    @ConditionalOnClass(WebClient.class)
//    public static class WebClientConfiguration {
//
//        @LoadBalanced
//        @Bean
//        WebClient.Builder webClientBuilder() {
//            return WebClient.builder();
//        }
//
//        @Bean
//        WebClientController webClientController(WebClient.Builder builder, ReactorLoadBalancerExchangeFilterFunction lbFunction) {
//            return new WebClientController(builder, lbFunction);
//        }
//    }

}
