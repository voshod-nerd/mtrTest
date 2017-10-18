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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "MEE_PDN", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MeePdn.findAll", query = "SELECT m FROM MeePdn m"),
    @NamedQuery(name = "MeePdn.findByIdMeePdn", query = "SELECT m FROM MeePdn m WHERE m.idMeePdn = :idMeePdn"),
    @NamedQuery(name = "MeePdn.findBySumMeePdn", query = "SELECT m FROM MeePdn m WHERE m.sumMeePdn = :sumMeePdn"),
    @NamedQuery(name = "MeePdn.findByDbegMeePdn", query = "SELECT m FROM MeePdn m WHERE m.dbegMeePdn = :dbegMeePdn"),
    @NamedQuery(name = "MeePdn.findByDendMeePdn", query = "SELECT m FROM MeePdn m WHERE m.dendMeePdn = :dendMeePdn")})
public class MeePdn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEE_PDN")
    private Integer idMeePdn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUM_MEE_PDN")
    private double sumMeePdn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DBEG_MEE_PDN")
    @Temporal(TemporalType.DATE)
    private Date dbegMeePdn;
    @Column(name = "DEND_MEE_PDN")
    @Temporal(TemporalType.DATE)
    private Date dendMeePdn;

    public MeePdn() {
    }

    public MeePdn(Integer idMeePdn) {
        this.idMeePdn = idMeePdn;
    }

    public MeePdn(Integer idMeePdn, double sumMeePdn, Date dbegMeePdn) {
        this.idMeePdn = idMeePdn;
        this.sumMeePdn = sumMeePdn;
        this.dbegMeePdn = dbegMeePdn;
    }

    public Integer getIdMeePdn() {
        return idMeePdn;
    }

    public void setIdMeePdn(Integer idMeePdn) {
        this.idMeePdn = idMeePdn;
    }

    public double getSumMeePdn() {
        return sumMeePdn;
    }

    public void setSumMeePdn(double sumMeePdn) {
        this.sumMeePdn = sumMeePdn;
    }

    public Date getDbegMeePdn() {
        return dbegMeePdn;
    }

    public void setDbegMeePdn(Date dbegMeePdn) {
        this.dbegMeePdn = dbegMeePdn;
    }

    public Date getDendMeePdn() {
        return dendMeePdn;
    }

    public void setDendMeePdn(Date dendMeePdn) {
        this.dendMeePdn = dendMeePdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMeePdn != null ? idMeePdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MeePdn)) {
            return false;
        }
        MeePdn other = (MeePdn) object;
        if ((this.idMeePdn == null && other.idMeePdn != null) || (this.idMeePdn != null && !this.idMeePdn.equals(other.idMeePdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.MeePdn[ idMeePdn=" + idMeePdn + " ]";
    }
    
}
