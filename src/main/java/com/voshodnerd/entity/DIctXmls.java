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
@Table(name = "DIctXmls", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DIctXmls.findAll", query = "SELECT d FROM DIctXmls d"),
    @NamedQuery(name = "DIctXmls.findById", query = "SELECT d FROM DIctXmls d WHERE d.id = :id"),
    @NamedQuery(name = "DIctXmls.findByDictXML", query = "SELECT d FROM DIctXmls d WHERE d.dictXML = :dictXML")})
public class DIctXmls implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ID")
    private String id;
    @Size(max = 2147483647)
    @Column(name = "Dict_XML")
    private String dictXML;

    public DIctXmls() {
    }

    public DIctXmls(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDictXML() {
        return dictXML;
    }

    public void setDictXML(String dictXML) {
        this.dictXML = dictXML;
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
        if (!(object instanceof DIctXmls)) {
            return false;
        }
        DIctXmls other = (DIctXmls) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.DIctXmls[ id=" + id + " ]";
    }
    
}
