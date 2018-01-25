package fr.alexisvachard.my.personnal.web.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("fr.alexisvachard.my.personnal.web.site")
@EnableJpaRepositories(basePackages = "fr.alexisvachard.my.personnal.web.site")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}