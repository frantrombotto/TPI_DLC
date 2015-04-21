/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_negocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Candelaria
 */
@Entity
@Table(name = "posteo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Posteo.findAll", query = "SELECT p FROM Posteo p"),
    @NamedQuery(name = "Posteo.findByIdPalabra", query = "SELECT p FROM Posteo p WHERE p.posteoPK.idPalabra = :idPalabra"),
    @NamedQuery(name = "Posteo.findByIdDoc", query = "SELECT p FROM Posteo p WHERE p.posteoPK.idDoc = :idDoc"),
    @NamedQuery(name = "Posteo.findByFrecuencia", query = "SELECT p FROM Posteo p WHERE p.frecuencia = :frecuencia")})
public class Posteo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PosteoPK posteoPK;
    @Column(name = "frecuencia")
    private Integer frecuencia;

    public Posteo() {
    }

    public Posteo(PosteoPK posteoPK) {
        this.posteoPK = posteoPK;
    }

    public Posteo(int idPalabra, int idDoc) {
        this.posteoPK = new PosteoPK(idPalabra, idDoc);
    }

    public PosteoPK getPosteoPK() {
        return posteoPK;
    }

    public void setPosteoPK(PosteoPK posteoPK) {
        this.posteoPK = posteoPK;
    }

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posteoPK != null ? posteoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Posteo)) {
            return false;
        }
        Posteo other = (Posteo) object;
        if ((this.posteoPK == null && other.posteoPK != null) || (this.posteoPK != null && !this.posteoPK.equals(other.posteoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica_negocio.Posteo[ posteoPK=" + posteoPK + " ]";
    }
    
}
