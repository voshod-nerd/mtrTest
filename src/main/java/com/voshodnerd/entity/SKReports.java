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
@Table(name = "SK_Reports", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SKReports.findAll", query = "SELECT s FROM SKReports s"),
    @NamedQuery(name = "SKReports.findById", query = "SELECT s FROM SKReports s WHERE s.id = :id"),
    @NamedQuery(name = "SKReports.findByReportMode", query = "SELECT s FROM SKReports s WHERE s.reportMode = :reportMode"),
    @NamedQuery(name = "SKReports.findByDRep", query = "SELECT s FROM SKReports s WHERE s.dRep = :dRep"),
    @NamedQuery(name = "SKReports.findByReports", query = "SELECT s FROM SKReports s WHERE s.reports = :reports")})
public class SKReports implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReportMode")
    private int reportMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "D_REP")
    @Temporal(TemporalType.DATE)
    private Date dRep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Reports")
    private String reports;
    @JoinColumn(name = "ID_SCHET_LPU", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private JSchetLpu idSchetLpu;

    public SKReports() {
    }

    public SKReports(Integer id) {
        this.id = id;
    }

    public SKReports(Integer id, int reportMode, Date dRep, String reports) {
        this.id = id;
        this.reportMode = reportMode;
        this.dRep = dRep;
        this.reports = reports;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getReportMode() {
        return reportMode;
    }

    public void setReportMode(int reportMode) {
        this.reportMode = reportMode;
    }

    public Date getDRep() {
        return dRep;
    }

    public void setDRep(Date dRep) {
        this.dRep = dRep;
    }

    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }

    public JSchetLpu getIdSchetLpu() {
        return idSchetLpu;
    }

    public void setIdSchetLpu(JSchetLpu idSchetLpu) {
        this.idSchetLpu = idSchetLpu;
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
        if (!(object instanceof SKReports)) {
            return false;
        }
        SKReports other = (SKReports) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SKReports[ id=" + id + " ]";
    }
    
}
