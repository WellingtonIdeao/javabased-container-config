package br.com.ideao.javabasedcontainer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("br.com.ideao.javabasedcontainer")
public class AppConfig {

}
