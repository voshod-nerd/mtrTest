/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Талалаев
 */
@Embeddable
public class SkPacketsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "TF_KOD")
    private String tfKod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pYear")
    private int pYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pMonth")
    private int pMonth;

    public SkPacketsPK() {
    }

    public SkPacketsPK(String tfKod, int pYear, int pMonth) {
        this.tfKod = tfKod;
        this.pYear = pYear;
        this.pMonth = pMonth;
    }

    public String getTfKod() {
        return tfKod;
    }

    public void setTfKod(String tfKod) {
        this.tfKod = tfKod;
    }

    public int getPYear() {
        return pYear;
    }

    public void setPYear(int pYear) {
        this.pYear = pYear;
    }

    public int getPMonth() {
        return pMonth;
    }

    public void setPMonth(int pMonth) {
        this.pMonth = pMonth;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tfKod != null ? tfKod.hashCode() : 0);
        hash += (int) pYear;
        hash += (int) pMonth;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkPacketsPK)) {
            return false;
        }
        SkPacketsPK other = (SkPacketsPK) object;
        if ((this.tfKod == null && other.tfKod != null) || (this.tfKod != null && !this.tfKod.equals(other.tfKod))) {
            return false;
        }
        if (this.pYear != other.pYear) {
            return false;
        }
        if (this.pMonth != other.pMonth) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SkPacketsPK[ tfKod=" + tfKod + ", pYear=" + pYear + ", pMonth=" + pMonth + " ]";
    }
    
}
