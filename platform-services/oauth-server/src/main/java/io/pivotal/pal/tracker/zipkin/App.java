package io.pivotal.pal.tracker.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

@SpringBootApplication
@ComponentScan("io.pivotal.pal.tracker.zipkin")
public class App extends AuthorizationServerConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}