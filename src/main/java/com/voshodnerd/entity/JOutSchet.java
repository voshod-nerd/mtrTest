/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "J_Out_Schet", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JOutSchet.findAll", query = "SELECT j FROM JOutSchet j"),
    @NamedQuery(name = "JOutSchet.findById", query = "SELECT j FROM JOutSchet j WHERE j.id = :id"),
    @NamedQuery(name = "JOutSchet.findByVersion", query = "SELECT j FROM JOutSchet j WHERE j.version = :version"),
    @NamedQuery(name = "JOutSchet.findByData", query = "SELECT j FROM JOutSchet j WHERE j.data = :data"),
    @NamedQuery(name = "JOutSchet.findByCOkato1", query = "SELECT j FROM JOutSchet j WHERE j.cOkato1 = :cOkato1"),
    @NamedQuery(name = "JOutSchet.findByOkatoOms", query = "SELECT j FROM JOutSchet j WHERE j.okatoOms = :okatoOms"),
    @NamedQuery(name = "JOutSchet.findByCode", query = "SELECT j FROM JOutSchet j WHERE j.code = :code"),
    @NamedQuery(name = "JOutSchet.findByPYear", query = "SELECT j FROM JOutSchet j WHERE j.pYear = :pYear"),
    @NamedQuery(name = "JOutSchet.findByPMonth", query = "SELECT j FROM JOutSchet j WHERE j.pMonth = :pMonth"),
    @NamedQuery(name = "JOutSchet.findByNschet", query = "SELECT j FROM JOutSchet j WHERE j.nschet = :nschet"),
    @NamedQuery(name = "JOutSchet.findByDschet", query = "SELECT j FROM JOutSchet j WHERE j.dschet = :dschet"),
    @NamedQuery(name = "JOutSchet.findBySummaV", query = "SELECT j FROM JOutSchet j WHERE j.summaV = :summaV"),
    @NamedQuery(name = "JOutSchet.findByComents", query = "SELECT j FROM JOutSchet j WHERE j.coments = :coments"),
    @NamedQuery(name = "JOutSchet.findBySummaP", query = "SELECT j FROM JOutSchet j WHERE j.summaP = :summaP"),
    @NamedQuery(name = "JOutSchet.findBySankMEK", query = "SELECT j FROM JOutSchet j WHERE j.sankMEK = :sankMEK"),
    @NamedQuery(name = "JOutSchet.findBySankMEE", query = "SELECT j FROM JOutSchet j WHERE j.sankMEE = :sankMEE"),
    @NamedQuery(name = "JOutSchet.findBySankEKMP", query = "SELECT j FROM JOutSchet j WHERE j.sankEKMP = :sankEKMP"),
    @NamedQuery(name = "JOutSchet.findByTypeShet", query = "SELECT j FROM JOutSchet j WHERE j.typeShet = :typeShet"),
    @NamedQuery(name = "JOutSchet.findByDAnswer", query = "SELECT j FROM JOutSchet j WHERE j.dAnswer = :dAnswer"),
    @NamedQuery(name = "JOutSchet.findBySumpAnswer", query = "SELECT j FROM JOutSchet j WHERE j.sumpAnswer = :sumpAnswer")})
public class JOutSchet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Version")
    private String version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "C_Okato1")
    private String cOkato1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Okato_Oms")
    private String okatoOms;
    @Column(name = "Code")
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PYear")
    private short pYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PMonth")
    private short pMonth;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Nschet")
    private String nschet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dschet")
    @Temporal(TemporalType.DATE)
    private Date dschet;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SummaV")
    private BigDecimal summaV;
    @Size(max = 250)
    @Column(name = "Coments")
    private String coments;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SummaP")
    private BigDecimal summaP;
    @Column(name = "Sank_MEK")
    private BigDecimal sankMEK;
    @Column(name = "Sank_MEE")
    private BigDecimal sankMEE;
    @Column(name = "Sank_EKMP")
    private BigDecimal sankEKMP;
    @Column(name = "TypeShet")
    private Character typeShet;
    @Column(name = "d_Answer")
    @Temporal(TemporalType.DATE)
    private Date dAnswer;
    @Column(name = "sump_Answer")
    private BigDecimal sumpAnswer;
    @OneToMany(mappedBy = "idSchetToTF")
    private Collection<SkSluchD> skSluchDCollection;
    @OneToMany(mappedBy = "idSchetToTF")
    private Collection<SkSluchOut> skSluchOutCollection;

    public JOutSchet() {
    }

    public JOutSchet(Integer id) {
        this.id = id;
    }

    public JOutSchet(Integer id, String version, Date data, String cOkato1, String okatoOms, short pYear, short pMonth, String nschet, Date dschet, BigDecimal summaV, BigDecimal summaP) {
        this.id = id;
        this.version = version;
        this.data = data;
        this.cOkato1 = cOkato1;
        this.okatoOms = okatoOms;
        this.pYear = pYear;
        this.pMonth = pMonth;
        this.nschet = nschet;
        this.dschet = dschet;
        this.summaV = summaV;
        this.summaP = summaP;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCOkato1() {
        return cOkato1;
    }

    public void setCOkato1(String cOkato1) {
        this.cOkato1 = cOkato1;
    }

    public String getOkatoOms() {
        return okatoOms;
    }

    public void setOkatoOms(String okatoOms) {
        this.okatoOms = okatoOms;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public short getPYear() {
        return pYear;
    }

    public void setPYear(short pYear) {
        this.pYear = pYear;
    }

    public short getPMonth() {
        return pMonth;
    }

    public void setPMonth(short pMonth) {
        this.pMonth = pMonth;
    }

    public String getNschet() {
        return nschet;
    }

    public void setNschet(String nschet) {
        this.nschet = nschet;
    }

    public Date getDschet() {
        return dschet;
    }

    public void setDschet(Date dschet) {
        this.dschet = dschet;
    }

    public BigDecimal getSummaV() {
        return summaV;
    }

    public void setSummaV(BigDecimal summaV) {
        this.summaV = summaV;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public BigDecimal getSummaP() {
        return summaP;
    }

    public void setSummaP(BigDecimal summaP) {
        this.summaP = summaP;
    }

    public BigDecimal getSankMEK() {
        return sankMEK;
    }

    public void setSankMEK(BigDecimal sankMEK) {
        this.sankMEK = sankMEK;
    }

    public BigDecimal getSankMEE() {
        return sankMEE;
    }

    public void setSankMEE(BigDecimal sankMEE) {
        this.sankMEE = sankMEE;
    }

    public BigDecimal getSankEKMP() {
        return sankEKMP;
    }

    public void setSankEKMP(BigDecimal sankEKMP) {
        this.sankEKMP = sankEKMP;
    }

    public Character getTypeShet() {
        return typeShet;
    }

    public void setTypeShet(Character typeShet) {
        this.typeShet = typeShet;
    }

    public Date getDAnswer() {
        return dAnswer;
    }

    public void setDAnswer(Date dAnswer) {
        this.dAnswer = dAnswer;
    }

    public BigDecimal getSumpAnswer() {
        return sumpAnswer;
    }

    public void setSumpAnswer(BigDecimal sumpAnswer) {
        this.sumpAnswer = sumpAnswer;
    }

    @XmlTransient
    public Collection<SkSluchD> getSkSluchDCollection() {
        return skSluchDCollection;
    }

    public void setSkSluchDCollection(Collection<SkSluchD> skSluchDCollection) {
        this.skSluchDCollection = skSluchDCollection;
    }

    @XmlTransient
    public Collection<SkSluchOut> getSkSluchOutCollection() {
        return skSluchOutCollection;
    }

    public void setSkSluchOutCollection(Collection<SkSluchOut> skSluchOutCollection) {
        this.skSluchOutCollection = skSluchOutCollection;
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
        if (!(object instanceof JOutSchet)) {
            return false;
        }
        JOutSchet other = (JOutSchet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.JOutSchet[ id=" + id + " ]";
    }
    
}
