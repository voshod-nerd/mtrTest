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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "GroupsMEE", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupsMEE.findAll", query = "SELECT g FROM GroupsMEE g"),
    @NamedQuery(name = "GroupsMEE.findByIdGroup", query = "SELECT g FROM GroupsMEE g WHERE g.idGroup = :idGroup"),
    @NamedQuery(name = "GroupsMEE.findByIdSchet", query = "SELECT g FROM GroupsMEE g WHERE g.idSchet = :idSchet"),
    @NamedQuery(name = "GroupsMEE.findByIdRec", query = "SELECT g FROM GroupsMEE g WHERE g.idRec = :idRec")})
public class GroupsMEE implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ID_GROUP")
    private Integer idGroup;
    @Column(name = "ID_SCHET")
    private Integer idSchet;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_REC")
    private Integer idRec;

    public GroupsMEE() {
    }

    public GroupsMEE(Integer idRec) {
        this.idRec = idRec;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdSchet() {
        return idSchet;
    }

    public void setIdSchet(Integer idSchet) {
        this.idSchet = idSchet;
    }

    public Integer getIdRec() {
        return idRec;
    }

    public void setIdRec(Integer idRec) {
        this.idRec = idRec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRec != null ? idRec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupsMEE)) {
            return false;
        }
        GroupsMEE other = (GroupsMEE) object;
        if ((this.idRec == null && other.idRec != null) || (this.idRec != null && !this.idRec.equals(other.idRec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.GroupsMEE[ idRec=" + idRec + " ]";
    }
    
}
