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
@Table(name = "WL_TC_REGIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WlTcRegions.findAll", query = "SELECT w FROM WlTcRegions w"),
    @NamedQuery(name = "WlTcRegions.findByRegionId", query = "SELECT w FROM WlTcRegions w WHERE w.regionId = :regionId"),
    @NamedQuery(name = "WlTcRegions.findByCountryId", query = "SELECT w FROM WlTcRegions w WHERE w.countryId = :countryId"),
    @NamedQuery(name = "WlTcRegions.findByRegion", query = "SELECT w FROM WlTcRegions w WHERE w.region = :region"),
    @NamedQuery(name = "WlTcRegions.findByRank", query = "SELECT w FROM WlTcRegions w WHERE w.rank = :rank")})
public class WlTcRegions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "REGION_ID")
    private Integer regionId;
    @Column(name = "COUNTRY_ID")
    private Integer countryId;
    @Size(max = 255)
    @Column(name = "REGION")
    private String region;
    @Column(name = "RANK")
    private Integer rank;

    public WlTcRegions() {
    }

    public WlTcRegions(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionId != null ? regionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WlTcRegions)) {
            return false;
        }
        WlTcRegions other = (WlTcRegions) object;
        if ((this.regionId == null && other.regionId != null) || (this.regionId != null && !this.regionId.equals(other.regionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.WlTcRegions[ regionId=" + regionId + " ]";
    }
    
}
