package com.example.models.entity;

import com.example.models.enums.Titulacao;

public class Orientador extends Pessoa {
    private Titulacao titulacao;

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public Orientador(String nome, String cpf, String email, Titulacao titulacao) {
        super(nome, cpf, email);
        this.titulacao = titulacao;
    }

    public Orientador(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
    

    
}
