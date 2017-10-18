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
@Table(name = "LogAction", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogAction.findAll", query = "SELECT l FROM LogAction l"),
    @NamedQuery(name = "LogAction.findById", query = "SELECT l FROM LogAction l WHERE l.id = :id"),
    @NamedQuery(name = "LogAction.findByDateEdit", query = "SELECT l FROM LogAction l WHERE l.dateEdit = :dateEdit"),
    @NamedQuery(name = "LogAction.findByIdUser", query = "SELECT l FROM LogAction l WHERE l.idUser = :idUser"),
    @NamedQuery(name = "LogAction.findByTableName", query = "SELECT l FROM LogAction l WHERE l.tableName = :tableName"),
    @NamedQuery(name = "LogAction.findByAction", query = "SELECT l FROM LogAction l WHERE l.action = :action")})
public class LogAction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateEdit")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEdit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_User")
    private int idUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TableName")
    private String tableName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Action")
    private String action;

    public LogAction() {
    }

    public LogAction(Integer id) {
        this.id = id;
    }

    public LogAction(Integer id, Date dateEdit, int idUser, String tableName, String action) {
        this.id = id;
        this.dateEdit = dateEdit;
        this.idUser = idUser;
        this.tableName = tableName;
        this.action = action;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
        if (!(object instanceof LogAction)) {
            return false;
        }
        LogAction other = (LogAction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.LogAction[ id=" + id + " ]";
    }
    
}
