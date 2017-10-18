/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "MEESHETS", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meeshets.findAll", query = "SELECT m FROM Meeshets m"),
    @NamedQuery(name = "Meeshets.findByIdMeeshets", query = "SELECT m FROM Meeshets m WHERE m.idMeeshets = :idMeeshets"),
    @NamedQuery(name = "Meeshets.findByZaprosMeeshets", query = "SELECT m FROM Meeshets m WHERE m.zaprosMeeshets = :zaprosMeeshets"),
    @NamedQuery(name = "Meeshets.findByReestrMeeshets", query = "SELECT m FROM Meeshets m WHERE m.reestrMeeshets = :reestrMeeshets"),
    @NamedQuery(name = "Meeshets.findByIdscMeeshets", query = "SELECT m FROM Meeshets m WHERE m.idscMeeshets = :idscMeeshets"),
    @NamedQuery(name = "Meeshets.findByNMeeshets", query = "SELECT m FROM Meeshets m WHERE m.nMeeshets = :nMeeshets"),
    @NamedQuery(name = "Meeshets.findByDMeeshets", query = "SELECT m FROM Meeshets m WHERE m.dMeeshets = :dMeeshets")})
public class Meeshets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEESHETS")
    private Integer idMeeshets;
    @Column(name = "ZAPROS_MEESHETS")
    private Boolean zaprosMeeshets;
    @Size(max = 10)
    @Column(name = "REESTR_MEESHETS")
    private String reestrMeeshets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSC_MEESHETS")
    private int idscMeeshets;
    @Size(max = 50)
    @Column(name = "N_MEESHETS")
    private String nMeeshets;
    @Column(name = "D_MEESHETS")
    @Temporal(TemporalType.DATE)
    private Date dMeeshets;

    public Meeshets() {
    }

    public Meeshets(Integer idMeeshets) {
        this.idMeeshets = idMeeshets;
    }

    public Meeshets(Integer idMeeshets, int idscMeeshets) {
        this.idMeeshets = idMeeshets;
        this.idscMeeshets = idscMeeshets;
    }

    public Integer getIdMeeshets() {
        return idMeeshets;
    }

    public void setIdMeeshets(Integer idMeeshets) {
        this.idMeeshets = idMeeshets;
    }

    public Boolean getZaprosMeeshets() {
        return zaprosMeeshets;
    }

    public void setZaprosMeeshets(Boolean zaprosMeeshets) {
        this.zaprosMeeshets = zaprosMeeshets;
    }

    public String getReestrMeeshets() {
        return reestrMeeshets;
    }

    public void setReestrMeeshets(String reestrMeeshets) {
        this.reestrMeeshets = reestrMeeshets;
    }

    public int getIdscMeeshets() {
        return idscMeeshets;
    }

    public void setIdscMeeshets(int idscMeeshets) {
        this.idscMeeshets = idscMeeshets;
    }

    public String getNMeeshets() {
        return nMeeshets;
    }

    public void setNMeeshets(String nMeeshets) {
        this.nMeeshets = nMeeshets;
    }

    public Date getDMeeshets() {
        return dMeeshets;
    }

    public void setDMeeshets(Date dMeeshets) {
        this.dMeeshets = dMeeshets;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMeeshets != null ? idMeeshets.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meeshets)) {
            return false;
        }
        Meeshets other = (Meeshets) object;
        if ((this.idMeeshets == null && other.idMeeshets != null) || (this.idMeeshets != null && !this.idMeeshets.equals(other.idMeeshets))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.Meeshets[ idMeeshets=" + idMeeshets + " ]";
    }
    
}
