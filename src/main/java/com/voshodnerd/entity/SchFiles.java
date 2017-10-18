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
@Table(name = "SchFiles", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SchFiles.findAll", query = "SELECT s FROM SchFiles s"),
    @NamedQuery(name = "SchFiles.findById", query = "SELECT s FROM SchFiles s WHERE s.id = :id"),
    @NamedQuery(name = "SchFiles.findByDateLoad", query = "SELECT s FROM SchFiles s WHERE s.dateLoad = :dateLoad"),
    @NamedQuery(name = "SchFiles.findByNUpd", query = "SELECT s FROM SchFiles s WHERE s.nUpd = :nUpd"),
    @NamedQuery(name = "SchFiles.findByHFile", query = "SELECT s FROM SchFiles s WHERE s.hFile = :hFile"),
    @NamedQuery(name = "SchFiles.findByLFile", query = "SELECT s FROM SchFiles s WHERE s.lFile = :lFile"),
    @NamedQuery(name = "SchFiles.findByIdUser", query = "SELECT s FROM SchFiles s WHERE s.idUser = :idUser")})
public class SchFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateLoad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLoad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "N_Upd")
    private int nUpd;
    @Size(max = 2147483647)
    @Column(name = "H_File")
    private String hFile;
    @Size(max = 2147483647)
    @Column(name = "L_File")
    private String lFile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_User")
    private int idUser;
    @JoinColumn(name = "Id_Schet_TF", referencedColumnName = "Id")
    @ManyToOne
    private JSchetFromTF idSchetTF;
    @JoinColumn(name = "Id_Schet_Lpu", referencedColumnName = "Id")
    @ManyToOne
    private JSchetLpu idSchetLpu;

    public SchFiles() {
    }

    public SchFiles(Integer id) {
        this.id = id;
    }

    public SchFiles(Integer id, Date dateLoad, int nUpd, int idUser) {
        this.id = id;
        this.dateLoad = dateLoad;
        this.nUpd = nUpd;
        this.idUser = idUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    public int getNUpd() {
        return nUpd;
    }

    public void setNUpd(int nUpd) {
        this.nUpd = nUpd;
    }

    public String getHFile() {
        return hFile;
    }

    public void setHFile(String hFile) {
        this.hFile = hFile;
    }

    public String getLFile() {
        return lFile;
    }

    public void setLFile(String lFile) {
        this.lFile = lFile;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public JSchetFromTF getIdSchetTF() {
        return idSchetTF;
    }

    public void setIdSchetTF(JSchetFromTF idSchetTF) {
        this.idSchetTF = idSchetTF;
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
        if (!(object instanceof SchFiles)) {
            return false;
        }
        SchFiles other = (SchFiles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SchFiles[ id=" + id + " ]";
    }
    
}
