/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_negocio;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Candelaria
 */
@Entity
@Table(name = "vocabulario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vocabulario.findAll", query = "SELECT v FROM Vocabulario v"),
    @NamedQuery(name = "Vocabulario.findByIdPalabra", query = "SELECT v FROM Vocabulario v WHERE v.idPalabra = :idPalabra"),
    @NamedQuery(name = "Vocabulario.findByPalabra", query = "SELECT v FROM Vocabulario v WHERE v.palabra = :palabra"),
    @NamedQuery(name = "Vocabulario.findByFrecMax", query = "SELECT v FROM Vocabulario v WHERE v.frecMax = :frecMax"),
    @NamedQuery(name = "Vocabulario.findByCantDoc", query = "SELECT v FROM Vocabulario v WHERE v.cantDoc = :cantDoc")})
public class Vocabulario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_palabra")
    private Integer idPalabra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "palabra")
    private String palabra;
    @Column(name = "frec_max")
    private Integer frecMax;
    @Column(name = "cant_doc")
    private Integer cantDoc;

    public Vocabulario() {
    }

    public Vocabulario(Integer idPalabra) {
        this.idPalabra = idPalabra;
    }

    public Vocabulario(Integer idPalabra, String palabra) {
        this.idPalabra = idPalabra;
        this.palabra = palabra;
    }

    public Integer getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(Integer idPalabra) {
        this.idPalabra = idPalabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Integer getFrecMax() {
        return frecMax;
    }

    public void setFrecMax(Integer frecMax) {
        this.frecMax = frecMax;
    }

    public Integer getCantDoc() {
        return cantDoc;
    }

    public void setCantDoc(Integer cantDoc) {
        this.cantDoc = cantDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPalabra != null ? idPalabra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vocabulario)) {
            return false;
        }
        Vocabulario other = (Vocabulario) object;
        if ((this.idPalabra == null && other.idPalabra != null) || (this.idPalabra != null && !this.idPalabra.equals(other.idPalabra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica_negocio.Vocabulario[ idPalabra=" + idPalabra + " ]";
    }
    
}
