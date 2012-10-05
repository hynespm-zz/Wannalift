/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Patrick
 */
@Entity
@Table(name = "WL_TC_TOWNS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WlTcTowns.findAll", query = "SELECT w FROM WlTcTowns w"),
    @NamedQuery(name = "WlTcTowns.findByTownId", query = "SELECT w FROM WlTcTowns w WHERE w.townId = :townId"),
    @NamedQuery(name = "WlTcTowns.findByCountyId", query = "SELECT w FROM WlTcTowns w WHERE w.countyId = :countyId"),
    @NamedQuery(name = "WlTcTowns.findByTown", query = "SELECT w FROM WlTcTowns w WHERE w.town = :town"),
    @NamedQuery(name = "WlTcTowns.findByBs", query = "SELECT w FROM WlTcTowns w WHERE w.bs = :bs")})
public class WlTcTowns implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TOWN_ID")
    private Integer townId;
    @Column(name = "COUNTY_ID")
    private Integer countyId;
    @Size(max = 255)
    @Column(name = "TOWN")
    private String town;
    @Size(max = 255)
    @Column(name = "BS")
    private String bs;

    public WlTcTowns() {
    }

    public WlTcTowns(Integer townId) {
        this.townId = townId;
    }

    public Integer getTownId() {
        return townId;
    }

    public void setTownId(Integer townId) {
        this.townId = townId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (townId != null ? townId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WlTcTowns)) {
            return false;
        }
        WlTcTowns other = (WlTcTowns) object;
        if ((this.townId == null && other.townId != null) || (this.townId != null && !this.townId.equals(other.townId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.WlTcTowns[ townId=" + townId + " ]";
    }
    
}
