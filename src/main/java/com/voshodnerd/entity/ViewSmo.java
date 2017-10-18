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
@Table(name = "ViewSmo", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewSmo.findAll", query = "SELECT v FROM ViewSmo v"),
    @NamedQuery(name = "ViewSmo.findByTfOkato", query = "SELECT v FROM ViewSmo v WHERE v.tfOkato = :tfOkato"),
    @NamedQuery(name = "ViewSmo.findBySmocod", query = "SELECT v FROM ViewSmo v WHERE v.smocod = :smocod"),
    @NamedQuery(name = "ViewSmo.findByNamSmok", query = "SELECT v FROM ViewSmo v WHERE v.namSmok = :namSmok"),
    @NamedQuery(name = "ViewSmo.findByInn", query = "SELECT v FROM ViewSmo v WHERE v.inn = :inn"),
    @NamedQuery(name = "ViewSmo.findByOgrn", query = "SELECT v FROM ViewSmo v WHERE v.ogrn = :ogrn"),
    @NamedQuery(name = "ViewSmo.findByDBegin", query = "SELECT v FROM ViewSmo v WHERE v.dBegin = :dBegin"),
    @NamedQuery(name = "ViewSmo.findByDEnd", query = "SELECT v FROM ViewSmo v WHERE v.dEnd = :dEnd")})
public class ViewSmo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "TF_OKATO")
    private String tfOkato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "SMOCOD")
    private String smocod;
    @Size(max = 250)
    @Column(name = "NAM_SMOK")
    private String namSmok;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "INN")
    private String inn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "OGRN")
    private String ogrn;
    @Column(name = "D_BEGIN")
    @Temporal(TemporalType.DATE)
    private Date dBegin;
    @Column(name = "d_end")
    @Temporal(TemporalType.DATE)
    private Date dEnd;

    public ViewSmo() {
    }

    public String getTfOkato() {
        return tfOkato;
    }

    public void setTfOkato(String tfOkato) {
        this.tfOkato = tfOkato;
    }

    public String getSmocod() {
        return smocod;
    }

    public void setSmocod(String smocod) {
        this.smocod = smocod;
    }

    public String getNamSmok() {
        return namSmok;
    }

    public void setNamSmok(String namSmok) {
        this.namSmok = namSmok;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public Date getDBegin() {
        return dBegin;
    }

    public void setDBegin(Date dBegin) {
        this.dBegin = dBegin;
    }

    public Date getDEnd() {
        return dEnd;
    }

    public void setDEnd(Date dEnd) {
        this.dEnd = dEnd;
    }
    
}
