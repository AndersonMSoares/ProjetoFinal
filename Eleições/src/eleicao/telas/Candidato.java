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
@Table(name = "candidato", catalog = "eleicao", schema = "")
@NamedQueries({
    @NamedQuery(name = "Candidato.findAll", query = "SELECT c FROM Candidato c"),
    @NamedQuery(name = "Candidato.findByPessoascpfpessoas", query = "SELECT c FROM Candidato c WHERE c.pessoascpfpessoas = :pessoascpfpessoas"),
    @NamedQuery(name = "Candidato.findByPartidoidpartido", query = "SELECT c FROM Candidato c WHERE c.partidoidpartido = :partidoidpartido"),
    @NamedQuery(name = "Candidato.findByCargoidcargo", query = "SELECT c FROM Candidato c WHERE c.cargoidcargo = :cargoidcargo")})
public class Candidato implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Pessoas_cpf_pessoas")
    private Integer pessoascpfpessoas;
    @Basic(optional = false)
    @Column(name = "Partido_id_partido")
    private int partidoidpartido;
    @Basic(optional = false)
    @Column(name = "Cargo_id_cargo")
    private int cargoidcargo;

    public Candidato() {
    }

    public Candidato(Integer pessoascpfpessoas) {
        this.pessoascpfpessoas = pessoascpfpessoas;
    }

    public Candidato(Integer pessoascpfpessoas, int partidoidpartido, int cargoidcargo) {
        this.pessoascpfpessoas = pessoascpfpessoas;
        this.partidoidpartido = partidoidpartido;
        this.cargoidcargo = cargoidcargo;
    }

    public Integer getPessoascpfpessoas() {
        return pessoascpfpessoas;
    }

    public void setPessoascpfpessoas(Integer pessoascpfpessoas) {
        Integer oldPessoascpfpessoas = this.pessoascpfpessoas;
        this.pessoascpfpessoas = pessoascpfpessoas;
        changeSupport.firePropertyChange("pessoascpfpessoas", oldPessoascpfpessoas, pessoascpfpessoas);
    }

    public int getPartidoidpartido() {
        return partidoidpartido;
    }

    public void setPartidoidpartido(int partidoidpartido) {
        int oldPartidoidpartido = this.partidoidpartido;
        this.partidoidpartido = partidoidpartido;
        changeSupport.firePropertyChange("partidoidpartido", oldPartidoidpartido, partidoidpartido);
    }

    public int getCargoidcargo() {
        return cargoidcargo;
    }

    public void setCargoidcargo(int cargoidcargo) {
        int oldCargoidcargo = this.cargoidcargo;
        this.cargoidcargo = cargoidcargo;
        changeSupport.firePropertyChange("cargoidcargo", oldCargoidcargo, cargoidcargo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pessoascpfpessoas != null ? pessoascpfpessoas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidato)) {
            return false;
        }
        Candidato other = (Candidato) object;
        if ((this.pessoascpfpessoas == null && other.pessoascpfpessoas != null) || (this.pessoascpfpessoas != null && !this.pessoascpfpessoas.equals(other.pessoascpfpessoas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eleicao.telas.Candidato[ pessoascpfpessoas=" + pessoascpfpessoas + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
