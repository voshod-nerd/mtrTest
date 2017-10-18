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
@Table(name = "groups", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groups.findAll", query = "SELECT g FROM Groups g"),
    @NamedQuery(name = "Groups.findByIdGr", query = "SELECT g FROM Groups g WHERE g.idGr = :idGr"),
    @NamedQuery(name = "Groups.findByNameGr", query = "SELECT g FROM Groups g WHERE g.nameGr = :nameGr"),
    @NamedQuery(name = "Groups.findByP0", query = "SELECT g FROM Groups g WHERE g.p0 = :p0"),
    @NamedQuery(name = "Groups.findByP1", query = "SELECT g FROM Groups g WHERE g.p1 = :p1"),
    @NamedQuery(name = "Groups.findByP2", query = "SELECT g FROM Groups g WHERE g.p2 = :p2"),
    @NamedQuery(name = "Groups.findByP3", query = "SELECT g FROM Groups g WHERE g.p3 = :p3"),
    @NamedQuery(name = "Groups.findByP4", query = "SELECT g FROM Groups g WHERE g.p4 = :p4"),
    @NamedQuery(name = "Groups.findByP5", query = "SELECT g FROM Groups g WHERE g.p5 = :p5"),
    @NamedQuery(name = "Groups.findByP6", query = "SELECT g FROM Groups g WHERE g.p6 = :p6"),
    @NamedQuery(name = "Groups.findByP7", query = "SELECT g FROM Groups g WHERE g.p7 = :p7"),
    @NamedQuery(name = "Groups.findByP8", query = "SELECT g FROM Groups g WHERE g.p8 = :p8"),
    @NamedQuery(name = "Groups.findByP9", query = "SELECT g FROM Groups g WHERE g.p9 = :p9"),
    @NamedQuery(name = "Groups.findByP10", query = "SELECT g FROM Groups g WHERE g.p10 = :p10"),
    @NamedQuery(name = "Groups.findByP11", query = "SELECT g FROM Groups g WHERE g.p11 = :p11"),
    @NamedQuery(name = "Groups.findByP12", query = "SELECT g FROM Groups g WHERE g.p12 = :p12"),
    @NamedQuery(name = "Groups.findByP13", query = "SELECT g FROM Groups g WHERE g.p13 = :p13"),
    @NamedQuery(name = "Groups.findByP14", query = "SELECT g FROM Groups g WHERE g.p14 = :p14"),
    @NamedQuery(name = "Groups.findByP15", query = "SELECT g FROM Groups g WHERE g.p15 = :p15"),
    @NamedQuery(name = "Groups.findByP16", query = "SELECT g FROM Groups g WHERE g.p16 = :p16"),
    @NamedQuery(name = "Groups.findByP17", query = "SELECT g FROM Groups g WHERE g.p17 = :p17"),
    @NamedQuery(name = "Groups.findByP18", query = "SELECT g FROM Groups g WHERE g.p18 = :p18"),
    @NamedQuery(name = "Groups.findByP19", query = "SELECT g FROM Groups g WHERE g.p19 = :p19"),
    @NamedQuery(name = "Groups.findByP20", query = "SELECT g FROM Groups g WHERE g.p20 = :p20"),
    @NamedQuery(name = "Groups.findByP21", query = "SELECT g FROM Groups g WHERE g.p21 = :p21"),
    @NamedQuery(name = "Groups.findByP22", query = "SELECT g FROM Groups g WHERE g.p22 = :p22"),
    @NamedQuery(name = "Groups.findByP23", query = "SELECT g FROM Groups g WHERE g.p23 = :p23"),
    @NamedQuery(name = "Groups.findByP24", query = "SELECT g FROM Groups g WHERE g.p24 = :p24"),
    @NamedQuery(name = "Groups.findByP25", query = "SELECT g FROM Groups g WHERE g.p25 = :p25"),
    @NamedQuery(name = "Groups.findByP26", query = "SELECT g FROM Groups g WHERE g.p26 = :p26"),
    @NamedQuery(name = "Groups.findByP27", query = "SELECT g FROM Groups g WHERE g.p27 = :p27"),
    @NamedQuery(name = "Groups.findByP28", query = "SELECT g FROM Groups g WHERE g.p28 = :p28"),
    @NamedQuery(name = "Groups.findByP29", query = "SELECT g FROM Groups g WHERE g.p29 = :p29"),
    @NamedQuery(name = "Groups.findByP30", query = "SELECT g FROM Groups g WHERE g.p30 = :p30"),
    @NamedQuery(name = "Groups.findByP31", query = "SELECT g FROM Groups g WHERE g.p31 = :p31")})
public class Groups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_GR")
    private Integer idGr;
    @Size(max = 50)
    @Column(name = "NAME_GR")
    private String nameGr;
    @Column(name = "P0")
    private Boolean p0;
    @Column(name = "P1")
    private Boolean p1;
    @Column(name = "P2")
    private Boolean p2;
    @Column(name = "P3")
    private Boolean p3;
    @Column(name = "P4")
    private Boolean p4;
    @Column(name = "P5")
    private Boolean p5;
    @Column(name = "P6")
    private Boolean p6;
    @Column(name = "P7")
    private Boolean p7;
    @Column(name = "P8")
    private Boolean p8;
    @Column(name = "P9")
    private Boolean p9;
    @Column(name = "P10")
    private Boolean p10;
    @Column(name = "P11")
    private Boolean p11;
    @Column(name = "P12")
    private Boolean p12;
    @Column(name = "P13")
    private Boolean p13;
    @Column(name = "P14")
    private Boolean p14;
    @Column(name = "P15")
    private Boolean p15;
    @Column(name = "P16")
    private Boolean p16;
    @Column(name = "P17")
    private Boolean p17;
    @Column(name = "P18")
    private Boolean p18;
    @Column(name = "P19")
    private Boolean p19;
    @Column(name = "P20")
    private Boolean p20;
    @Column(name = "P21")
    private Boolean p21;
    @Column(name = "P22")
    private Boolean p22;
    @Column(name = "P23")
    private Boolean p23;
    @Column(name = "P24")
    private Boolean p24;
    @Column(name = "P25")
    private Boolean p25;
    @Column(name = "P26")
    private Boolean p26;
    @Column(name = "P27")
    private Boolean p27;
    @Column(name = "P28")
    private Boolean p28;
    @Column(name = "P29")
    private Boolean p29;
    @Column(name = "P30")
    private Boolean p30;
    @Column(name = "P31")
    private Boolean p31;

    public Groups() {
    }

    public Groups(Integer idGr) {
        this.idGr = idGr;
    }

    public Integer getIdGr() {
        return idGr;
    }

    public void setIdGr(Integer idGr) {
        this.idGr = idGr;
    }

    public String getNameGr() {
        return nameGr;
    }

    public void setNameGr(String nameGr) {
        this.nameGr = nameGr;
    }

    public Boolean getP0() {
        return p0;
    }

    public void setP0(Boolean p0) {
        this.p0 = p0;
    }

    public Boolean getP1() {
        return p1;
    }

    public void setP1(Boolean p1) {
        this.p1 = p1;
    }

    public Boolean getP2() {
        return p2;
    }

    public void setP2(Boolean p2) {
        this.p2 = p2;
    }

    public Boolean getP3() {
        return p3;
    }

    public void setP3(Boolean p3) {
        this.p3 = p3;
    }

    public Boolean getP4() {
        return p4;
    }

    public void setP4(Boolean p4) {
        this.p4 = p4;
    }

    public Boolean getP5() {
        return p5;
    }

    public void setP5(Boolean p5) {
        this.p5 = p5;
    }

    public Boolean getP6() {
        return p6;
    }

    public void setP6(Boolean p6) {
        this.p6 = p6;
    }

    public Boolean getP7() {
        return p7;
    }

    public void setP7(Boolean p7) {
        this.p7 = p7;
    }

    public Boolean getP8() {
        return p8;
    }

    public void setP8(Boolean p8) {
        this.p8 = p8;
    }

    public Boolean getP9() {
        return p9;
    }

    public void setP9(Boolean p9) {
        this.p9 = p9;
    }

    public Boolean getP10() {
        return p10;
    }

    public void setP10(Boolean p10) {
        this.p10 = p10;
    }

    public Boolean getP11() {
        return p11;
    }

    public void setP11(Boolean p11) {
        this.p11 = p11;
    }

    public Boolean getP12() {
        return p12;
    }

    public void setP12(Boolean p12) {
        this.p12 = p12;
    }

    public Boolean getP13() {
        return p13;
    }

    public void setP13(Boolean p13) {
        this.p13 = p13;
    }

    public Boolean getP14() {
        return p14;
    }

    public void setP14(Boolean p14) {
        this.p14 = p14;
    }

    public Boolean getP15() {
        return p15;
    }

    public void setP15(Boolean p15) {
        this.p15 = p15;
    }

    public Boolean getP16() {
        return p16;
    }

    public void setP16(Boolean p16) {
        this.p16 = p16;
    }

    public Boolean getP17() {
        return p17;
    }

    public void setP17(Boolean p17) {
        this.p17 = p17;
    }

    public Boolean getP18() {
        return p18;
    }

    public void setP18(Boolean p18) {
        this.p18 = p18;
    }

    public Boolean getP19() {
        return p19;
    }

    public void setP19(Boolean p19) {
        this.p19 = p19;
    }

    public Boolean getP20() {
        return p20;
    }

    public void setP20(Boolean p20) {
        this.p20 = p20;
    }

    public Boolean getP21() {
        return p21;
    }

    public void setP21(Boolean p21) {
        this.p21 = p21;
    }

    public Boolean getP22() {
        return p22;
    }

    public void setP22(Boolean p22) {
        this.p22 = p22;
    }

    public Boolean getP23() {
        return p23;
    }

    public void setP23(Boolean p23) {
        this.p23 = p23;
    }

    public Boolean getP24() {
        return p24;
    }

    public void setP24(Boolean p24) {
        this.p24 = p24;
    }

    public Boolean getP25() {
        return p25;
    }

    public void setP25(Boolean p25) {
        this.p25 = p25;
    }

    public Boolean getP26() {
        return p26;
    }

    public void setP26(Boolean p26) {
        this.p26 = p26;
    }

    public Boolean getP27() {
        return p27;
    }

    public void setP27(Boolean p27) {
        this.p27 = p27;
    }

    public Boolean getP28() {
        return p28;
    }

    public void setP28(Boolean p28) {
        this.p28 = p28;
    }

    public Boolean getP29() {
        return p29;
    }

    public void setP29(Boolean p29) {
        this.p29 = p29;
    }

    public Boolean getP30() {
        return p30;
    }

    public void setP30(Boolean p30) {
        this.p30 = p30;
    }

    public Boolean getP31() {
        return p31;
    }

    public void setP31(Boolean p31) {
        this.p31 = p31;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGr != null ? idGr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groups)) {
            return false;
        }
        Groups other = (Groups) object;
        if ((this.idGr == null && other.idGr != null) || (this.idGr != null && !this.idGr.equals(other.idGr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.Groups[ idGr=" + idGr + " ]";
    }
    
}
