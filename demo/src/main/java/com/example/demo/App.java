package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);

        livro.setName("[nome do livro]");
        livro.setCode("[codigo do livro]");

        Autor autor = factory.getBean(Autor.class);
        autor.setName("[Nome do Autor]");

        livro.show();

        ((AbstractApplicationContext) factory).close();
    }

}
