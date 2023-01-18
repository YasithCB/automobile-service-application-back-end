package lk.automobile.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * author  Yasith C Bandara
 * created 1/18/2023 - 5:58 PM
 * project Automobile-Service-WebApp
 */
@Configuration
@ComponentScan(basePackages = "lk.automobile.spring.controller")
@EnableWebMvc
public class WebAppConfig {
}
