/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Sanktion_D", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanktionD.findAll", query = "SELECT s FROM SanktionD s"),
    @NamedQuery(name = "SanktionD.findById", query = "SELECT s FROM SanktionD s WHERE s.id = :id"),
    @NamedQuery(name = "SanktionD.findBySCode", query = "SELECT s FROM SanktionD s WHERE s.sCode = :sCode"),
    @NamedQuery(name = "SanktionD.findBySSum", query = "SELECT s FROM SanktionD s WHERE s.sSum = :sSum"),
    @NamedQuery(name = "SanktionD.findBySTip", query = "SELECT s FROM SanktionD s WHERE s.sTip = :sTip"),
    @NamedQuery(name = "SanktionD.findBySOsn", query = "SELECT s FROM SanktionD s WHERE s.sOsn = :sOsn"),
    @NamedQuery(name = "SanktionD.findBySCom", query = "SELECT s FROM SanktionD s WHERE s.sCom = :sCom"),
    @NamedQuery(name = "SanktionD.findBySIst", query = "SELECT s FROM SanktionD s WHERE s.sIst = :sIst")})
public class SanktionD implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "S_CODE")
    private int sCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "S_SUM")
    private BigDecimal sSum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "S_TIP")
    private short sTip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "S_OSN")
    private short sOsn;
    @Size(max = 250)
    @Column(name = "S_COM")
    private String sCom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "S_IST")
    private short sIst;
    @JoinColumn(name = "ID_SLUCH", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private SkSluchD idSluch;

    public SanktionD() {
    }

    public SanktionD(Integer id) {
        this.id = id;
    }

    public SanktionD(Integer id, int sCode, BigDecimal sSum, short sTip, short sOsn, short sIst) {
        this.id = id;
        this.sCode = sCode;
        this.sSum = sSum;
        this.sTip = sTip;
        this.sOsn = sOsn;
        this.sIst = sIst;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSCode() {
        return sCode;
    }

    public void setSCode(int sCode) {
        this.sCode = sCode;
    }

    public BigDecimal getSSum() {
        return sSum;
    }

    public void setSSum(BigDecimal sSum) {
        this.sSum = sSum;
    }

    public short getSTip() {
        return sTip;
    }

    public void setSTip(short sTip) {
        this.sTip = sTip;
    }

    public short getSOsn() {
        return sOsn;
    }

    public void setSOsn(short sOsn) {
        this.sOsn = sOsn;
    }

    public String getSCom() {
        return sCom;
    }

    public void setSCom(String sCom) {
        this.sCom = sCom;
    }

    public short getSIst() {
        return sIst;
    }

    public void setSIst(short sIst) {
        this.sIst = sIst;
    }

    public SkSluchD getIdSluch() {
        return idSluch;
    }

    public void setIdSluch(SkSluchD idSluch) {
        this.idSluch = idSluch;
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
        if (!(object instanceof SanktionD)) {
            return false;
        }
        SanktionD other = (SanktionD) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SanktionD[ id=" + id + " ]";
    }
    
}
