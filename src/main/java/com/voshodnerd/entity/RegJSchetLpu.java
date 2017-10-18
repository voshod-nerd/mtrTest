/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "Reg_J_Schet_Lpu", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegJSchetLpu.findAll", query = "SELECT r FROM RegJSchetLpu r"),
    @NamedQuery(name = "RegJSchetLpu.findById", query = "SELECT r FROM RegJSchetLpu r WHERE r.id = :id"),
    @NamedQuery(name = "RegJSchetLpu.findByDateload", query = "SELECT r FROM RegJSchetLpu r WHERE r.dateload = :dateload"),
    @NamedQuery(name = "RegJSchetLpu.findByCodeMo", query = "SELECT r FROM RegJSchetLpu r WHERE r.codeMo = :codeMo"),
    @NamedQuery(name = "RegJSchetLpu.findByNschet", query = "SELECT r FROM RegJSchetLpu r WHERE r.nschet = :nschet"),
    @NamedQuery(name = "RegJSchetLpu.findByDschet", query = "SELECT r FROM RegJSchetLpu r WHERE r.dschet = :dschet"),
    @NamedQuery(name = "RegJSchetLpu.findByPyear", query = "SELECT r FROM RegJSchetLpu r WHERE r.pyear = :pyear"),
    @NamedQuery(name = "RegJSchetLpu.findByPmonth", query = "SELECT r FROM RegJSchetLpu r WHERE r.pmonth = :pmonth"),
    @NamedQuery(name = "RegJSchetLpu.findByPlat", query = "SELECT r FROM RegJSchetLpu r WHERE r.plat = :plat"),
    @NamedQuery(name = "RegJSchetLpu.findBySummav", query = "SELECT r FROM RegJSchetLpu r WHERE r.summav = :summav"),
    @NamedQuery(name = "RegJSchetLpu.findByComents", query = "SELECT r FROM RegJSchetLpu r WHERE r.coments = :coments"),
    @NamedQuery(name = "RegJSchetLpu.findBySummap", query = "SELECT r FROM RegJSchetLpu r WHERE r.summap = :summap"),
    @NamedQuery(name = "RegJSchetLpu.findBySankMek", query = "SELECT r FROM RegJSchetLpu r WHERE r.sankMek = :sankMek"),
    @NamedQuery(name = "RegJSchetLpu.findBySankMee", query = "SELECT r FROM RegJSchetLpu r WHERE r.sankMee = :sankMee"),
    @NamedQuery(name = "RegJSchetLpu.findBySankEkmp", query = "SELECT r FROM RegJSchetLpu r WHERE r.sankEkmp = :sankEkmp"),
    @NamedQuery(name = "RegJSchetLpu.findBySank", query = "SELECT r FROM RegJSchetLpu r WHERE r.sank = :sank"),
    @NamedQuery(name = "RegJSchetLpu.findByCountSl", query = "SELECT r FROM RegJSchetLpu r WHERE r.countSl = :countSl"),
    @NamedQuery(name = "RegJSchetLpu.findByCountBed", query = "SELECT r FROM RegJSchetLpu r WHERE r.countBed = :countBed"),
    @NamedQuery(name = "RegJSchetLpu.findByChecked", query = "SELECT r FROM RegJSchetLpu r WHERE r.checked = :checked"),
    @NamedQuery(name = "RegJSchetLpu.findByWorked", query = "SELECT r FROM RegJSchetLpu r WHERE r.worked = :worked"),
    @NamedQuery(name = "RegJSchetLpu.findByCUsl", query = "SELECT r FROM RegJSchetLpu r WHERE r.cUsl = :cUsl"),
    @NamedQuery(name = "RegJSchetLpu.findBySumUsl", query = "SELECT r FROM RegJSchetLpu r WHERE r.sumUsl = :sumUsl"),
    @NamedQuery(name = "RegJSchetLpu.findByNamMok", query = "SELECT r FROM RegJSchetLpu r WHERE r.namMok = :namMok"),
    @NamedQuery(name = "RegJSchetLpu.findByDOplat", query = "SELECT r FROM RegJSchetLpu r WHERE r.dOplat = :dOplat")})
public class RegJSchetLpu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 61)
    @Column(name = "dateload")
    private String dateload;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODE_MO")
    private String codeMo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NSCHET")
    private String nschet;
    @Size(max = 10)
    @Column(name = "DSCHET")
    private String dschet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PYEAR")
    private short pyear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PMONTH")
    private short pmonth;
    @Size(max = 5)
    @Column(name = "PLAT")
    private String plat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMMAV")
    private BigDecimal summav;
    @Size(max = 250)
    @Column(name = "COMENTS")
    private String coments;
    @Column(name = "SUMMAP")
    private BigDecimal summap;
    @Column(name = "sank_mek")
    private BigDecimal sankMek;
    @Column(name = "sank_mee")
    private BigDecimal sankMee;
    @Column(name = "sank_ekmp")
    private BigDecimal sankEkmp;
    @Column(name = "sank")
    private BigDecimal sank;
    @Column(name = "COUNT_SL")
    private Integer countSl;
    @Column(name = "COUNT_BED")
    private Integer countBed;
    @Column(name = "Checked")
    private Boolean checked;
    @Column(name = "Worked")
    private Boolean worked;
    @Column(name = "c_usl")
    private Integer cUsl;
    @Column(name = "sum_usl")
    private BigDecimal sumUsl;
    @Size(max = 250)
    @Column(name = "NAM_MOK")
    private String namMok;
    @Size(max = 10)
    @Column(name = "D_Oplat")
    private String dOplat;
    @OneToMany(mappedBy = "idSchetLpu")
    private Collection<SkSluch> skSluchCollection;

    public RegJSchetLpu() {
    }

    public RegJSchetLpu(Integer id) {
        this.id = id;
    }

    public RegJSchetLpu(Integer id, String codeMo, String nschet, short pyear, short pmonth) {
        this.id = id;
        this.codeMo = codeMo;
        this.nschet = nschet;
        this.pyear = pyear;
        this.pmonth = pmonth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateload() {
        return dateload;
    }

    public void setDateload(String dateload) {
        this.dateload = dateload;
    }

    public String getCodeMo() {
        return codeMo;
    }

    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

    public String getNschet() {
        return nschet;
    }

    public void setNschet(String nschet) {
        this.nschet = nschet;
    }

    public String getDschet() {
        return dschet;
    }

    public void setDschet(String dschet) {
        this.dschet = dschet;
    }

    public short getPyear() {
        return pyear;
    }

    public void setPyear(short pyear) {
        this.pyear = pyear;
    }

    public short getPmonth() {
        return pmonth;
    }

    public void setPmonth(short pmonth) {
        this.pmonth = pmonth;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public BigDecimal getSummav() {
        return summav;
    }

    public void setSummav(BigDecimal summav) {
        this.summav = summav;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public BigDecimal getSummap() {
        return summap;
    }

    public void setSummap(BigDecimal summap) {
        this.summap = summap;
    }

    public BigDecimal getSankMek() {
        return sankMek;
    }

    public void setSankMek(BigDecimal sankMek) {
        this.sankMek = sankMek;
    }

    public BigDecimal getSankMee() {
        return sankMee;
    }

    public void setSankMee(BigDecimal sankMee) {
        this.sankMee = sankMee;
    }

    public BigDecimal getSankEkmp() {
        return sankEkmp;
    }

    public void setSankEkmp(BigDecimal sankEkmp) {
        this.sankEkmp = sankEkmp;
    }

    public BigDecimal getSank() {
        return sank;
    }

    public void setSank(BigDecimal sank) {
        this.sank = sank;
    }

    public Integer getCountSl() {
        return countSl;
    }

    public void setCountSl(Integer countSl) {
        this.countSl = countSl;
    }

    public Integer getCountBed() {
        return countBed;
    }

    public void setCountBed(Integer countBed) {
        this.countBed = countBed;
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

    public Integer getCUsl() {
        return cUsl;
    }

    public void setCUsl(Integer cUsl) {
        this.cUsl = cUsl;
    }

    public BigDecimal getSumUsl() {
        return sumUsl;
    }

    public void setSumUsl(BigDecimal sumUsl) {
        this.sumUsl = sumUsl;
    }

    public String getNamMok() {
        return namMok;
    }

    public void setNamMok(String namMok) {
        this.namMok = namMok;
    }

    public String getDOplat() {
        return dOplat;
    }

    public void setDOplat(String dOplat) {
        this.dOplat = dOplat;
    }

    @XmlTransient
    public Collection<SkSluch> getSkSluchCollection() {
        return skSluchCollection;
    }

    public void setSkSluchCollection(Collection<SkSluch> skSluchCollection) {
        this.skSluchCollection = skSluchCollection;
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
        if (!(object instanceof RegJSchetLpu)) {
            return false;
        }
        RegJSchetLpu other = (RegJSchetLpu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.RegJSchetLpu[ id=" + id + " ]";
    }
    
}
