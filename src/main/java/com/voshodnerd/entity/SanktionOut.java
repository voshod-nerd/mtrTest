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
@Table(name = "Sanktion_Out", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanktionOut.findAll", query = "SELECT s FROM SanktionOut s"),
    @NamedQuery(name = "SanktionOut.findById", query = "SELECT s FROM SanktionOut s WHERE s.id = :id"),
    @NamedQuery(name = "SanktionOut.findBySCode", query = "SELECT s FROM SanktionOut s WHERE s.sCode = :sCode"),
    @NamedQuery(name = "SanktionOut.findBySSum", query = "SELECT s FROM SanktionOut s WHERE s.sSum = :sSum"),
    @NamedQuery(name = "SanktionOut.findBySTip", query = "SELECT s FROM SanktionOut s WHERE s.sTip = :sTip"),
    @NamedQuery(name = "SanktionOut.findBySOsn", query = "SELECT s FROM SanktionOut s WHERE s.sOsn = :sOsn"),
    @NamedQuery(name = "SanktionOut.findBySCom", query = "SELECT s FROM SanktionOut s WHERE s.sCom = :sCom"),
    @NamedQuery(name = "SanktionOut.findBySIst", query = "SELECT s FROM SanktionOut s WHERE s.sIst = :sIst")})
public class SanktionOut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "S_CODE")
    private String sCode;
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
    private SkSluchOut idSluch;

    public SanktionOut() {
    }

    public SanktionOut(Integer id) {
        this.id = id;
    }

    public SanktionOut(Integer id, String sCode, BigDecimal sSum, short sTip, short sOsn, short sIst) {
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

    public String getSCode() {
        return sCode;
    }

    public void setSCode(String sCode) {
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

    public SkSluchOut getIdSluch() {
        return idSluch;
    }

    public void setIdSluch(SkSluchOut idSluch) {
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
        if (!(object instanceof SanktionOut)) {
            return false;
        }
        SanktionOut other = (SanktionOut) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SanktionOut[ id=" + id + " ]";
    }
    
}
