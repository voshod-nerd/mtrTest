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
@Table(name = "Load_Docs", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoadDocs.findAll", query = "SELECT l FROM LoadDocs l"),
    @NamedQuery(name = "LoadDocs.findById", query = "SELECT l FROM LoadDocs l WHERE l.id = :id"),
    @NamedQuery(name = "LoadDocs.findByFileName", query = "SELECT l FROM LoadDocs l WHERE l.fileName = :fileName"),
    @NamedQuery(name = "LoadDocs.findByFileName1", query = "SELECT l FROM LoadDocs l WHERE l.fileName1 = :fileName1"),
    @NamedQuery(name = "LoadDocs.findByFSize", query = "SELECT l FROM LoadDocs l WHERE l.fSize = :fSize"),
    @NamedQuery(name = "LoadDocs.findByFdate", query = "SELECT l FROM LoadDocs l WHERE l.fdate = :fdate"),
    @NamedQuery(name = "LoadDocs.findByDLoad", query = "SELECT l FROM LoadDocs l WHERE l.dLoad = :dLoad"),
    @NamedQuery(name = "LoadDocs.findByUserID", query = "SELECT l FROM LoadDocs l WHERE l.userID = :userID"),
    @NamedQuery(name = "LoadDocs.findByTypeDoc", query = "SELECT l FROM LoadDocs l WHERE l.typeDoc = :typeDoc"),
    @NamedQuery(name = "LoadDocs.findByFile", query = "SELECT l FROM LoadDocs l WHERE l.file = :file"),
    @NamedQuery(name = "LoadDocs.findByFile1", query = "SELECT l FROM LoadDocs l WHERE l.file1 = :file1"),
    @NamedQuery(name = "LoadDocs.findByReport", query = "SELECT l FROM LoadDocs l WHERE l.report = :report")})
public class LoadDocs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 100)
    @Column(name = "FileName")
    private String fileName;
    @Size(max = 100)
    @Column(name = "FileName1")
    private String fileName1;
    @Column(name = "F_Size")
    private Integer fSize;
    @Column(name = "F_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fdate;
    @Column(name = "d_Load")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dLoad;
    @Column(name = "UserID")
    private Integer userID;
    @Column(name = "TypeDoc")
    private Integer typeDoc;
    @Size(max = 2147483647)
    @Column(name = "File_")
    private String file;
    @Size(max = 2147483647)
    @Column(name = "File_1")
    private String file1;
    @Size(max = 2147483647)
    @Column(name = "Report")
    private String report;

    public LoadDocs() {
    }

    public LoadDocs(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName1() {
        return fileName1;
    }

    public void setFileName1(String fileName1) {
        this.fileName1 = fileName1;
    }

    public Integer getFSize() {
        return fSize;
    }

    public void setFSize(Integer fSize) {
        this.fSize = fSize;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public Date getDLoad() {
        return dLoad;
    }

    public void setDLoad(Date dLoad) {
        this.dLoad = dLoad;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(Integer typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
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
        if (!(object instanceof LoadDocs)) {
            return false;
        }
        LoadDocs other = (LoadDocs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.LoadDocs[ id=" + id + " ]";
    }
    
}
