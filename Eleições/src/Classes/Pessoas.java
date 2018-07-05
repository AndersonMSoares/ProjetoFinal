/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.Cidade;
import Classes.Estado;

/**
 *
 * @author Mozãooooo
 */
public class Pessoas extends Cidade {

    String nome_pessoas;
    int cpf_pessoas;
    int titulo_de_eleitor_pessoas;
    int idade_pessoas;
    Cidade cidade;

    
    public String getNome_pessoas() {
        return nome_pessoas;
    }

    public void setNome_pessoas(String nome_pessoas) {
        this.nome_pessoas = nome_pessoas;
    }

    public int getCpf_pessoas() {
        return cpf_pessoas;
    }

    public void setCpf_pessoas(int cpf_pessoas) {
        this.cpf_pessoas = cpf_pessoas;
    }

    public int getTitulo_de_eleitor_pessoas() {
        return titulo_de_eleitor_pessoas;
    }

    public void setTitulo_de_eleitor_pessoas(int titulo_de_eleitor_pessoas) {
        this.titulo_de_eleitor_pessoas = titulo_de_eleitor_pessoas;
    }

    public int getIdade_pessoas() {
        return idade_pessoas;
    }

    public void setIdade_pessoas(int idade_pessoas) {
        this.idade_pessoas = idade_pessoas;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getRegiao_estado() {
        return regiao_estado;
    }

    public void setRegiao_estado(String regiao_estado) {
        this.regiao_estado = regiao_estado;
    }
    
   

    
    
}
