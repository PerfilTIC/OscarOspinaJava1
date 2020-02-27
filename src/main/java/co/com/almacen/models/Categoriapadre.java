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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "categoriapadre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoriapadre.findAll", query = "SELECT c FROM Categoriapadre c"),
    @NamedQuery(name = "Categoriapadre.findById", query = "SELECT c FROM Categoriapadre c WHERE c.id = :id"),
    @NamedQuery(name = "Categoriapadre.findByCategoria", query = "SELECT c FROM Categoriapadre c WHERE c.categoria = :categoria")})
public class Categoriapadre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public Categoriapadre() {
    }

    public Categoriapadre(Long id) {
        this.id = id;
    }

    public Categoriapadre(Long id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriapadre)) {
            return false;
        }
        Categoriapadre other = (Categoriapadre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.almacen.models.Categoriapadre[ id=" + id + " ]";
    }
    
}
