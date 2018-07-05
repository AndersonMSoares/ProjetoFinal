/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Mozãooooo
 */
public class Cidade extends Estado {
    
    int id_cidade;
    String nome_cidade;
    int qtde_habitantes_cidade;
    Estado estado;

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

  

    public int getQtde_habitantes_cidade() {
        return qtde_habitantes_cidade;
    }

    public void setQtde_habitantes_cidade(int qtde_habitantes_cidade) {
        this.qtde_habitantes_cidade = qtde_habitantes_cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

     

    
}
