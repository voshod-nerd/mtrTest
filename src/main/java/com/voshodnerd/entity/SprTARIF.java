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
@Table(name = "spr_TARIF", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SprTARIF.findAll", query = "SELECT s FROM SprTARIF s"),
    @NamedQuery(name = "SprTARIF.findById", query = "SELECT s FROM SprTARIF s WHERE s.id = :id"),
    @NamedQuery(name = "SprTARIF.findByVers", query = "SELECT s FROM SprTARIF s WHERE s.vers = :vers"),
    @NamedQuery(name = "SprTARIF.findByDEdit", query = "SELECT s FROM SprTARIF s WHERE s.dEdit = :dEdit"),
    @NamedQuery(name = "SprTARIF.findByVidpomT", query = "SELECT s FROM SprTARIF s WHERE s.vidpomT = :vidpomT"),
    @NamedQuery(name = "SprTARIF.findByIdUmp", query = "SELECT s FROM SprTARIF s WHERE s.idUmp = :idUmp"),
    @NamedQuery(name = "SprTARIF.findByIdSp", query = "SELECT s FROM SprTARIF s WHERE s.idSp = :idSp"),
    @NamedQuery(name = "SprTARIF.findByIdPr", query = "SELECT s FROM SprTARIF s WHERE s.idPr = :idPr"),
    @NamedQuery(name = "SprTARIF.findByDetT", query = "SELECT s FROM SprTARIF s WHERE s.detT = :detT"),
    @NamedQuery(name = "SprTARIF.findByTarifName", query = "SELECT s FROM SprTARIF s WHERE s.tarifName = :tarifName"),
    @NamedQuery(name = "SprTARIF.findByTarif", query = "SELECT s FROM SprTARIF s WHERE s.tarif = :tarif"),
    @NamedQuery(name = "SprTARIF.findByTip", query = "SELECT s FROM SprTARIF s WHERE s.tip = :tip"),
    @NamedQuery(name = "SprTARIF.findByDB", query = "SELECT s FROM SprTARIF s WHERE s.dB = :dB"),
    @NamedQuery(name = "SprTARIF.findByDE", query = "SELECT s FROM SprTARIF s WHERE s.dE = :dE")})
public class SprTARIF implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 5)
    @Column(name = "VERS")
    private String vers;
    @Column(name = "D_EDIT")
    @Temporal(TemporalType.DATE)
    private Date dEdit;
    @Column(name = "VIDPOM_T")
    private Character vidpomT;
    @Column(name = "ID_UMP")
    private Integer idUmp;
    @Column(name = "ID_SP")
    private Integer idSp;
    @Column(name = "ID_PR")
    private Integer idPr;
    @Column(name = "DET_T")
    private Integer detT;
    @Size(max = 255)
    @Column(name = "TARIF_NAME")
    private String tarifName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TARIF")
    private BigDecimal tarif;
    @Column(name = "TIP")
    private Integer tip;
    @Column(name = "D_B")
    @Temporal(TemporalType.DATE)
    private Date dB;
    @Column(name = "D_E")
    @Temporal(TemporalType.DATE)
    private Date dE;

    public SprTARIF() {
    }

    public SprTARIF(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVers() {
        return vers;
    }

    public void setVers(String vers) {
        this.vers = vers;
    }

    public Date getDEdit() {
        return dEdit;
    }

    public void setDEdit(Date dEdit) {
        this.dEdit = dEdit;
    }

    public Character getVidpomT() {
        return vidpomT;
    }

    public void setVidpomT(Character vidpomT) {
        this.vidpomT = vidpomT;
    }

    public Integer getIdUmp() {
        return idUmp;
    }

    public void setIdUmp(Integer idUmp) {
        this.idUmp = idUmp;
    }

    public Integer getIdSp() {
        return idSp;
    }

    public void setIdSp(Integer idSp) {
        this.idSp = idSp;
    }

    public Integer getIdPr() {
        return idPr;
    }

    public void setIdPr(Integer idPr) {
        this.idPr = idPr;
    }

    public Integer getDetT() {
        return detT;
    }

    public void setDetT(Integer detT) {
        this.detT = detT;
    }

    public String getTarifName() {
        return tarifName;
    }

    public void setTarifName(String tarifName) {
        this.tarifName = tarifName;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    public Date getDB() {
        return dB;
    }

    public void setDB(Date dB) {
        this.dB = dB;
    }

    public Date getDE() {
        return dE;
    }

    public void setDE(Date dE) {
        this.dE = dE;
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
        if (!(object instanceof SprTARIF)) {
            return false;
        }
        SprTARIF other = (SprTARIF) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SprTARIF[ id=" + id + " ]";
    }
    
}
