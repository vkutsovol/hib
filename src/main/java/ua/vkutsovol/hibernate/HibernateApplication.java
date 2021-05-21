package ua.vkutsovol.hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Map;

@SpringBootApplication
public class HibernateApplication {

    private static final Logger log = LoggerFactory.getLogger(HibernateApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(HibernateApplication.class, args);

//        for (String name : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
    }

    @Bean
    public CommandLineRunner demo() {
        return (args -> {
            log.info("AAA");
            System.out.println("BBB");
        });
    }

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        RequestMappingHandlerMapping requestMappingHandlerMapping = applicationContext
                .getBean("requestMappingHandlerMapping", RequestMappingHandlerMapping.class);
        Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping
                .getHandlerMethods();
        map.forEach((key, value) -> log.info("{} {}", key, value));
    }
}
