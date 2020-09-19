package tech.silink.cloud.world;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class HelloService {

    private final OAuth2RestTemplate restTemplate;

    public HelloService(OAuth2RestTemplate rest) {
        this.restTemplate = rest;
    }

//    @HystrixCommand(fallbackMethod = "fallback")
    public String get() {
        URI uri = URI.create("http://hello/");

        return this.restTemplate.getForObject(uri, String.class);
    }

    public String fallback() {
        return "Sorry";
    }

}
