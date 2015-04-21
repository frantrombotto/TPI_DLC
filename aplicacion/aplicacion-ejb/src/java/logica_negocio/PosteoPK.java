/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_negocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Candelaria
 */
@Embeddable
public class PosteoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_palabra")
    private int idPalabra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_doc")
    private int idDoc;

    public PosteoPK() {
    }

    public PosteoPK(int idPalabra, int idDoc) {
        this.idPalabra = idPalabra;
        this.idDoc = idDoc;
    }

    public int getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(int idPalabra) {
        this.idPalabra = idPalabra;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPalabra;
        hash += (int) idDoc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosteoPK)) {
            return false;
        }
        PosteoPK other = (PosteoPK) object;
        if (this.idPalabra != other.idPalabra) {
            return false;
        }
        if (this.idDoc != other.idDoc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica_negocio.PosteoPK[ idPalabra=" + idPalabra + ", idDoc=" + idDoc + " ]";
    }
    
}
