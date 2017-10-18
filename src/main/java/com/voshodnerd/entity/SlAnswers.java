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
@Table(name = "Sl_Answers", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SlAnswers.findAll", query = "SELECT s FROM SlAnswers s"),
    @NamedQuery(name = "SlAnswers.findById", query = "SELECT s FROM SlAnswers s WHERE s.id = :id"),
    @NamedQuery(name = "SlAnswers.findByVpolis", query = "SELECT s FROM SlAnswers s WHERE s.vpolis = :vpolis"),
    @NamedQuery(name = "SlAnswers.findBySpolis", query = "SELECT s FROM SlAnswers s WHERE s.spolis = :spolis"),
    @NamedQuery(name = "SlAnswers.findByNpolis", query = "SELECT s FROM SlAnswers s WHERE s.npolis = :npolis"),
    @NamedQuery(name = "SlAnswers.findByIdcase", query = "SELECT s FROM SlAnswers s WHERE s.idcase = :idcase"),
    @NamedQuery(name = "SlAnswers.findByNhistory", query = "SELECT s FROM SlAnswers s WHERE s.nhistory = :nhistory"),
    @NamedQuery(name = "SlAnswers.findByIdsp", query = "SELECT s FROM SlAnswers s WHERE s.idsp = :idsp"),
    @NamedQuery(name = "SlAnswers.findByEdCol", query = "SELECT s FROM SlAnswers s WHERE s.edCol = :edCol"),
    @NamedQuery(name = "SlAnswers.findByTarif", query = "SELECT s FROM SlAnswers s WHERE s.tarif = :tarif"),
    @NamedQuery(name = "SlAnswers.findBySumv", query = "SELECT s FROM SlAnswers s WHERE s.sumv = :sumv"),
    @NamedQuery(name = "SlAnswers.findByOplata", query = "SELECT s FROM SlAnswers s WHERE s.oplata = :oplata"),
    @NamedQuery(name = "SlAnswers.findBySump", query = "SELECT s FROM SlAnswers s WHERE s.sump = :sump"),
    @NamedQuery(name = "SlAnswers.findBySankIt", query = "SELECT s FROM SlAnswers s WHERE s.sankIt = :sankIt"),
    @NamedQuery(name = "SlAnswers.findByComentsl", query = "SELECT s FROM SlAnswers s WHERE s.comentsl = :comentsl")})
public class SlAnswers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VPOLIS")
    private int vpolis;
    @Size(max = 10)
    @Column(name = "SPOLIS")
    private String spolis;
    @Size(max = 20)
    @Column(name = "NPOLIS")
    private String npolis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCASE")
    private int idcase;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NHISTORY")
    private String nhistory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSP")
    private int idsp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ED_COL")
    private BigDecimal edCol;
    @Column(name = "TARIF")
    private BigDecimal tarif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUMV")
    private BigDecimal sumv;
    @Column(name = "OPLATA")
    private Integer oplata;
    @Column(name = "SUMP")
    private BigDecimal sump;
    @Column(name = "SANK_IT")
    private BigDecimal sankIt;
    @Size(max = 250)
    @Column(name = "COMENTSL")
    private String comentsl;
    @JoinColumn(name = "Id_Answer", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Answers idAnswer;
    @JoinColumn(name = "Id_Sluch_Out", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private SkSluchOut idSluchOut;

    public SlAnswers() {
    }

    public SlAnswers(Integer id) {
        this.id = id;
    }

    public SlAnswers(Integer id, int vpolis, int idcase, String nhistory, int idsp, BigDecimal sumv) {
        this.id = id;
        this.vpolis = vpolis;
        this.idcase = idcase;
        this.nhistory = nhistory;
        this.idsp = idsp;
        this.sumv = sumv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVpolis() {
        return vpolis;
    }

    public void setVpolis(int vpolis) {
        this.vpolis = vpolis;
    }

    public String getSpolis() {
        return spolis;
    }

    public void setSpolis(String spolis) {
        this.spolis = spolis;
    }

    public String getNpolis() {
        return npolis;
    }

    public void setNpolis(String npolis) {
        this.npolis = npolis;
    }

    public int getIdcase() {
        return idcase;
    }

    public void setIdcase(int idcase) {
        this.idcase = idcase;
    }

    public String getNhistory() {
        return nhistory;
    }

    public void setNhistory(String nhistory) {
        this.nhistory = nhistory;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public BigDecimal getEdCol() {
        return edCol;
    }

    public void setEdCol(BigDecimal edCol) {
        this.edCol = edCol;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public BigDecimal getSumv() {
        return sumv;
    }

    public void setSumv(BigDecimal sumv) {
        this.sumv = sumv;
    }

    public Integer getOplata() {
        return oplata;
    }

    public void setOplata(Integer oplata) {
        this.oplata = oplata;
    }

    public BigDecimal getSump() {
        return sump;
    }

    public void setSump(BigDecimal sump) {
        this.sump = sump;
    }

    public BigDecimal getSankIt() {
        return sankIt;
    }

    public void setSankIt(BigDecimal sankIt) {
        this.sankIt = sankIt;
    }

    public String getComentsl() {
        return comentsl;
    }

    public void setComentsl(String comentsl) {
        this.comentsl = comentsl;
    }

    public Answers getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(Answers idAnswer) {
        this.idAnswer = idAnswer;
    }

    public SkSluchOut getIdSluchOut() {
        return idSluchOut;
    }

    public void setIdSluchOut(SkSluchOut idSluchOut) {
        this.idSluchOut = idSluchOut;
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
        if (!(object instanceof SlAnswers)) {
            return false;
        }
        SlAnswers other = (SlAnswers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SlAnswers[ id=" + id + " ]";
    }
    
}
