package tech.silink.cloud.wow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WowApplication {

    public static void main(String[] args) {
        SpringApplication.run(WowApplication.class, args);
    }

    @Value("${profile}")
    String profile;

    @RequestMapping("/")
    public String profile(){
        return profile;
    }


}
