/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDB.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author oskar
 */
@Entity
@Table(name = "AGENCIASPUBLICITARIAS")
@NamedQueries({
    @NamedQuery(name = "Agenciaspublicitarias.findAll", query = "SELECT a FROM Agenciaspublicitarias a"),
    @NamedQuery(name = "Agenciaspublicitarias.findById", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.id = :id"),
    @NamedQuery(name = "Agenciaspublicitarias.findByNombre", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Agenciaspublicitarias.findByA\u00f1ocreacion", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.a\u00f1ocreacion = :a\u00f1ocreacion"),
    @NamedQuery(name = "Agenciaspublicitarias.findByTelefono", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Agenciaspublicitarias.findByEmail", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.email = :email"),
    @NamedQuery(name = "Agenciaspublicitarias.findByProvincia", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.provincia = :provincia"),
    @NamedQuery(name = "Agenciaspublicitarias.findByPreciohora", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.preciohora = :preciohora"),
    @NamedQuery(name = "Agenciaspublicitarias.findBySoporte", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.soporte = :soporte"),
    @NamedQuery(name = "Agenciaspublicitarias.findByCobradespservicio", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.cobradespservicio = :cobradespservicio"),
    @NamedQuery(name = "Agenciaspublicitarias.findByIsbn", query = "SELECT a FROM Agenciaspublicitarias a WHERE a.isbn = :isbn")})
public class Agenciaspublicitarias implements Serializable {

    @Column(name = "ANNOCREACION")
    @Temporal(TemporalType.DATE)
    private Date annocreacion;
    @Column(name = "TRABAJOSREALIZADOS")
    private Integer trabajosrealizados;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "A\u00d1OCREACION")
    @Temporal(TemporalType.DATE)
    private Date añocreacion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PROVINCIA")
    private String provincia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIOHORA")
    private BigDecimal preciohora;
    @Column(name = "SOPORTE")
    private String soporte;
    @Column(name = "COBRADESPSERVICIO")
    private Boolean cobradespservicio;
    @Column(name = "ISBN")
    private String isbn;
    @JoinColumn(name = "AMBITO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Ambito ambito;

    public Agenciaspublicitarias() {
    }

    public Agenciaspublicitarias(Integer id) {
        this.id = id;
    }

    public Agenciaspublicitarias(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAñocreacion() {
        return añocreacion;
    }

    public void setAñocreacion(Date añocreacion) {
        this.añocreacion = añocreacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public BigDecimal getPreciohora() {
        return preciohora;
    }

    public void setPreciohora(BigDecimal preciohora) {
        this.preciohora = preciohora;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public Boolean getCobradespservicio() {
        return cobradespservicio;
    }

    public void setCobradespservicio(Boolean cobradespservicio) {
        this.cobradespservicio = cobradespservicio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Ambito getAmbito() {
        return ambito;
    }

    public void setAmbito(Ambito ambito) {
        this.ambito = ambito;
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
        if (!(object instanceof Agenciaspublicitarias)) {
            return false;
        }
        Agenciaspublicitarias other = (Agenciaspublicitarias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoDB.sql.Agenciaspublicitarias[ id=" + id + " ]";
    }

    public Date getAnnocreacion() {
        return annocreacion;
    }

    public void setAnnocreacion(Date annocreacion) {
        this.annocreacion = annocreacion;
    }

    public Integer getTrabajosrealizados() {
        return trabajosrealizados;
    }

    public void setTrabajosrealizados(Integer trabajosrealizados) {
        this.trabajosrealizados = trabajosrealizados;
    }
    
}
