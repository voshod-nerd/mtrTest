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
@Table(name = "sk_A001", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SkA001.findAll", query = "SELECT s FROM SkA001 s"),
    @NamedQuery(name = "SkA001.findByIdRec", query = "SELECT s FROM SkA001 s WHERE s.idRec = :idRec"),
    @NamedQuery(name = "SkA001.findByVers", query = "SELECT s FROM SkA001 s WHERE s.vers = :vers"),
    @NamedQuery(name = "SkA001.findByDEdit", query = "SELECT s FROM SkA001 s WHERE s.dEdit = :dEdit"),
    @NamedQuery(name = "SkA001.findByAdress", query = "SELECT s FROM SkA001 s WHERE s.adress = :adress"),
    @NamedQuery(name = "SkA001.findByDB", query = "SELECT s FROM SkA001 s WHERE s.dB = :dB"),
    @NamedQuery(name = "SkA001.findByDE", query = "SELECT s FROM SkA001 s WHERE s.dE = :dE")})
public class SkA001 implements Serializable {

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
    @Size(max = 250)
    @Column(name = "Adress")
    private String adress;
    @Column(name = "d_b")
    @Temporal(TemporalType.DATE)
    private Date dB;
    @Column(name = "d_e")
    @Temporal(TemporalType.DATE)
    private Date dE;

    public SkA001() {
    }

    public SkA001(Integer idRec) {
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
        if (!(object instanceof SkA001)) {
            return false;
        }
        SkA001 other = (SkA001) object;
        if ((this.idRec == null && other.idRec != null) || (this.idRec != null && !this.idRec.equals(other.idRec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SkA001[ idRec=" + idRec + " ]";
    }
    
}
