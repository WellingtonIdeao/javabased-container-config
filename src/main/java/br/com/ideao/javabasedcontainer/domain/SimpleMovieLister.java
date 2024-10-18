package br.com.ideao.javabasedcontainer.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class SimpleMovieLister {

    @Autowired
    private MovieFinder movieFinder;

    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "movieFinder=" + movieFinder +
                '}';
    }
}
