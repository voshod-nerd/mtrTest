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
@Table(name = "GroupExpense_MEE", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupExpenseMEE.findAll", query = "SELECT g FROM GroupExpenseMEE g"),
    @NamedQuery(name = "GroupExpenseMEE.findByIdGroup", query = "SELECT g FROM GroupExpenseMEE g WHERE g.idGroup = :idGroup"),
    @NamedQuery(name = "GroupExpenseMEE.findByNumAkt", query = "SELECT g FROM GroupExpenseMEE g WHERE g.numAkt = :numAkt"),
    @NamedQuery(name = "GroupExpenseMEE.findByDateAkt", query = "SELECT g FROM GroupExpenseMEE g WHERE g.dateAkt = :dateAkt"),
    @NamedQuery(name = "GroupExpenseMEE.findByDateprov", query = "SELECT g FROM GroupExpenseMEE g WHERE g.dateprov = :dateprov"),
    @NamedQuery(name = "GroupExpenseMEE.findByDateperS", query = "SELECT g FROM GroupExpenseMEE g WHERE g.dateperS = :dateperS"),
    @NamedQuery(name = "GroupExpenseMEE.findByDateperPo", query = "SELECT g FROM GroupExpenseMEE g WHERE g.dateperPo = :dateperPo"),
    @NamedQuery(name = "GroupExpenseMEE.findBySmosluchcount", query = "SELECT g FROM GroupExpenseMEE g WHERE g.smosluchcount = :smosluchcount"),
    @NamedQuery(name = "GroupExpenseMEE.findBySmosluchstac", query = "SELECT g FROM GroupExpenseMEE g WHERE g.smosluchstac = :smosluchstac"),
    @NamedQuery(name = "GroupExpenseMEE.findBySmosluchdaystac", query = "SELECT g FROM GroupExpenseMEE g WHERE g.smosluchdaystac = :smosluchdaystac"),
    @NamedQuery(name = "GroupExpenseMEE.findBySmosluchamb", query = "SELECT g FROM GroupExpenseMEE g WHERE g.smosluchamb = :smosluchamb"),
    @NamedQuery(name = "GroupExpenseMEE.findBySmosluchdef", query = "SELECT g FROM GroupExpenseMEE g WHERE g.smosluchdef = :smosluchdef"),
    @NamedQuery(name = "GroupExpenseMEE.findByClosed", query = "SELECT g FROM GroupExpenseMEE g WHERE g.closed = :closed"),
    @NamedQuery(name = "GroupExpenseMEE.findByExpertPost", query = "SELECT g FROM GroupExpenseMEE g WHERE g.expertPost = :expertPost"),
    @NamedQuery(name = "GroupExpenseMEE.findByExpertFio", query = "SELECT g FROM GroupExpenseMEE g WHERE g.expertFio = :expertFio"),
    @NamedQuery(name = "GroupExpenseMEE.findByExpert1Post", query = "SELECT g FROM GroupExpenseMEE g WHERE g.expert1Post = :expert1Post"),
    @NamedQuery(name = "GroupExpenseMEE.findByExpert1Fio", query = "SELECT g FROM GroupExpenseMEE g WHERE g.expert1Fio = :expert1Fio")})
public class GroupExpenseMEE implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_GROUP")
    private Integer idGroup;
    @Size(max = 20)
    @Column(name = "NUM_AKT")
    private String numAkt;
    @Column(name = "DATE_AKT")
    @Temporal(TemporalType.DATE)
    private Date dateAkt;
    @Column(name = "DATEPROV")
    @Temporal(TemporalType.DATE)
    private Date dateprov;
    @Column(name = "DATEPER_S")
    @Temporal(TemporalType.DATE)
    private Date dateperS;
    @Column(name = "DATEPER_PO")
    @Temporal(TemporalType.DATE)
    private Date dateperPo;
    @Column(name = "SMOSLUCHCOUNT")
    private Integer smosluchcount;
    @Column(name = "SMOSLUCHSTAC")
    private Integer smosluchstac;
    @Column(name = "SMOSLUCHDAYSTAC")
    private Integer smosluchdaystac;
    @Column(name = "SMOSLUCHAMB")
    private Integer smosluchamb;
    @Column(name = "SMOSLUCHDEF")
    private Integer smosluchdef;
    @Column(name = "CLOSED")
    private Boolean closed;
    @Size(max = 100)
    @Column(name = "EXPERT_POST")
    private String expertPost;
    @Size(max = 100)
    @Column(name = "EXPERT_FIO")
    private String expertFio;
    @Size(max = 100)
    @Column(name = "EXPERT1_POST")
    private String expert1Post;
    @Size(max = 100)
    @Column(name = "EXPERT1_FIO")
    private String expert1Fio;

    public GroupExpenseMEE() {
    }

    public GroupExpenseMEE(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public String getNumAkt() {
        return numAkt;
    }

    public void setNumAkt(String numAkt) {
        this.numAkt = numAkt;
    }

    public Date getDateAkt() {
        return dateAkt;
    }

    public void setDateAkt(Date dateAkt) {
        this.dateAkt = dateAkt;
    }

    public Date getDateprov() {
        return dateprov;
    }

    public void setDateprov(Date dateprov) {
        this.dateprov = dateprov;
    }

    public Date getDateperS() {
        return dateperS;
    }

    public void setDateperS(Date dateperS) {
        this.dateperS = dateperS;
    }

    public Date getDateperPo() {
        return dateperPo;
    }

    public void setDateperPo(Date dateperPo) {
        this.dateperPo = dateperPo;
    }

    public Integer getSmosluchcount() {
        return smosluchcount;
    }

    public void setSmosluchcount(Integer smosluchcount) {
        this.smosluchcount = smosluchcount;
    }

    public Integer getSmosluchstac() {
        return smosluchstac;
    }

    public void setSmosluchstac(Integer smosluchstac) {
        this.smosluchstac = smosluchstac;
    }

    public Integer getSmosluchdaystac() {
        return smosluchdaystac;
    }

    public void setSmosluchdaystac(Integer smosluchdaystac) {
        this.smosluchdaystac = smosluchdaystac;
    }

    public Integer getSmosluchamb() {
        return smosluchamb;
    }

    public void setSmosluchamb(Integer smosluchamb) {
        this.smosluchamb = smosluchamb;
    }

    public Integer getSmosluchdef() {
        return smosluchdef;
    }

    public void setSmosluchdef(Integer smosluchdef) {
        this.smosluchdef = smosluchdef;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getExpertPost() {
        return expertPost;
    }

    public void setExpertPost(String expertPost) {
        this.expertPost = expertPost;
    }

    public String getExpertFio() {
        return expertFio;
    }

    public void setExpertFio(String expertFio) {
        this.expertFio = expertFio;
    }

    public String getExpert1Post() {
        return expert1Post;
    }

    public void setExpert1Post(String expert1Post) {
        this.expert1Post = expert1Post;
    }

    public String getExpert1Fio() {
        return expert1Fio;
    }

    public void setExpert1Fio(String expert1Fio) {
        this.expert1Fio = expert1Fio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGroup != null ? idGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupExpenseMEE)) {
            return false;
        }
        GroupExpenseMEE other = (GroupExpenseMEE) object;
        if ((this.idGroup == null && other.idGroup != null) || (this.idGroup != null && !this.idGroup.equals(other.idGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.GroupExpenseMEE[ idGroup=" + idGroup + " ]";
    }
    
}
