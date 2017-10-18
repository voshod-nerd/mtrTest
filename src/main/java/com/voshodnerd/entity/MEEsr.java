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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "MEEsr", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MEEsr.findAll", query = "SELECT m FROM MEEsr m"),
    @NamedQuery(name = "MEEsr.findByIDMEEsr", query = "SELECT m FROM MEEsr m WHERE m.iDMEEsr = :iDMEEsr"),
    @NamedQuery(name = "MEEsr.findByIDMKBMEEsr", query = "SELECT m FROM MEEsr m WHERE m.iDMKBMEEsr = :iDMKBMEEsr"),
    @NamedQuery(name = "MEEsr.findBySrokMEEsr", query = "SELECT m FROM MEEsr m WHERE m.srokMEEsr = :srokMEEsr")})
public class MEEsr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEEsr")
    private Integer iDMEEsr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDMKB_MEEsr")
    private String iDMKBMEEsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Srok_MEEsr")
    private int srokMEEsr;

    public MEEsr() {
    }

    public MEEsr(Integer iDMEEsr) {
        this.iDMEEsr = iDMEEsr;
    }

    public MEEsr(Integer iDMEEsr, String iDMKBMEEsr, int srokMEEsr) {
        this.iDMEEsr = iDMEEsr;
        this.iDMKBMEEsr = iDMKBMEEsr;
        this.srokMEEsr = srokMEEsr;
    }

    public Integer getIDMEEsr() {
        return iDMEEsr;
    }

    public void setIDMEEsr(Integer iDMEEsr) {
        this.iDMEEsr = iDMEEsr;
    }

    public String getIDMKBMEEsr() {
        return iDMKBMEEsr;
    }

    public void setIDMKBMEEsr(String iDMKBMEEsr) {
        this.iDMKBMEEsr = iDMKBMEEsr;
    }

    public int getSrokMEEsr() {
        return srokMEEsr;
    }

    public void setSrokMEEsr(int srokMEEsr) {
        this.srokMEEsr = srokMEEsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMEEsr != null ? iDMEEsr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MEEsr)) {
            return false;
        }
        MEEsr other = (MEEsr) object;
        if ((this.iDMEEsr == null && other.iDMEEsr != null) || (this.iDMEEsr != null && !this.iDMEEsr.equals(other.iDMEEsr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.MEEsr[ iDMEEsr=" + iDMEEsr + " ]";
    }
    
}
