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
@Table(name = "MEE_DEF", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MeeDef.findAll", query = "SELECT m FROM MeeDef m"),
    @NamedQuery(name = "MeeDef.findByIdMeedef", query = "SELECT m FROM MeeDef m WHERE m.idMeedef = :idMeedef"),
    @NamedQuery(name = "MeeDef.findByIddefMeedef", query = "SELECT m FROM MeeDef m WHERE m.iddefMeedef = :iddefMeedef"),
    @NamedQuery(name = "MeeDef.findByIdmeeMeedef", query = "SELECT m FROM MeeDef m WHERE m.idmeeMeedef = :idmeeMeedef"),
    @NamedQuery(name = "MeeDef.findByMainMeedef", query = "SELECT m FROM MeeDef m WHERE m.mainMeedef = :mainMeedef")})
public class MeeDef implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEEDEF")
    private Integer idMeedef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEF_MEEDEF")
    private int iddefMeedef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMEE_MEEDEF")
    private int idmeeMeedef;
    @Column(name = "MAIN_MEEDEF")
    private Boolean mainMeedef;

    public MeeDef() {
    }

    public MeeDef(Integer idMeedef) {
        this.idMeedef = idMeedef;
    }

    public MeeDef(Integer idMeedef, int iddefMeedef, int idmeeMeedef) {
        this.idMeedef = idMeedef;
        this.iddefMeedef = iddefMeedef;
        this.idmeeMeedef = idmeeMeedef;
    }

    public Integer getIdMeedef() {
        return idMeedef;
    }

    public void setIdMeedef(Integer idMeedef) {
        this.idMeedef = idMeedef;
    }

    public int getIddefMeedef() {
        return iddefMeedef;
    }

    public void setIddefMeedef(int iddefMeedef) {
        this.iddefMeedef = iddefMeedef;
    }

    public int getIdmeeMeedef() {
        return idmeeMeedef;
    }

    public void setIdmeeMeedef(int idmeeMeedef) {
        this.idmeeMeedef = idmeeMeedef;
    }

    public Boolean getMainMeedef() {
        return mainMeedef;
    }

    public void setMainMeedef(Boolean mainMeedef) {
        this.mainMeedef = mainMeedef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMeedef != null ? idMeedef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MeeDef)) {
            return false;
        }
        MeeDef other = (MeeDef) object;
        if ((this.idMeedef == null && other.idMeedef != null) || (this.idMeedef != null && !this.idMeedef.equals(other.idMeedef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.MeeDef[ idMeedef=" + idMeedef + " ]";
    }
    
}
