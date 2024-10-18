package br.com.ideao.javabasedcontainer;

import br.com.ideao.javabasedcontainer.config.AppConfig;
import br.com.ideao.javabasedcontainer.domain.SimpleMovieLister;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args ) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleMovieLister simpleMovieLister = context.getBean(SimpleMovieLister.class);
        System.out.println(simpleMovieLister);
        context.registerShutdownHook();
    }
}
