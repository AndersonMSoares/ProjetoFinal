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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mozãooooo
 */
@Entity
@Table(name = "partido", catalog = "eleicao", schema = "")
@NamedQueries({
    @NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p"),
    @NamedQuery(name = "Partido.findByIdPartido", query = "SELECT p FROM Partido p WHERE p.idPartido = :idPartido"),
    @NamedQuery(name = "Partido.findByDataCriacaoPartido", query = "SELECT p FROM Partido p WHERE p.dataCriacaoPartido = :dataCriacaoPartido"),
    @NamedQuery(name = "Partido.findByNomeFundadorPartido", query = "SELECT p FROM Partido p WHERE p.nomeFundadorPartido = :nomeFundadorPartido"),
    @NamedQuery(name = "Partido.findByNomePartido", query = "SELECT p FROM Partido p WHERE p.nomePartido = :nomePartido")})
public class Partido implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_partido")
    private Integer idPartido;
    @Basic(optional = false)
    @Column(name = "data_criacao_partido")
    private String dataCriacaoPartido;
    @Basic(optional = false)
    @Column(name = "nome_fundador_partido")
    private String nomeFundadorPartido;
    @Basic(optional = false)
    @Column(name = "nome_partido")
    private String nomePartido;

    public Partido() {
    }

    public Partido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public Partido(Integer idPartido, String dataCriacaoPartido, String nomeFundadorPartido, String nomePartido) {
        this.idPartido = idPartido;
        this.dataCriacaoPartido = dataCriacaoPartido;
        this.nomeFundadorPartido = nomeFundadorPartido;
        this.nomePartido = nomePartido;
    }

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        Integer oldIdPartido = this.idPartido;
        this.idPartido = idPartido;
        changeSupport.firePropertyChange("idPartido", oldIdPartido, idPartido);
    }

    public String getDataCriacaoPartido() {
        return dataCriacaoPartido;
    }

    public void setDataCriacaoPartido(String dataCriacaoPartido) {
        String oldDataCriacaoPartido = this.dataCriacaoPartido;
        this.dataCriacaoPartido = dataCriacaoPartido;
        changeSupport.firePropertyChange("dataCriacaoPartido", oldDataCriacaoPartido, dataCriacaoPartido);
    }

    public String getNomeFundadorPartido() {
        return nomeFundadorPartido;
    }

    public void setNomeFundadorPartido(String nomeFundadorPartido) {
        String oldNomeFundadorPartido = this.nomeFundadorPartido;
        this.nomeFundadorPartido = nomeFundadorPartido;
        changeSupport.firePropertyChange("nomeFundadorPartido", oldNomeFundadorPartido, nomeFundadorPartido);
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) {
        String oldNomePartido = this.nomePartido;
        this.nomePartido = nomePartido;
        changeSupport.firePropertyChange("nomePartido", oldNomePartido, nomePartido);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPartido != null ? idPartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partido)) {
            return false;
        }
        Partido other = (Partido) object;
        if ((this.idPartido == null && other.idPartido != null) || (this.idPartido != null && !this.idPartido.equals(other.idPartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eleicao.telas.Partido[ idPartido=" + idPartido + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
