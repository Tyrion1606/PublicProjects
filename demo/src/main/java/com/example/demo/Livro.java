package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro implements AutorLivro{

    private String name;
    private String code;

    @Autowired
    AutorLivro autorLivro;
    public AutorLivro getAutorLivro() {return autorLivro;}
    public void setAutorLivro(AutorLivro autorLivro) {this.autorLivro = autorLivro;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}

    public void show() {
        System.out.println(this.name + " - " + this.code);
        autorLivro.show();
    }
}
