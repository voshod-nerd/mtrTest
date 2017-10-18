/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Usl_D", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UslD.findAll", query = "SELECT u FROM UslD u"),
    @NamedQuery(name = "UslD.findById", query = "SELECT u FROM UslD u WHERE u.id = :id"),
    @NamedQuery(name = "UslD.findByIdserv", query = "SELECT u FROM UslD u WHERE u.idserv = :idserv"),
    @NamedQuery(name = "UslD.findByLpu", query = "SELECT u FROM UslD u WHERE u.lpu = :lpu"),
    @NamedQuery(name = "UslD.findByLpu1", query = "SELECT u FROM UslD u WHERE u.lpu1 = :lpu1"),
    @NamedQuery(name = "UslD.findByPodr", query = "SELECT u FROM UslD u WHERE u.podr = :podr"),
    @NamedQuery(name = "UslD.findByProfil", query = "SELECT u FROM UslD u WHERE u.profil = :profil"),
    @NamedQuery(name = "UslD.findByVidVme", query = "SELECT u FROM UslD u WHERE u.vidVme = :vidVme"),
    @NamedQuery(name = "UslD.findByDet", query = "SELECT u FROM UslD u WHERE u.det = :det"),
    @NamedQuery(name = "UslD.findByDateIn", query = "SELECT u FROM UslD u WHERE u.dateIn = :dateIn"),
    @NamedQuery(name = "UslD.findByDateOut", query = "SELECT u FROM UslD u WHERE u.dateOut = :dateOut"),
    @NamedQuery(name = "UslD.findByDs", query = "SELECT u FROM UslD u WHERE u.ds = :ds"),
    @NamedQuery(name = "UslD.findByCodeUsl", query = "SELECT u FROM UslD u WHERE u.codeUsl = :codeUsl"),
    @NamedQuery(name = "UslD.findByKolUsl", query = "SELECT u FROM UslD u WHERE u.kolUsl = :kolUsl"),
    @NamedQuery(name = "UslD.findByTarif", query = "SELECT u FROM UslD u WHERE u.tarif = :tarif"),
    @NamedQuery(name = "UslD.findBySumvUsl", query = "SELECT u FROM UslD u WHERE u.sumvUsl = :sumvUsl"),
    @NamedQuery(name = "UslD.findByPrvs", query = "SELECT u FROM UslD u WHERE u.prvs = :prvs"),
    @NamedQuery(name = "UslD.findByCodeMd", query = "SELECT u FROM UslD u WHERE u.codeMd = :codeMd"),
    @NamedQuery(name = "UslD.findByComentu", query = "SELECT u FROM UslD u WHERE u.comentu = :comentu")})
public class UslD implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSERV")
    private short idserv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "LPU")
    private String lpu;
    @Size(max = 8)
    @Column(name = "LPU_1")
    private String lpu1;
    @Column(name = "PODR")
    private Integer podr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROFIL")
    private short profil;
    @Size(max = 15)
    @Column(name = "VID_VME")
    private String vidVme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET")
    private short det;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_IN")
    @Temporal(TemporalType.DATE)
    private Date dateIn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_OUT")
    @Temporal(TemporalType.DATE)
    private Date dateOut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DS")
    private String ds;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_USL")
    private String codeUsl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "KOL_USL")
    private BigDecimal kolUsl;
    @Column(name = "TARIF")
    private BigDecimal tarif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUMV_USL")
    private BigDecimal sumvUsl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRVS")
    private int prvs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CODE_MD")
    private String codeMd;
    @Size(max = 250)
    @Column(name = "COMENTU")
    private String comentu;
    @JoinColumn(name = "ID_SLUCH", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private SkSluchD idSluch;

    public UslD() {
    }

    public UslD(Integer id) {
        this.id = id;
    }

    public UslD(Integer id, short idserv, String lpu, short profil, short det, Date dateIn, Date dateOut, String ds, String codeUsl, BigDecimal kolUsl, BigDecimal sumvUsl, int prvs, String codeMd) {
        this.id = id;
        this.idserv = idserv;
        this.lpu = lpu;
        this.profil = profil;
        this.det = det;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.ds = ds;
        this.codeUsl = codeUsl;
        this.kolUsl = kolUsl;
        this.sumvUsl = sumvUsl;
        this.prvs = prvs;
        this.codeMd = codeMd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getIdserv() {
        return idserv;
    }

    public void setIdserv(short idserv) {
        this.idserv = idserv;
    }

    public String getLpu() {
        return lpu;
    }

    public void setLpu(String lpu) {
        this.lpu = lpu;
    }

    public String getLpu1() {
        return lpu1;
    }

    public void setLpu1(String lpu1) {
        this.lpu1 = lpu1;
    }

    public Integer getPodr() {
        return podr;
    }

    public void setPodr(Integer podr) {
        this.podr = podr;
    }

    public short getProfil() {
        return profil;
    }

    public void setProfil(short profil) {
        this.profil = profil;
    }

    public String getVidVme() {
        return vidVme;
    }

    public void setVidVme(String vidVme) {
        this.vidVme = vidVme;
    }

    public short getDet() {
        return det;
    }

    public void setDet(short det) {
        this.det = det;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getCodeUsl() {
        return codeUsl;
    }

    public void setCodeUsl(String codeUsl) {
        this.codeUsl = codeUsl;
    }

    public BigDecimal getKolUsl() {
        return kolUsl;
    }

    public void setKolUsl(BigDecimal kolUsl) {
        this.kolUsl = kolUsl;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public BigDecimal getSumvUsl() {
        return sumvUsl;
    }

    public void setSumvUsl(BigDecimal sumvUsl) {
        this.sumvUsl = sumvUsl;
    }

    public int getPrvs() {
        return prvs;
    }

    public void setPrvs(int prvs) {
        this.prvs = prvs;
    }

    public String getCodeMd() {
        return codeMd;
    }

    public void setCodeMd(String codeMd) {
        this.codeMd = codeMd;
    }

    public String getComentu() {
        return comentu;
    }

    public void setComentu(String comentu) {
        this.comentu = comentu;
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
        if (!(object instanceof UslD)) {
            return false;
        }
        UslD other = (UslD) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.UslD[ id=" + id + " ]";
    }
    
}
