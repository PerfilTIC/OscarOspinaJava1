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
@Table(name = "login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByIdLogin", query = "SELECT l FROM Login l WHERE l.idLogin = :idLogin"),
    @NamedQuery(name = "Login.findByUser", query = "SELECT l FROM Login l WHERE l.user = :user"),
    @NamedQuery(name = "Login.findByPassword", query = "SELECT l FROM Login l WHERE l.password = :password")})
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_login")
    private Long idLogin;
    @Basic(optional = false)
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public Login() {
    }

    public Login(Long idLogin) {
        this.idLogin = idLogin;
    }

    public Login(Long idLogin, String user, String password) {
        this.idLogin = idLogin;
        this.user = user;
        this.password = password;
    }

    public Long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogin != null ? idLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.idLogin == null && other.idLogin != null) || (this.idLogin != null && !this.idLogin.equals(other.idLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.almacen.models.Login[ idLogin=" + idLogin + " ]";
    }
    
}
