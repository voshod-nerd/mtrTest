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
@Table(name = "J_Schet_From_TF", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JSchetFromTF.findAll", query = "SELECT j FROM JSchetFromTF j"),
    @NamedQuery(name = "JSchetFromTF.findById", query = "SELECT j FROM JSchetFromTF j WHERE j.id = :id"),
    @NamedQuery(name = "JSchetFromTF.findByDateLoad", query = "SELECT j FROM JSchetFromTF j WHERE j.dateLoad = :dateLoad"),
    @NamedQuery(name = "JSchetFromTF.findByPVersion", query = "SELECT j FROM JSchetFromTF j WHERE j.pVersion = :pVersion"),
    @NamedQuery(name = "JSchetFromTF.findByPData", query = "SELECT j FROM JSchetFromTF j WHERE j.pData = :pData"),
    @NamedQuery(name = "JSchetFromTF.findByCOkato1", query = "SELECT j FROM JSchetFromTF j WHERE j.cOkato1 = :cOkato1"),
    @NamedQuery(name = "JSchetFromTF.findByOkatoOms", query = "SELECT j FROM JSchetFromTF j WHERE j.okatoOms = :okatoOms"),
    @NamedQuery(name = "JSchetFromTF.findByCode", query = "SELECT j FROM JSchetFromTF j WHERE j.code = :code"),
    @NamedQuery(name = "JSchetFromTF.findByPYEAR", query = "SELECT j FROM JSchetFromTF j WHERE j.pYEAR = :pYEAR"),
    @NamedQuery(name = "JSchetFromTF.findByPMonth", query = "SELECT j FROM JSchetFromTF j WHERE j.pMonth = :pMonth"),
    @NamedQuery(name = "JSchetFromTF.findByNschet", query = "SELECT j FROM JSchetFromTF j WHERE j.nschet = :nschet"),
    @NamedQuery(name = "JSchetFromTF.findByDschet", query = "SELECT j FROM JSchetFromTF j WHERE j.dschet = :dschet"),
    @NamedQuery(name = "JSchetFromTF.findBySummav", query = "SELECT j FROM JSchetFromTF j WHERE j.summav = :summav"),
    @NamedQuery(name = "JSchetFromTF.findByComents", query = "SELECT j FROM JSchetFromTF j WHERE j.coments = :coments"),
    @NamedQuery(name = "JSchetFromTF.findBySummap", query = "SELECT j FROM JSchetFromTF j WHERE j.summap = :summap"),
    @NamedQuery(name = "JSchetFromTF.findBySankMek", query = "SELECT j FROM JSchetFromTF j WHERE j.sankMek = :sankMek"),
    @NamedQuery(name = "JSchetFromTF.findBySankMee", query = "SELECT j FROM JSchetFromTF j WHERE j.sankMee = :sankMee"),
    @NamedQuery(name = "JSchetFromTF.findBySankEkmp", query = "SELECT j FROM JSchetFromTF j WHERE j.sankEkmp = :sankEkmp"),
    @NamedQuery(name = "JSchetFromTF.findByChecked", query = "SELECT j FROM JSchetFromTF j WHERE j.checked = :checked"),
    @NamedQuery(name = "JSchetFromTF.findByReadyToOpl", query = "SELECT j FROM JSchetFromTF j WHERE j.readyToOpl = :readyToOpl"),
    @NamedQuery(name = "JSchetFromTF.findByDOplat", query = "SELECT j FROM JSchetFromTF j WHERE j.dOplat = :dOplat"),
    @NamedQuery(name = "JSchetFromTF.findByIdUser", query = "SELECT j FROM JSchetFromTF j WHERE j.idUser = :idUser")})
public class JSchetFromTF implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateLoad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLoad;
    @Size(max = 10)
    @Column(name = "pVersion")
    private String pVersion;
    @Column(name = "pData")
    @Temporal(TemporalType.DATE)
    private Date pData;
    @Size(max = 5)
    @Column(name = "C_OKATO1")
    private String cOkato1;
    @Size(max = 5)
    @Column(name = "OKATO_OMS")
    private String okatoOms;
    @Column(name = "Code")
    private Integer code;
    @Column(name = "pYEAR")
    private Short pYEAR;
    @Column(name = "pMonth")
    private Short pMonth;
    @Size(max = 15)
    @Column(name = "NSCHET")
    private String nschet;
    @Column(name = "DSCHET")
    @Temporal(TemporalType.DATE)
    private Date dschet;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMMAV")
    private BigDecimal summav;
    @Size(max = 250)
    @Column(name = "COMENTS")
    private String coments;
    @Column(name = "SUMMAP")
    private BigDecimal summap;
    @Column(name = "SANK_MEK")
    private BigDecimal sankMek;
    @Column(name = "SANK_MEE")
    private BigDecimal sankMee;
    @Column(name = "SANK_EKMP")
    private BigDecimal sankEkmp;
    @Column(name = "Checked")
    private Boolean checked;
    @Column(name = "ReadyToOpl")
    private Boolean readyToOpl;
    @Column(name = "d_Oplat")
    @Temporal(TemporalType.DATE)
    private Date dOplat;
    @Column(name = "id_user")
    private Integer idUser;
    @OneToMany(mappedBy = "idSchetTF")
    private Collection<SchFiles> schFilesCollection;

    public JSchetFromTF() {
    }

    public JSchetFromTF(Integer id) {
        this.id = id;
    }

    public JSchetFromTF(Integer id, Date dateLoad) {
        this.id = id;
        this.dateLoad = dateLoad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    public String getPVersion() {
        return pVersion;
    }

    public void setPVersion(String pVersion) {
        this.pVersion = pVersion;
    }

    public Date getPData() {
        return pData;
    }

    public void setPData(Date pData) {
        this.pData = pData;
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

    public Short getPYEAR() {
        return pYEAR;
    }

    public void setPYEAR(Short pYEAR) {
        this.pYEAR = pYEAR;
    }

    public Short getPMonth() {
        return pMonth;
    }

    public void setPMonth(Short pMonth) {
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

    public BigDecimal getSummav() {
        return summav;
    }

    public void setSummav(BigDecimal summav) {
        this.summav = summav;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public BigDecimal getSummap() {
        return summap;
    }

    public void setSummap(BigDecimal summap) {
        this.summap = summap;
    }

    public BigDecimal getSankMek() {
        return sankMek;
    }

    public void setSankMek(BigDecimal sankMek) {
        this.sankMek = sankMek;
    }

    public BigDecimal getSankMee() {
        return sankMee;
    }

    public void setSankMee(BigDecimal sankMee) {
        this.sankMee = sankMee;
    }

    public BigDecimal getSankEkmp() {
        return sankEkmp;
    }

    public void setSankEkmp(BigDecimal sankEkmp) {
        this.sankEkmp = sankEkmp;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean getReadyToOpl() {
        return readyToOpl;
    }

    public void setReadyToOpl(Boolean readyToOpl) {
        this.readyToOpl = readyToOpl;
    }

    public Date getDOplat() {
        return dOplat;
    }

    public void setDOplat(Date dOplat) {
        this.dOplat = dOplat;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Collection<SchFiles> getSchFilesCollection() {
        return schFilesCollection;
    }

    public void setSchFilesCollection(Collection<SchFiles> schFilesCollection) {
        this.schFilesCollection = schFilesCollection;
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
        if (!(object instanceof JSchetFromTF)) {
            return false;
        }
        JSchetFromTF other = (JSchetFromTF) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.JSchetFromTF[ id=" + id + " ]";
    }
    
}
