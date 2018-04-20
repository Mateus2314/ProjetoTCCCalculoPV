package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model;
/**
* Classe que representa a entidade de usuario
        */
public class Usuario {

    private long id;
    private String nome;
    private String email;
    private String contaener;

    public Usuario(){

    }

    public Usuario(String nome, String email,String contaener) {
        super();
        this.nome = nome;
        this.email = email;
        this.contaener = contaener;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContaener(){ return contaener;}

    public void setContaener(String contaener){this.contaener =contaener;}


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", contaener='" + contaener + '\'' +
                '}';
    }
}