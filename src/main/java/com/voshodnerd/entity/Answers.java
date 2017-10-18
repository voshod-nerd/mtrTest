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
import javax.persistence.CascadeType;
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
@Table(name = "Answers", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Answers.findAll", query = "SELECT a FROM Answers a"),
    @NamedQuery(name = "Answers.findById", query = "SELECT a FROM Answers a WHERE a.id = :id"),
    @NamedQuery(name = "Answers.findByIdOutSchet", query = "SELECT a FROM Answers a WHERE a.idOutSchet = :idOutSchet"),
    @NamedQuery(name = "Answers.findByDateLoad", query = "SELECT a FROM Answers a WHERE a.dateLoad = :dateLoad"),
    @NamedQuery(name = "Answers.findByOkatoOms", query = "SELECT a FROM Answers a WHERE a.okatoOms = :okatoOms"),
    @NamedQuery(name = "Answers.findByPYear", query = "SELECT a FROM Answers a WHERE a.pYear = :pYear"),
    @NamedQuery(name = "Answers.findByPMonth", query = "SELECT a FROM Answers a WHERE a.pMonth = :pMonth"),
    @NamedQuery(name = "Answers.findByNschet", query = "SELECT a FROM Answers a WHERE a.nschet = :nschet"),
    @NamedQuery(name = "Answers.findByDschet", query = "SELECT a FROM Answers a WHERE a.dschet = :dschet"),
    @NamedQuery(name = "Answers.findBySummav", query = "SELECT a FROM Answers a WHERE a.summav = :summav"),
    @NamedQuery(name = "Answers.findBySummap", query = "SELECT a FROM Answers a WHERE a.summap = :summap"),
    @NamedQuery(name = "Answers.findBySankMek", query = "SELECT a FROM Answers a WHERE a.sankMek = :sankMek"),
    @NamedQuery(name = "Answers.findBySankMee", query = "SELECT a FROM Answers a WHERE a.sankMee = :sankMee"),
    @NamedQuery(name = "Answers.findBySankEkmp", query = "SELECT a FROM Answers a WHERE a.sankEkmp = :sankEkmp")})
public class Answers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Out_Schet")
    private int idOutSchet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateLoad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLoad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "OKATO_OMS")
    private String okatoOms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pYear")
    private int pYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pMonth")
    private int pMonth;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NSCHET")
    private String nschet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DSCHET")
    @Temporal(TemporalType.DATE)
    private Date dschet;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUMMAV")
    private BigDecimal summav;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUMMAP")
    private BigDecimal summap;
    @Column(name = "SANK_MEK")
    private Long sankMek;
    @Column(name = "SANK_MEE")
    private BigDecimal sankMee;
    @Column(name = "SANK_EKMP")
    private BigDecimal sankEkmp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnswer")
    private Collection<SlAnswers> slAnswersCollection;

    public Answers() {
    }

    public Answers(Integer id) {
        this.id = id;
    }

    public Answers(Integer id, int idOutSchet, Date dateLoad, String okatoOms, int pYear, int pMonth, String nschet, Date dschet, BigDecimal summav, BigDecimal summap) {
        this.id = id;
        this.idOutSchet = idOutSchet;
        this.dateLoad = dateLoad;
        this.okatoOms = okatoOms;
        this.pYear = pYear;
        this.pMonth = pMonth;
        this.nschet = nschet;
        this.dschet = dschet;
        this.summav = summav;
        this.summap = summap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdOutSchet() {
        return idOutSchet;
    }

    public void setIdOutSchet(int idOutSchet) {
        this.idOutSchet = idOutSchet;
    }

    public Date getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    public String getOkatoOms() {
        return okatoOms;
    }

    public void setOkatoOms(String okatoOms) {
        this.okatoOms = okatoOms;
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

    public BigDecimal getSummap() {
        return summap;
    }

    public void setSummap(BigDecimal summap) {
        this.summap = summap;
    }

    public Long getSankMek() {
        return sankMek;
    }

    public void setSankMek(Long sankMek) {
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

    @XmlTransient
    public Collection<SlAnswers> getSlAnswersCollection() {
        return slAnswersCollection;
    }

    public void setSlAnswersCollection(Collection<SlAnswers> slAnswersCollection) {
        this.slAnswersCollection = slAnswersCollection;
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
        if (!(object instanceof Answers)) {
            return false;
        }
        Answers other = (Answers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.Answers[ id=" + id + " ]";
    }
    
}
