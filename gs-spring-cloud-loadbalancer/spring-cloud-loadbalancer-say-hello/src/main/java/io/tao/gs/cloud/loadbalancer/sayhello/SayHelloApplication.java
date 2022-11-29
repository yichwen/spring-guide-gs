package io.bamu.spring.cloud.loadbalancer.sayhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.SocketException;
import java.util.*;

@RestController
@SpringBootApplication
public class SayHelloApplication {

    private static Logger log = LoggerFactory.getLogger(SayHelloApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SayHelloApplication.class, args);
    }

    @GetMapping("/greeting")
    public String greet() {
        log.info("Access /greeting");

        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        Random rand = new Random();

        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }

    @GetMapping("/")
    public String home(HttpServletRequest request) throws SocketException {
        log.info("Access /");
        return request.getRequestURL().toString();
    }

}
