package ua.vkutsovol.hibernate.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
