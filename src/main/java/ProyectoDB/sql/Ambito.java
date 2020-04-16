/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDB.sql;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author oskar
 */
@Entity
@Table(name = "AMBITO")
@NamedQueries({
    @NamedQuery(name = "Ambito.findAll", query = "SELECT a FROM Ambito a"),
    @NamedQuery(name = "Ambito.findById", query = "SELECT a FROM Ambito a WHERE a.id = :id"),
    @NamedQuery(name = "Ambito.findByCodigo", query = "SELECT a FROM Ambito a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Ambito.findByAmbito", query = "SELECT a FROM Ambito a WHERE a.ambito = :ambito")})
public class Ambito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "AMBITO")
    private String ambito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ambito")
    private Collection<Agenciaspublicitarias> agenciaspublicitariasCollection;

    public Ambito() {
    }

    public Ambito(Integer id) {
        this.id = id;
    }

    public Ambito(Integer id, String ambito) {
        this.id = id;
        this.ambito = ambito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public Collection<Agenciaspublicitarias> getAgenciaspublicitariasCollection() {
        return agenciaspublicitariasCollection;
    }

    public void setAgenciaspublicitariasCollection(Collection<Agenciaspublicitarias> agenciaspublicitariasCollection) {
        this.agenciaspublicitariasCollection = agenciaspublicitariasCollection;
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
        if (!(object instanceof Ambito)) {
            return false;
        }
        Ambito other = (Ambito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoDB.sql.Ambito[ id=" + id + " ]";
    }
    
}
