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
@Table(name = "sk_L001", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SkL001.findAll", query = "SELECT s FROM SkL001 s"),
    @NamedQuery(name = "SkL001.findByIdRec", query = "SELECT s FROM SkL001 s WHERE s.idRec = :idRec"),
    @NamedQuery(name = "SkL001.findByVers", query = "SELECT s FROM SkL001 s WHERE s.vers = :vers"),
    @NamedQuery(name = "SkL001.findByDEdit", query = "SELECT s FROM SkL001 s WHERE s.dEdit = :dEdit"),
    @NamedQuery(name = "SkL001.findByLpu", query = "SELECT s FROM SkL001 s WHERE s.lpu = :lpu"),
    @NamedQuery(name = "SkL001.findByLicenz", query = "SELECT s FROM SkL001 s WHERE s.licenz = :licenz"),
    @NamedQuery(name = "SkL001.findByDB", query = "SELECT s FROM SkL001 s WHERE s.dB = :dB"),
    @NamedQuery(name = "SkL001.findByDE", query = "SELECT s FROM SkL001 s WHERE s.dE = :dE")})
public class SkL001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_rec")
    private Integer idRec;
    @Size(max = 10)
    @Column(name = "vers")
    private String vers;
    @Column(name = "d_edit")
    @Temporal(TemporalType.DATE)
    private Date dEdit;
    @Size(max = 10)
    @Column(name = "LPU")
    private String lpu;
    @Size(max = 20)
    @Column(name = "LICENZ")
    private String licenz;
    @Column(name = "D_B")
    @Temporal(TemporalType.DATE)
    private Date dB;
    @Column(name = "D_E")
    @Temporal(TemporalType.DATE)
    private Date dE;

    public SkL001() {
    }

    public SkL001(Integer idRec) {
        this.idRec = idRec;
    }

    public Integer getIdRec() {
        return idRec;
    }

    public void setIdRec(Integer idRec) {
        this.idRec = idRec;
    }

    public String getVers() {
        return vers;
    }

    public void setVers(String vers) {
        this.vers = vers;
    }

    public Date getDEdit() {
        return dEdit;
    }

    public void setDEdit(Date dEdit) {
        this.dEdit = dEdit;
    }

    public String getLpu() {
        return lpu;
    }

    public void setLpu(String lpu) {
        this.lpu = lpu;
    }

    public String getLicenz() {
        return licenz;
    }

    public void setLicenz(String licenz) {
        this.licenz = licenz;
    }

    public Date getDB() {
        return dB;
    }

    public void setDB(Date dB) {
        this.dB = dB;
    }

    public Date getDE() {
        return dE;
    }

    public void setDE(Date dE) {
        this.dE = dE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRec != null ? idRec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkL001)) {
            return false;
        }
        SkL001 other = (SkL001) object;
        if ((this.idRec == null && other.idRec != null) || (this.idRec != null && !this.idRec.equals(other.idRec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SkL001[ idRec=" + idRec + " ]";
    }
    
}
