/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "MEEsv", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MEEsv.findAll", query = "SELECT m FROM MEEsv m"),
    @NamedQuery(name = "MEEsv.findByIDMEEsv", query = "SELECT m FROM MEEsv m WHERE m.iDMEEsv = :iDMEEsv"),
    @NamedQuery(name = "MEEsv.findByIDUSMEEsv", query = "SELECT m FROM MEEsv m WHERE m.iDUSMEEsv = :iDUSMEEsv"),
    @NamedQuery(name = "MEEsv.findByIDEXPMEEsv", query = "SELECT m FROM MEEsv m WHERE m.iDEXPMEEsv = :iDEXPMEEsv")})
public class MEEsv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEEsv")
    private Integer iDMEEsv;
    @Column(name = "IDUS_MEEsv")
    private Integer iDUSMEEsv;
    @Column(name = "IDEXP_MEEsv")
    private Integer iDEXPMEEsv;

    public MEEsv() {
    }

    public MEEsv(Integer iDMEEsv) {
        this.iDMEEsv = iDMEEsv;
    }

    public Integer getIDMEEsv() {
        return iDMEEsv;
    }

    public void setIDMEEsv(Integer iDMEEsv) {
        this.iDMEEsv = iDMEEsv;
    }

    public Integer getIDUSMEEsv() {
        return iDUSMEEsv;
    }

    public void setIDUSMEEsv(Integer iDUSMEEsv) {
        this.iDUSMEEsv = iDUSMEEsv;
    }

    public Integer getIDEXPMEEsv() {
        return iDEXPMEEsv;
    }

    public void setIDEXPMEEsv(Integer iDEXPMEEsv) {
        this.iDEXPMEEsv = iDEXPMEEsv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMEEsv != null ? iDMEEsv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MEEsv)) {
            return false;
        }
        MEEsv other = (MEEsv) object;
        if ((this.iDMEEsv == null && other.iDMEEsv != null) || (this.iDMEEsv != null && !this.iDMEEsv.equals(other.iDMEEsv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.MEEsv[ iDMEEsv=" + iDMEEsv + " ]";
    }
    
}
