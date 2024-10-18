package br.com.ideao.javabasedcontainer.config;

import br.com.ideao.javabasedcontainer.domain.MovieFinder;
import br.com.ideao.javabasedcontainer.domain.SimpleMovieLister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public SimpleMovieLister simpleMovieLister() {
        return new SimpleMovieLister();
    }

    @Bean
    public MovieFinder movieFinder() {
        return new MovieFinder();
    }
}
