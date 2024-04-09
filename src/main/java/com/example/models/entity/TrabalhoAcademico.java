package com.example.models.entity;

import java.util.List;

public class TrabalhoAcademico {
    private String titulo;
    private String descricao;
    private String resumo;
    private Integer dataEntrega;
    private List <Autor> autores;
    private List<String> palavrasChave;
    private Orientador orientador;
    
    

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public Integer getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(Integer dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public List<Autor> getAutores() {
        return autores;
    }
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    public List<String> getPalavrasChave() {
        return palavrasChave;
    }
    public void setPalavrasChave(List<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
    public Orientador getOrientador() {
        return orientador;
    }
    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    } 
        // contrutores
    public TrabalhoAcademico( ) {
    }
    public TrabalhoAcademico(String titulo, String descricao, String resumo, Integer dataEntrega, List<Autor> autores,
            List<String> palavrasChave, Orientador orientador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.resumo = resumo;
        this.dataEntrega = dataEntrega;
        this.autores = autores;
        this.palavrasChave = palavrasChave;
        this.orientador = orientador;
    }
    

    
}
