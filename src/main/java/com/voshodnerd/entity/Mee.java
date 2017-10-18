/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "MEE", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mee.findAll", query = "SELECT m FROM Mee m"),
    @NamedQuery(name = "Mee.findByIdMee", query = "SELECT m FROM Mee m WHERE m.idMee = :idMee"),
    @NamedQuery(name = "Mee.findByPlatMee", query = "SELECT m FROM Mee m WHERE m.platMee = :platMee"),
    @NamedQuery(name = "Mee.findByIdslMee", query = "SELECT m FROM Mee m WHERE m.idslMee = :idslMee"),
    @NamedQuery(name = "Mee.findByExpertizaMee", query = "SELECT m FROM Mee m WHERE m.expertizaMee = :expertizaMee"),
    @NamedQuery(name = "Mee.findByIdscMee", query = "SELECT m FROM Mee m WHERE m.idscMee = :idscMee"),
    @NamedQuery(name = "Mee.findByIdusMee", query = "SELECT m FROM Mee m WHERE m.idusMee = :idusMee"),
    @NamedQuery(name = "Mee.findByDbegMee", query = "SELECT m FROM Mee m WHERE m.dbegMee = :dbegMee"),
    @NamedQuery(name = "Mee.findByDendMee", query = "SELECT m FROM Mee m WHERE m.dendMee = :dendMee"),
    @NamedQuery(name = "Mee.findByNumAktMee", query = "SELECT m FROM Mee m WHERE m.numAktMee = :numAktMee"),
    @NamedQuery(name = "Mee.findByVidMee", query = "SELECT m FROM Mee m WHERE m.vidMee = :vidMee"),
    @NamedQuery(name = "Mee.findBySankMee", query = "SELECT m FROM Mee m WHERE m.sankMee = :sankMee"),
    @NamedQuery(name = "Mee.findByRefrMee", query = "SELECT m FROM Mee m WHERE m.refrMee = :refrMee"),
    @NamedQuery(name = "Mee.findBySummap", query = "SELECT m FROM Mee m WHERE m.summap = :summap"),
    @NamedQuery(name = "Mee.findByCommentMee", query = "SELECT m FROM Mee m WHERE m.commentMee = :commentMee"),
    @NamedQuery(name = "Mee.findBySummav", query = "SELECT m FROM Mee m WHERE m.summav = :summav"),
    @NamedQuery(name = "Mee.findByMyMaimDefMEE", query = "SELECT m FROM Mee m WHERE m.myMaimDefMEE = :myMaimDefMEE"),
    @NamedQuery(name = "Mee.findByShtrafMee", query = "SELECT m FROM Mee m WHERE m.shtrafMee = :shtrafMee"),
    @NamedQuery(name = "Mee.findByDAktMee", query = "SELECT m FROM Mee m WHERE m.dAktMee = :dAktMee"),
    @NamedQuery(name = "Mee.findByUnlocked", query = "SELECT m FROM Mee m WHERE m.unlocked = :unlocked"),
    @NamedQuery(name = "Mee.findBySmoDef", query = "SELECT m FROM Mee m WHERE m.smoDef = :smoDef"),
    @NamedQuery(name = "Mee.findBySmoComment", query = "SELECT m FROM Mee m WHERE m.smoComment = :smoComment"),
    @NamedQuery(name = "Mee.findBySmoSank", query = "SELECT m FROM Mee m WHERE m.smoSank = :smoSank"),
    @NamedQuery(name = "Mee.findBySmoOtk", query = "SELECT m FROM Mee m WHERE m.smoOtk = :smoOtk"),
    @NamedQuery(name = "Mee.findBySmoOtkSum", query = "SELECT m FROM Mee m WHERE m.smoOtkSum = :smoOtkSum"),
    @NamedQuery(name = "Mee.findBySmoNumakt", query = "SELECT m FROM Mee m WHERE m.smoNumakt = :smoNumakt"),
    @NamedQuery(name = "Mee.findBySmoDakt", query = "SELECT m FROM Mee m WHERE m.smoDakt = :smoDakt")})
public class Mee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEE")
    private Integer idMee;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PLAT_MEE")
    private String platMee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSL_MEE")
    private int idslMee;
    @Column(name = "EXPERTIZA_MEE")
    private Boolean expertizaMee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSC_MEE")
    private int idscMee;
    @Column(name = "IDUS_MEE")
    private Integer idusMee;
    @Column(name = "DBEG_MEE")
    @Temporal(TemporalType.DATE)
    private Date dbegMee;
    @Column(name = "DEND_MEE")
    @Temporal(TemporalType.DATE)
    private Date dendMee;
    @Size(max = 50)
    @Column(name = "NUM_AKT_MEE")
    private String numAktMee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VID_MEE")
    private int vidMee;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SANK_MEE")
    private Double sankMee;
    @Column(name = "REFR_MEE")
    private Integer refrMee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUMMAP")
    private double summap;
    @Size(max = 255)
    @Column(name = "COMMENT_MEE")
    private String commentMee;
    @Column(name = "SUMMAV")
    private Double summav;
    @Column(name = "MyMaimDef_MEE")
    private Boolean myMaimDefMEE;
    @Column(name = "SHTRAF_MEE")
    private Double shtrafMee;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DOP_MEE")
    private String dopMee;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ZAKL_MEE")
    private String zaklMee;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "VIV_MEE")
    private String vivMee;
    @Column(name = "D_AKT_MEE")
    @Temporal(TemporalType.DATE)
    private Date dAktMee;
    @Column(name = "UNLOCKED")
    private Boolean unlocked;
    @Size(max = 10)
    @Column(name = "SMO_DEF")
    private String smoDef;
    @Size(max = 800)
    @Column(name = "SMO_COMMENT")
    private String smoComment;
    @Column(name = "SMO_SANK")
    private Double smoSank;
    @Size(max = 10)
    @Column(name = "SMO_OTK")
    private String smoOtk;
    @Column(name = "SMO_OTK_SUM")
    private Double smoOtkSum;
    @Size(max = 10)
    @Column(name = "SMO_NUMAKT")
    private String smoNumakt;
    @Column(name = "SMO_DAKT")
    @Temporal(TemporalType.DATE)
    private Date smoDakt;

    public Mee() {
    }

    public Mee(Integer idMee) {
        this.idMee = idMee;
    }

    public Mee(Integer idMee, String platMee, int idslMee, int idscMee, int vidMee, double summap) {
        this.idMee = idMee;
        this.platMee = platMee;
        this.idslMee = idslMee;
        this.idscMee = idscMee;
        this.vidMee = vidMee;
        this.summap = summap;
    }

    public Integer getIdMee() {
        return idMee;
    }

    public void setIdMee(Integer idMee) {
        this.idMee = idMee;
    }

    public String getPlatMee() {
        return platMee;
    }

    public void setPlatMee(String platMee) {
        this.platMee = platMee;
    }

    public int getIdslMee() {
        return idslMee;
    }

    public void setIdslMee(int idslMee) {
        this.idslMee = idslMee;
    }

    public Boolean getExpertizaMee() {
        return expertizaMee;
    }

    public void setExpertizaMee(Boolean expertizaMee) {
        this.expertizaMee = expertizaMee;
    }

    public int getIdscMee() {
        return idscMee;
    }

    public void setIdscMee(int idscMee) {
        this.idscMee = idscMee;
    }

    public Integer getIdusMee() {
        return idusMee;
    }

    public void setIdusMee(Integer idusMee) {
        this.idusMee = idusMee;
    }

    public Date getDbegMee() {
        return dbegMee;
    }

    public void setDbegMee(Date dbegMee) {
        this.dbegMee = dbegMee;
    }

    public Date getDendMee() {
        return dendMee;
    }

    public void setDendMee(Date dendMee) {
        this.dendMee = dendMee;
    }

    public String getNumAktMee() {
        return numAktMee;
    }

    public void setNumAktMee(String numAktMee) {
        this.numAktMee = numAktMee;
    }

    public int getVidMee() {
        return vidMee;
    }

    public void setVidMee(int vidMee) {
        this.vidMee = vidMee;
    }

    public Double getSankMee() {
        return sankMee;
    }

    public void setSankMee(Double sankMee) {
        this.sankMee = sankMee;
    }

    public Integer getRefrMee() {
        return refrMee;
    }

    public void setRefrMee(Integer refrMee) {
        this.refrMee = refrMee;
    }

    public double getSummap() {
        return summap;
    }

    public void setSummap(double summap) {
        this.summap = summap;
    }

    public String getCommentMee() {
        return commentMee;
    }

    public void setCommentMee(String commentMee) {
        this.commentMee = commentMee;
    }

    public Double getSummav() {
        return summav;
    }

    public void setSummav(Double summav) {
        this.summav = summav;
    }

    public Boolean getMyMaimDefMEE() {
        return myMaimDefMEE;
    }

    public void setMyMaimDefMEE(Boolean myMaimDefMEE) {
        this.myMaimDefMEE = myMaimDefMEE;
    }

    public Double getShtrafMee() {
        return shtrafMee;
    }

    public void setShtrafMee(Double shtrafMee) {
        this.shtrafMee = shtrafMee;
    }

    public String getDopMee() {
        return dopMee;
    }

    public void setDopMee(String dopMee) {
        this.dopMee = dopMee;
    }

    public String getZaklMee() {
        return zaklMee;
    }

    public void setZaklMee(String zaklMee) {
        this.zaklMee = zaklMee;
    }

    public String getVivMee() {
        return vivMee;
    }

    public void setVivMee(String vivMee) {
        this.vivMee = vivMee;
    }

    public Date getDAktMee() {
        return dAktMee;
    }

    public void setDAktMee(Date dAktMee) {
        this.dAktMee = dAktMee;
    }

    public Boolean getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(Boolean unlocked) {
        this.unlocked = unlocked;
    }

    public String getSmoDef() {
        return smoDef;
    }

    public void setSmoDef(String smoDef) {
        this.smoDef = smoDef;
    }

    public String getSmoComment() {
        return smoComment;
    }

    public void setSmoComment(String smoComment) {
        this.smoComment = smoComment;
    }

    public Double getSmoSank() {
        return smoSank;
    }

    public void setSmoSank(Double smoSank) {
        this.smoSank = smoSank;
    }

    public String getSmoOtk() {
        return smoOtk;
    }

    public void setSmoOtk(String smoOtk) {
        this.smoOtk = smoOtk;
    }

    public Double getSmoOtkSum() {
        return smoOtkSum;
    }

    public void setSmoOtkSum(Double smoOtkSum) {
        this.smoOtkSum = smoOtkSum;
    }

    public String getSmoNumakt() {
        return smoNumakt;
    }

    public void setSmoNumakt(String smoNumakt) {
        this.smoNumakt = smoNumakt;
    }

    public Date getSmoDakt() {
        return smoDakt;
    }

    public void setSmoDakt(Date smoDakt) {
        this.smoDakt = smoDakt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMee != null ? idMee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mee)) {
            return false;
        }
        Mee other = (Mee) object;
        if ((this.idMee == null && other.idMee != null) || (this.idMee != null && !this.idMee.equals(other.idMee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.Mee[ idMee=" + idMee + " ]";
    }
    
}
