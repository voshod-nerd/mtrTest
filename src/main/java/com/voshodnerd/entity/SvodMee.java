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
@Table(name = "SVOD_MEE", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SvodMee.findAll", query = "SELECT s FROM SvodMee s"),
    @NamedQuery(name = "SvodMee.findByIdsvodMee", query = "SELECT s FROM SvodMee s WHERE s.idsvodMee = :idsvodMee"),
    @NamedQuery(name = "SvodMee.findByIdscMee", query = "SELECT s FROM SvodMee s WHERE s.idscMee = :idscMee"),
    @NamedQuery(name = "SvodMee.findByNumAkt", query = "SELECT s FROM SvodMee s WHERE s.numAkt = :numAkt"),
    @NamedQuery(name = "SvodMee.findByDateAkt", query = "SELECT s FROM SvodMee s WHERE s.dateAkt = :dateAkt"),
    @NamedQuery(name = "SvodMee.findByPerS", query = "SELECT s FROM SvodMee s WHERE s.perS = :perS"),
    @NamedQuery(name = "SvodMee.findByPerPo", query = "SELECT s FROM SvodMee s WHERE s.perPo = :perPo"),
    @NamedQuery(name = "SvodMee.findByDateExpS", query = "SELECT s FROM SvodMee s WHERE s.dateExpS = :dateExpS"),
    @NamedQuery(name = "SvodMee.findByDateExpPo", query = "SELECT s FROM SvodMee s WHERE s.dateExpPo = :dateExpPo"),
    @NamedQuery(name = "SvodMee.findByNotpred", query = "SELECT s FROM SvodMee s WHERE s.notpred = :notpred"),
    @NamedQuery(name = "SvodMee.findByOsmType", query = "SELECT s FROM SvodMee s WHERE s.osmType = :osmType")})
public class SvodMee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSVOD_MEE")
    private Integer idsvodMee;
    @Column(name = "IDSC_MEE")
    private Integer idscMee;
    @Size(max = 10)
    @Column(name = "NUM_AKT")
    private String numAkt;
    @Column(name = "DATE_AKT")
    @Temporal(TemporalType.DATE)
    private Date dateAkt;
    @Column(name = "PER_S")
    @Temporal(TemporalType.DATE)
    private Date perS;
    @Column(name = "PER_PO")
    @Temporal(TemporalType.DATE)
    private Date perPo;
    @Column(name = "DATE_EXP_S")
    @Temporal(TemporalType.DATE)
    private Date dateExpS;
    @Column(name = "DATE_EXP_PO")
    @Temporal(TemporalType.DATE)
    private Date dateExpPo;
    @Column(name = "NOTPRED")
    private Integer notpred;
    @Size(max = 50)
    @Column(name = "OSM_TYPE")
    private String osmType;

    public SvodMee() {
    }

    public SvodMee(Integer idsvodMee) {
        this.idsvodMee = idsvodMee;
    }

    public Integer getIdsvodMee() {
        return idsvodMee;
    }

    public void setIdsvodMee(Integer idsvodMee) {
        this.idsvodMee = idsvodMee;
    }

    public Integer getIdscMee() {
        return idscMee;
    }

    public void setIdscMee(Integer idscMee) {
        this.idscMee = idscMee;
    }

    public String getNumAkt() {
        return numAkt;
    }

    public void setNumAkt(String numAkt) {
        this.numAkt = numAkt;
    }

    public Date getDateAkt() {
        return dateAkt;
    }

    public void setDateAkt(Date dateAkt) {
        this.dateAkt = dateAkt;
    }

    public Date getPerS() {
        return perS;
    }

    public void setPerS(Date perS) {
        this.perS = perS;
    }

    public Date getPerPo() {
        return perPo;
    }

    public void setPerPo(Date perPo) {
        this.perPo = perPo;
    }

    public Date getDateExpS() {
        return dateExpS;
    }

    public void setDateExpS(Date dateExpS) {
        this.dateExpS = dateExpS;
    }

    public Date getDateExpPo() {
        return dateExpPo;
    }

    public void setDateExpPo(Date dateExpPo) {
        this.dateExpPo = dateExpPo;
    }

    public Integer getNotpred() {
        return notpred;
    }

    public void setNotpred(Integer notpred) {
        this.notpred = notpred;
    }

    public String getOsmType() {
        return osmType;
    }

    public void setOsmType(String osmType) {
        this.osmType = osmType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsvodMee != null ? idsvodMee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SvodMee)) {
            return false;
        }
        SvodMee other = (SvodMee) object;
        if ((this.idsvodMee == null && other.idsvodMee != null) || (this.idsvodMee != null && !this.idsvodMee.equals(other.idsvodMee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SvodMee[ idsvodMee=" + idsvodMee + " ]";
    }
    
}
