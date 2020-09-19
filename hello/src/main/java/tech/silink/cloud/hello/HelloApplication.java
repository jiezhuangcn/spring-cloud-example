package tech.silink.cloud.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableResourceServer
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello";
    }

    @GetMapping("/me")
    public Object getCurrentUser(Authentication authentication) {
        return authentication.getPrincipal();
    }

}
