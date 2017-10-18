/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "J_Schet_Lpu", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JSchetLpu.findAll", query = "SELECT j FROM JSchetLpu j"),
    @NamedQuery(name = "JSchetLpu.findById", query = "SELECT j FROM JSchetLpu j WHERE j.id = :id"),
    @NamedQuery(name = "JSchetLpu.findByDateLoad", query = "SELECT j FROM JSchetLpu j WHERE j.dateLoad = :dateLoad"),
    @NamedQuery(name = "JSchetLpu.findByVersion", query = "SELECT j FROM JSchetLpu j WHERE j.version = :version"),
    @NamedQuery(name = "JSchetLpu.findByData", query = "SELECT j FROM JSchetLpu j WHERE j.data = :data"),
    @NamedQuery(name = "JSchetLpu.findByHFileName", query = "SELECT j FROM JSchetLpu j WHERE j.hFileName = :hFileName"),
    @NamedQuery(name = "JSchetLpu.findByLFileName", query = "SELECT j FROM JSchetLpu j WHERE j.lFileName = :lFileName"),
    @NamedQuery(name = "JSchetLpu.findByCode", query = "SELECT j FROM JSchetLpu j WHERE j.code = :code"),
    @NamedQuery(name = "JSchetLpu.findByCodeMo", query = "SELECT j FROM JSchetLpu j WHERE j.codeMo = :codeMo"),
    @NamedQuery(name = "JSchetLpu.findByPYear", query = "SELECT j FROM JSchetLpu j WHERE j.pYear = :pYear"),
    @NamedQuery(name = "JSchetLpu.findByPMonth", query = "SELECT j FROM JSchetLpu j WHERE j.pMonth = :pMonth"),
    @NamedQuery(name = "JSchetLpu.findByNSchet", query = "SELECT j FROM JSchetLpu j WHERE j.nSchet = :nSchet"),
    @NamedQuery(name = "JSchetLpu.findByDschet", query = "SELECT j FROM JSchetLpu j WHERE j.dschet = :dschet"),
    @NamedQuery(name = "JSchetLpu.findByTypeSchet", query = "SELECT j FROM JSchetLpu j WHERE j.typeSchet = :typeSchet"),
    @NamedQuery(name = "JSchetLpu.findByPlat", query = "SELECT j FROM JSchetLpu j WHERE j.plat = :plat"),
    @NamedQuery(name = "JSchetLpu.findByPcount", query = "SELECT j FROM JSchetLpu j WHERE j.pcount = :pcount"),
    @NamedQuery(name = "JSchetLpu.findByScount", query = "SELECT j FROM JSchetLpu j WHERE j.scount = :scount"),
    @NamedQuery(name = "JSchetLpu.findBySummaV", query = "SELECT j FROM JSchetLpu j WHERE j.summaV = :summaV"),
    @NamedQuery(name = "JSchetLpu.findByComents", query = "SELECT j FROM JSchetLpu j WHERE j.coments = :coments"),
    @NamedQuery(name = "JSchetLpu.findBySummaP", query = "SELECT j FROM JSchetLpu j WHERE j.summaP = :summaP"),
    @NamedQuery(name = "JSchetLpu.findByErrCount", query = "SELECT j FROM JSchetLpu j WHERE j.errCount = :errCount"),
    @NamedQuery(name = "JSchetLpu.findBySankMEK", query = "SELECT j FROM JSchetLpu j WHERE j.sankMEK = :sankMEK"),
    @NamedQuery(name = "JSchetLpu.findBySankMEE", query = "SELECT j FROM JSchetLpu j WHERE j.sankMEE = :sankMEE"),
    @NamedQuery(name = "JSchetLpu.findBySankEKMP", query = "SELECT j FROM JSchetLpu j WHERE j.sankEKMP = :sankEKMP"),
    @NamedQuery(name = "JSchetLpu.findByDisp", query = "SELECT j FROM JSchetLpu j WHERE j.disp = :disp"),
    @NamedQuery(name = "JSchetLpu.findByChecked", query = "SELECT j FROM JSchetLpu j WHERE j.checked = :checked"),
    @NamedQuery(name = "JSchetLpu.findByWorked", query = "SELECT j FROM JSchetLpu j WHERE j.worked = :worked"),
    @NamedQuery(name = "JSchetLpu.findByDOplat", query = "SELECT j FROM JSchetLpu j WHERE j.dOplat = :dOplat"),
    @NamedQuery(name = "JSchetLpu.findByIdUser", query = "SELECT j FROM JSchetLpu j WHERE j.idUser = :idUser")})
public class JSchetLpu implements Serializable {

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
    @Size(min = 1, max = 5)
    @Column(name = "Version")
    private String version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Size(max = 30)
    @Column(name = "H_FileName")
    private String hFileName;
    @Size(max = 30)
    @Column(name = "L_FileName")
    private String lFileName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Code")
    private int code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "Code_Mo")
    private String codeMo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PYear")
    private short pYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PMonth")
    private short pMonth;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NSchet")
    private String nSchet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dschet")
    @Temporal(TemporalType.DATE)
    private Date dschet;
    @Size(max = 4)
    @Column(name = "TypeSchet")
    private String typeSchet;
    @Size(max = 5)
    @Column(name = "Plat")
    private String plat;
    @Column(name = "Pcount")
    private Integer pcount;
    @Column(name = "Scount")
    private Integer scount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SummaV")
    private BigDecimal summaV;
    @Size(max = 250)
    @Column(name = "Coments")
    private String coments;
    @Column(name = "SummaP")
    private BigDecimal summaP;
    @Column(name = "ErrCount")
    private Integer errCount;
    @Column(name = "Sank_MEK")
    private BigDecimal sankMEK;
    @Column(name = "Sank_MEE")
    private BigDecimal sankMEE;
    @Column(name = "Sank_EKMP")
    private BigDecimal sankEKMP;
    @Size(max = 3)
    @Column(name = "DISP")
    private String disp;
    @Column(name = "Checked")
    private Boolean checked;
    @Column(name = "Worked")
    private Boolean worked;
    @Column(name = "d_Oplat")
    @Temporal(TemporalType.DATE)
    private Date dOplat;
    @Column(name = "Id_User")
    private Integer idUser;
    @OneToMany(mappedBy = "idSchetLpu")
    private Collection<SchFiles> schFilesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSchetLpu")
    private Collection<SKReports> sKReportsCollection;

    public JSchetLpu() {
    }

    public JSchetLpu(Integer id) {
        this.id = id;
    }

    public JSchetLpu(Integer id, Date dateLoad, String version, Date data, int code, String codeMo, short pYear, short pMonth, String nSchet, Date dschet, BigDecimal summaV) {
        this.id = id;
        this.dateLoad = dateLoad;
        this.version = version;
        this.data = data;
        this.code = code;
        this.codeMo = codeMo;
        this.pYear = pYear;
        this.pMonth = pMonth;
        this.nSchet = nSchet;
        this.dschet = dschet;
        this.summaV = summaV;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHFileName() {
        return hFileName;
    }

    public void setHFileName(String hFileName) {
        this.hFileName = hFileName;
    }

    public String getLFileName() {
        return lFileName;
    }

    public void setLFileName(String lFileName) {
        this.lFileName = lFileName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCodeMo() {
        return codeMo;
    }

    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

    public short getPYear() {
        return pYear;
    }

    public void setPYear(short pYear) {
        this.pYear = pYear;
    }

    public short getPMonth() {
        return pMonth;
    }

    public void setPMonth(short pMonth) {
        this.pMonth = pMonth;
    }

    public String getNSchet() {
        return nSchet;
    }

    public void setNSchet(String nSchet) {
        this.nSchet = nSchet;
    }

    public Date getDschet() {
        return dschet;
    }

    public void setDschet(Date dschet) {
        this.dschet = dschet;
    }

    public String getTypeSchet() {
        return typeSchet;
    }

    public void setTypeSchet(String typeSchet) {
        this.typeSchet = typeSchet;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }

    public Integer getScount() {
        return scount;
    }

    public void setScount(Integer scount) {
        this.scount = scount;
    }

    public BigDecimal getSummaV() {
        return summaV;
    }

    public void setSummaV(BigDecimal summaV) {
        this.summaV = summaV;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public BigDecimal getSummaP() {
        return summaP;
    }

    public void setSummaP(BigDecimal summaP) {
        this.summaP = summaP;
    }

    public Integer getErrCount() {
        return errCount;
    }

    public void setErrCount(Integer errCount) {
        this.errCount = errCount;
    }

    public BigDecimal getSankMEK() {
        return sankMEK;
    }

    public void setSankMEK(BigDecimal sankMEK) {
        this.sankMEK = sankMEK;
    }

    public BigDecimal getSankMEE() {
        return sankMEE;
    }

    public void setSankMEE(BigDecimal sankMEE) {
        this.sankMEE = sankMEE;
    }

    public BigDecimal getSankEKMP() {
        return sankEKMP;
    }

    public void setSankEKMP(BigDecimal sankEKMP) {
        this.sankEKMP = sankEKMP;
    }

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean getWorked() {
        return worked;
    }

    public void setWorked(Boolean worked) {
        this.worked = worked;
    }

    public Date getDOplat() {
        return dOplat;
    }

    public void setDOplat(Date dOplat) {
        this.dOplat = dOplat;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Collection<SchFiles> getSchFilesCollection() {
        return schFilesCollection;
    }

    public void setSchFilesCollection(Collection<SchFiles> schFilesCollection) {
        this.schFilesCollection = schFilesCollection;
    }

    @XmlTransient
    public Collection<SKReports> getSKReportsCollection() {
        return sKReportsCollection;
    }

    public void setSKReportsCollection(Collection<SKReports> sKReportsCollection) {
        this.sKReportsCollection = sKReportsCollection;
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
        if (!(object instanceof JSchetLpu)) {
            return false;
        }
        JSchetLpu other = (JSchetLpu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.JSchetLpu[ id=" + id + " ]";
    }
    
}
