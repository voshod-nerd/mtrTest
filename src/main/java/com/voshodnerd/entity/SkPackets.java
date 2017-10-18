/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "sk_Packets", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SkPackets.findAll", query = "SELECT s FROM SkPackets s"),
    @NamedQuery(name = "SkPackets.findByTfKod", query = "SELECT s FROM SkPackets s WHERE s.skPacketsPK.tfKod = :tfKod"),
    @NamedQuery(name = "SkPackets.findByPYear", query = "SELECT s FROM SkPackets s WHERE s.skPacketsPK.pYear = :pYear"),
    @NamedQuery(name = "SkPackets.findByPMonth", query = "SELECT s FROM SkPackets s WHERE s.skPacketsPK.pMonth = :pMonth"),
    @NamedQuery(name = "SkPackets.findByPacket", query = "SELECT s FROM SkPackets s WHERE s.packet = :packet")})
public class SkPackets implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SkPacketsPK skPacketsPK;
    @Column(name = "packet")
    private Integer packet;

    public SkPackets() {
    }

    public SkPackets(SkPacketsPK skPacketsPK) {
        this.skPacketsPK = skPacketsPK;
    }

    public SkPackets(String tfKod, int pYear, int pMonth) {
        this.skPacketsPK = new SkPacketsPK(tfKod, pYear, pMonth);
    }

    public SkPacketsPK getSkPacketsPK() {
        return skPacketsPK;
    }

    public void setSkPacketsPK(SkPacketsPK skPacketsPK) {
        this.skPacketsPK = skPacketsPK;
    }

    public Integer getPacket() {
        return packet;
    }

    public void setPacket(Integer packet) {
        this.packet = packet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skPacketsPK != null ? skPacketsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkPackets)) {
            return false;
        }
        SkPackets other = (SkPackets) object;
        if ((this.skPacketsPK == null && other.skPacketsPK != null) || (this.skPacketsPK != null && !this.skPacketsPK.equals(other.skPacketsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SkPackets[ skPacketsPK=" + skPacketsPK + " ]";
    }
    
}
