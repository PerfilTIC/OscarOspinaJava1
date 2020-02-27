/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.almacen.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "fotos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fotos.findAll", query = "SELECT f FROM Fotos f"),
    @NamedQuery(name = "Fotos.findByIdFoto", query = "SELECT f FROM Fotos f WHERE f.idFoto = :idFoto")})
public class Fotos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_foto")
    private Long idFoto;
    @Basic(optional = false)
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productos idProducto;

    public Fotos() {
    }

    public Fotos(Long idFoto) {
        this.idFoto = idFoto;
    }

    public Fotos(Long idFoto, byte[] imagen) {
        this.idFoto = idFoto;
        this.imagen = imagen;
    }

    public Long getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Long idFoto) {
        this.idFoto = idFoto;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFoto != null ? idFoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fotos)) {
            return false;
        }
        Fotos other = (Fotos) object;
        if ((this.idFoto == null && other.idFoto != null) || (this.idFoto != null && !this.idFoto.equals(other.idFoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.almacen.models.Fotos[ idFoto=" + idFoto + " ]";
    }
    
}
