package br.com.ideao.javabasedcontainer.domain;

import org.springframework.beans.factory.annotation.Value;


public class MovieFinder {

    @Value("${moviefinder.name:defaultMovie}")
    private String name;


    @Override
    public String toString() {
        return "MovieFinder{" +
                "name='" + name + '\'' +
                '}';
    }
}
