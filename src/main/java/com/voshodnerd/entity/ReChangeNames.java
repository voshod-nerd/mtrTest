/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "ReChangeNames", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReChangeNames.findAll", query = "SELECT r FROM ReChangeNames r"),
    @NamedQuery(name = "ReChangeNames.findByColname", query = "SELECT r FROM ReChangeNames r WHERE r.colname = :colname"),
    @NamedQuery(name = "ReChangeNames.findByRusname", query = "SELECT r FROM ReChangeNames r WHERE r.rusname = :rusname"),
    @NamedQuery(name = "ReChangeNames.findByWIdth", query = "SELECT r FROM ReChangeNames r WHERE r.wIdth = :wIdth"),
    @NamedQuery(name = "ReChangeNames.findByVisible", query = "SELECT r FROM ReChangeNames r WHERE r.visible = :visible")})
public class ReChangeNames implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Col_name")
    private String colname;
    @Size(max = 150)
    @Column(name = "Rus_name")
    private String rusname;
    @Column(name = "WIdth")
    private Integer wIdth;
    @Column(name = "Visible")
    private Boolean visible;

    public ReChangeNames() {
    }

    public ReChangeNames(String colname) {
        this.colname = colname;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname;
    }

    public String getRusname() {
        return rusname;
    }

    public void setRusname(String rusname) {
        this.rusname = rusname;
    }

    public Integer getWIdth() {
        return wIdth;
    }

    public void setWIdth(Integer wIdth) {
        this.wIdth = wIdth;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (colname != null ? colname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReChangeNames)) {
            return false;
        }
        ReChangeNames other = (ReChangeNames) object;
        if ((this.colname == null && other.colname != null) || (this.colname != null && !this.colname.equals(other.colname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.ReChangeNames[ colname=" + colname + " ]";
    }
    
}
