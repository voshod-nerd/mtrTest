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
@Table(name = "SK_SRZ_OUT", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SkSrzOut.findAll", query = "SELECT s FROM SkSrzOut s"),
    @NamedQuery(name = "SkSrzOut.findById", query = "SELECT s FROM SkSrzOut s WHERE s.id = :id"),
    @NamedQuery(name = "SkSrzOut.findByModeSluch", query = "SELECT s FROM SkSrzOut s WHERE s.modeSluch = :modeSluch"),
    @NamedQuery(name = "SkSrzOut.findByIdSluch", query = "SELECT s FROM SkSrzOut s WHERE s.idSluch = :idSluch"),
    @NamedQuery(name = "SkSrzOut.findBySpol", query = "SELECT s FROM SkSrzOut s WHERE s.spol = :spol"),
    @NamedQuery(name = "SkSrzOut.findByNpol", query = "SELECT s FROM SkSrzOut s WHERE s.npol = :npol"),
    @NamedQuery(name = "SkSrzOut.findByQogrn", query = "SELECT s FROM SkSrzOut s WHERE s.qogrn = :qogrn"),
    @NamedQuery(name = "SkSrzOut.findByRenp", query = "SELECT s FROM SkSrzOut s WHERE s.renp = :renp"),
    @NamedQuery(name = "SkSrzOut.findByRokato", query = "SELECT s FROM SkSrzOut s WHERE s.rokato = :rokato"),
    @NamedQuery(name = "SkSrzOut.findByRqogrn", query = "SELECT s FROM SkSrzOut s WHERE s.rqogrn = :rqogrn"),
    @NamedQuery(name = "SkSrzOut.findByRopdoc", query = "SELECT s FROM SkSrzOut s WHERE s.ropdoc = :ropdoc"),
    @NamedQuery(name = "SkSrzOut.findByRspol", query = "SELECT s FROM SkSrzOut s WHERE s.rspol = :rspol"),
    @NamedQuery(name = "SkSrzOut.findByRnpol", query = "SELECT s FROM SkSrzOut s WHERE s.rnpol = :rnpol"),
    @NamedQuery(name = "SkSrzOut.findByRdbeg", query = "SELECT s FROM SkSrzOut s WHERE s.rdbeg = :rdbeg"),
    @NamedQuery(name = "SkSrzOut.findByRdend", query = "SELECT s FROM SkSrzOut s WHERE s.rdend = :rdend"),
    @NamedQuery(name = "SkSrzOut.findByRepl", query = "SELECT s FROM SkSrzOut s WHERE s.repl = :repl"),
    @NamedQuery(name = "SkSrzOut.findByPrintErr", query = "SELECT s FROM SkSrzOut s WHERE s.printErr = :printErr")})
public class SkSrzOut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODE_SLUCH")
    private int modeSluch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SLUCH")
    private int idSluch;
    @Size(max = 10)
    @Column(name = "SPOL")
    private String spol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NPOL")
    private String npol;
    @Size(max = 13)
    @Column(name = "QOGRN")
    private String qogrn;
    @Size(max = 16)
    @Column(name = "RENP")
    private String renp;
    @Size(max = 5)
    @Column(name = "ROKATO")
    private String rokato;
    @Size(max = 13)
    @Column(name = "RQOGRN")
    private String rqogrn;
    @Size(max = 2)
    @Column(name = "ROPDOC")
    private String ropdoc;
    @Size(max = 10)
    @Column(name = "RSPOL")
    private String rspol;
    @Size(max = 20)
    @Column(name = "RNPOL")
    private String rnpol;
    @Column(name = "RDBEG")
    @Temporal(TemporalType.DATE)
    private Date rdbeg;
    @Column(name = "RDEND")
    @Temporal(TemporalType.DATE)
    private Date rdend;
    @Size(max = 500)
    @Column(name = "REPL")
    private String repl;
    @Column(name = "PrintErr")
    private Boolean printErr;

    public SkSrzOut() {
    }

    public SkSrzOut(Integer id) {
        this.id = id;
    }

    public SkSrzOut(Integer id, int modeSluch, int idSluch, String npol) {
        this.id = id;
        this.modeSluch = modeSluch;
        this.idSluch = idSluch;
        this.npol = npol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getModeSluch() {
        return modeSluch;
    }

    public void setModeSluch(int modeSluch) {
        this.modeSluch = modeSluch;
    }

    public int getIdSluch() {
        return idSluch;
    }

    public void setIdSluch(int idSluch) {
        this.idSluch = idSluch;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public String getNpol() {
        return npol;
    }

    public void setNpol(String npol) {
        this.npol = npol;
    }

    public String getQogrn() {
        return qogrn;
    }

    public void setQogrn(String qogrn) {
        this.qogrn = qogrn;
    }

    public String getRenp() {
        return renp;
    }

    public void setRenp(String renp) {
        this.renp = renp;
    }

    public String getRokato() {
        return rokato;
    }

    public void setRokato(String rokato) {
        this.rokato = rokato;
    }

    public String getRqogrn() {
        return rqogrn;
    }

    public void setRqogrn(String rqogrn) {
        this.rqogrn = rqogrn;
    }

    public String getRopdoc() {
        return ropdoc;
    }

    public void setRopdoc(String ropdoc) {
        this.ropdoc = ropdoc;
    }

    public String getRspol() {
        return rspol;
    }

    public void setRspol(String rspol) {
        this.rspol = rspol;
    }

    public String getRnpol() {
        return rnpol;
    }

    public void setRnpol(String rnpol) {
        this.rnpol = rnpol;
    }

    public Date getRdbeg() {
        return rdbeg;
    }

    public void setRdbeg(Date rdbeg) {
        this.rdbeg = rdbeg;
    }

    public Date getRdend() {
        return rdend;
    }

    public void setRdend(Date rdend) {
        this.rdend = rdend;
    }

    public String getRepl() {
        return repl;
    }

    public void setRepl(String repl) {
        this.repl = repl;
    }

    public Boolean getPrintErr() {
        return printErr;
    }

    public void setPrintErr(Boolean printErr) {
        this.printErr = printErr;
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
        if (!(object instanceof SkSrzOut)) {
            return false;
        }
        SkSrzOut other = (SkSrzOut) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SkSrzOut[ id=" + id + " ]";
    }
    
}
