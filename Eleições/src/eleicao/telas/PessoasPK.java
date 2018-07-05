/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao.telas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Mozãooooo
 */
@Embeddable
public class PessoasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cpf_pessoas")
    private int cpfPessoas;
    @Basic(optional = false)
    @Column(name = "Cidade_id_cidade")
    private int cidadeidcidade;

    public PessoasPK() {
    }

    public PessoasPK(int cpfPessoas, int cidadeidcidade) {
        this.cpfPessoas = cpfPessoas;
        this.cidadeidcidade = cidadeidcidade;
    }

    public int getCpfPessoas() {
        return cpfPessoas;
    }

    public void setCpfPessoas(int cpfPessoas) {
        this.cpfPessoas = cpfPessoas;
    }

    public int getCidadeidcidade() {
        return cidadeidcidade;
    }

    public void setCidadeidcidade(int cidadeidcidade) {
        this.cidadeidcidade = cidadeidcidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cpfPessoas;
        hash += (int) cidadeidcidade;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoasPK)) {
            return false;
        }
        PessoasPK other = (PessoasPK) object;
        if (this.cpfPessoas != other.cpfPessoas) {
            return false;
        }
        if (this.cidadeidcidade != other.cidadeidcidade) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eleicao.telas.PessoasPK[ cpfPessoas=" + cpfPessoas + ", cidadeidcidade=" + cidadeidcidade + " ]";
    }
    
}
