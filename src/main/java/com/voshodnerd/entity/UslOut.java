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
@Table(name = "Usl_Out", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UslOut.findAll", query = "SELECT u FROM UslOut u"),
    @NamedQuery(name = "UslOut.findById", query = "SELECT u FROM UslOut u WHERE u.id = :id"),
    @NamedQuery(name = "UslOut.findByIdserv", query = "SELECT u FROM UslOut u WHERE u.idserv = :idserv"),
    @NamedQuery(name = "UslOut.findByLpu", query = "SELECT u FROM UslOut u WHERE u.lpu = :lpu"),
    @NamedQuery(name = "UslOut.findByProfil", query = "SELECT u FROM UslOut u WHERE u.profil = :profil"),
    @NamedQuery(name = "UslOut.findByVidVme", query = "SELECT u FROM UslOut u WHERE u.vidVme = :vidVme"),
    @NamedQuery(name = "UslOut.findByDet", query = "SELECT u FROM UslOut u WHERE u.det = :det"),
    @NamedQuery(name = "UslOut.findByDateIn", query = "SELECT u FROM UslOut u WHERE u.dateIn = :dateIn"),
    @NamedQuery(name = "UslOut.findByDateOut", query = "SELECT u FROM UslOut u WHERE u.dateOut = :dateOut"),
    @NamedQuery(name = "UslOut.findByDs", query = "SELECT u FROM UslOut u WHERE u.ds = :ds"),
    @NamedQuery(name = "UslOut.findByUsl", query = "SELECT u FROM UslOut u WHERE u.usl = :usl"),
    @NamedQuery(name = "UslOut.findByKolUsl", query = "SELECT u FROM UslOut u WHERE u.kolUsl = :kolUsl"),
    @NamedQuery(name = "UslOut.findByTarif", query = "SELECT u FROM UslOut u WHERE u.tarif = :tarif"),
    @NamedQuery(name = "UslOut.findBySumvUsl", query = "SELECT u FROM UslOut u WHERE u.sumvUsl = :sumvUsl"),
    @NamedQuery(name = "UslOut.findByPrvs", query = "SELECT u FROM UslOut u WHERE u.prvs = :prvs"),
    @NamedQuery(name = "UslOut.findByComentu", query = "SELECT u FROM UslOut u WHERE u.comentu = :comentu")})
public class UslOut implements Serializable {

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
    @Column(name = "PROFIL")
    private Short profil;
    @Size(max = 15)
    @Column(name = "VID_VME")
    private String vidVme;
    @Column(name = "DET")
    private Short det;
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
    @Size(max = 10)
    @Column(name = "DS")
    private String ds;
    @Size(max = 254)
    @Column(name = "USL")
    private String usl;
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
    @Size(max = 250)
    @Column(name = "COMENTU")
    private String comentu;
    @JoinColumn(name = "ID_SLUCH", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private SkSluchOut idSluch;

    public UslOut() {
    }

    public UslOut(Integer id) {
        this.id = id;
    }

    public UslOut(Integer id, short idserv, String lpu, Date dateIn, Date dateOut, BigDecimal kolUsl, BigDecimal sumvUsl, int prvs) {
        this.id = id;
        this.idserv = idserv;
        this.lpu = lpu;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.kolUsl = kolUsl;
        this.sumvUsl = sumvUsl;
        this.prvs = prvs;
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

    public Short getProfil() {
        return profil;
    }

    public void setProfil(Short profil) {
        this.profil = profil;
    }

    public String getVidVme() {
        return vidVme;
    }

    public void setVidVme(String vidVme) {
        this.vidVme = vidVme;
    }

    public Short getDet() {
        return det;
    }

    public void setDet(Short det) {
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

    public String getUsl() {
        return usl;
    }

    public void setUsl(String usl) {
        this.usl = usl;
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

    public String getComentu() {
        return comentu;
    }

    public void setComentu(String comentu) {
        this.comentu = comentu;
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
        if (!(object instanceof UslOut)) {
            return false;
        }
        UslOut other = (UslOut) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.UslOut[ id=" + id + " ]";
    }
    
}
