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
@Table(name = "syslog", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syslog.findAll", query = "SELECT s FROM Syslog s"),
    @NamedQuery(name = "Syslog.findByIDsyslog", query = "SELECT s FROM Syslog s WHERE s.iDsyslog = :iDsyslog"),
    @NamedQuery(name = "Syslog.findByDATETIMEsyslog", query = "SELECT s FROM Syslog s WHERE s.dATETIMEsyslog = :dATETIMEsyslog"),
    @NamedQuery(name = "Syslog.findByIDLOGINsyslog", query = "SELECT s FROM Syslog s WHERE s.iDLOGINsyslog = :iDLOGINsyslog"),
    @NamedQuery(name = "Syslog.findByADRESSsyslog", query = "SELECT s FROM Syslog s WHERE s.aDRESSsyslog = :aDRESSsyslog")})
public class Syslog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_syslog")
    private Integer iDsyslog;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATETIME_syslog")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dATETIMEsyslog;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLOGIN_syslog")
    private int iDLOGINsyslog;
    @Size(max = 15)
    @Column(name = "ADRESS_syslog")
    private String aDRESSsyslog;

    public Syslog() {
    }

    public Syslog(Integer iDsyslog) {
        this.iDsyslog = iDsyslog;
    }

    public Syslog(Integer iDsyslog, Date dATETIMEsyslog, int iDLOGINsyslog) {
        this.iDsyslog = iDsyslog;
        this.dATETIMEsyslog = dATETIMEsyslog;
        this.iDLOGINsyslog = iDLOGINsyslog;
    }

    public Integer getIDsyslog() {
        return iDsyslog;
    }

    public void setIDsyslog(Integer iDsyslog) {
        this.iDsyslog = iDsyslog;
    }

    public Date getDATETIMEsyslog() {
        return dATETIMEsyslog;
    }

    public void setDATETIMEsyslog(Date dATETIMEsyslog) {
        this.dATETIMEsyslog = dATETIMEsyslog;
    }

    public int getIDLOGINsyslog() {
        return iDLOGINsyslog;
    }

    public void setIDLOGINsyslog(int iDLOGINsyslog) {
        this.iDLOGINsyslog = iDLOGINsyslog;
    }

    public String getADRESSsyslog() {
        return aDRESSsyslog;
    }

    public void setADRESSsyslog(String aDRESSsyslog) {
        this.aDRESSsyslog = aDRESSsyslog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDsyslog != null ? iDsyslog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Syslog)) {
            return false;
        }
        Syslog other = (Syslog) object;
        if ((this.iDsyslog == null && other.iDsyslog != null) || (this.iDsyslog != null && !this.iDsyslog.equals(other.iDsyslog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.Syslog[ iDsyslog=" + iDsyslog + " ]";
    }
    
}
