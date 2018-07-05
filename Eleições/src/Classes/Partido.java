/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;

/**
 *
 * @author Mozãooooo
 */
public class Partido {
    
    int id_partido;
    String data_criacao_partido;
    String nome_fundador_partido;
    String nome_partido;

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public String getData_criacao_partido() {
        return data_criacao_partido;
    }

    public void setData_criacao_partido(String data_criacao_partido) {
        this.data_criacao_partido = data_criacao_partido;
    }

    public String getNome_fundador_partido() {
        return nome_fundador_partido;
    }

    public void setNome_fundador_partido(String nome_fundador_partido) {
        this.nome_fundador_partido = nome_fundador_partido;
    }
    
    public String getNome_partido() {
        return nome_partido;
    }

    public void setNome_partido(String nome_partido) {
        this.nome_partido = nome_partido;
    }
    
}
