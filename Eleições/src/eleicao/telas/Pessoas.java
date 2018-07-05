/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao.telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mozãooooo
 */
@Entity
@Table(name = "pessoas", catalog = "eleicao", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pessoas.findAll", query = "SELECT p FROM Pessoas p"),
    @NamedQuery(name = "Pessoas.findByNomePessoas", query = "SELECT p FROM Pessoas p WHERE p.nomePessoas = :nomePessoas"),
    @NamedQuery(name = "Pessoas.findByCpfPessoas", query = "SELECT p FROM Pessoas p WHERE p.pessoasPK.cpfPessoas = :cpfPessoas"),
    @NamedQuery(name = "Pessoas.findByTituloDeEleitorPessoas", query = "SELECT p FROM Pessoas p WHERE p.tituloDeEleitorPessoas = :tituloDeEleitorPessoas"),
    @NamedQuery(name = "Pessoas.findByIdadePessoas", query = "SELECT p FROM Pessoas p WHERE p.idadePessoas = :idadePessoas"),
    @NamedQuery(name = "Pessoas.findByCidadeidcidade", query = "SELECT p FROM Pessoas p WHERE p.pessoasPK.cidadeidcidade = :cidadeidcidade")})
public class Pessoas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PessoasPK pessoasPK;
    @Basic(optional = false)
    @Column(name = "nome_pessoas")
    private String nomePessoas;
    @Basic(optional = false)
    @Column(name = "titulo_de_eleitor_pessoas")
    private int tituloDeEleitorPessoas;
    @Column(name = "idade_pessoas")
    private Integer idadePessoas;

    public Pessoas() {
    }

    public Pessoas(PessoasPK pessoasPK) {
        this.pessoasPK = pessoasPK;
    }

    public Pessoas(PessoasPK pessoasPK, String nomePessoas, int tituloDeEleitorPessoas) {
        this.pessoasPK = pessoasPK;
        this.nomePessoas = nomePessoas;
        this.tituloDeEleitorPessoas = tituloDeEleitorPessoas;
    }

    public Pessoas(int cpfPessoas, int cidadeidcidade) {
        this.pessoasPK = new PessoasPK(cpfPessoas, cidadeidcidade);
    }

    public PessoasPK getPessoasPK() {
        return pessoasPK;
    }

    public void setPessoasPK(PessoasPK pessoasPK) {
        this.pessoasPK = pessoasPK;
    }

    public String getNomePessoas() {
        return nomePessoas;
    }

    public void setNomePessoas(String nomePessoas) {
        String oldNomePessoas = this.nomePessoas;
        this.nomePessoas = nomePessoas;
        changeSupport.firePropertyChange("nomePessoas", oldNomePessoas, nomePessoas);
    }

    public int getTituloDeEleitorPessoas() {
        return tituloDeEleitorPessoas;
    }

    public void setTituloDeEleitorPessoas(int tituloDeEleitorPessoas) {
        int oldTituloDeEleitorPessoas = this.tituloDeEleitorPessoas;
        this.tituloDeEleitorPessoas = tituloDeEleitorPessoas;
        changeSupport.firePropertyChange("tituloDeEleitorPessoas", oldTituloDeEleitorPessoas, tituloDeEleitorPessoas);
    }

    public Integer getIdadePessoas() {
        return idadePessoas;
    }

    public void setIdadePessoas(Integer idadePessoas) {
        Integer oldIdadePessoas = this.idadePessoas;
        this.idadePessoas = idadePessoas;
        changeSupport.firePropertyChange("idadePessoas", oldIdadePessoas, idadePessoas);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pessoasPK != null ? pessoasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoas)) {
            return false;
        }
        Pessoas other = (Pessoas) object;
        if ((this.pessoasPK == null && other.pessoasPK != null) || (this.pessoasPK != null && !this.pessoasPK.equals(other.pessoasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eleicao.telas.Pessoas[ pessoasPK=" + pessoasPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
