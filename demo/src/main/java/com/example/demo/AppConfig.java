package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean // <bean id="livro" class="com.example.demo.Livro"/>
    public Livro getLivro(){
        return new Livro();
    }

    @Bean // <bean id="livro" class="com.example.demo.Livro"/>
    public AutorLivro getAutorLivro(){
        return new Autor();
    }

}
