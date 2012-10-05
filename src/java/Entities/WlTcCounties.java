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
@Table(name = "WL_TC_COUNTIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WlTcCounties.findAll", query = "SELECT w FROM WlTcCounties w"),
    @NamedQuery(name = "WlTcCounties.findByCountiesId", query = "SELECT w FROM WlTcCounties w WHERE w.countiesId = :countiesId"),
    @NamedQuery(name = "WlTcCounties.findByCountryId", query = "SELECT w FROM WlTcCounties w WHERE w.countryId = :countryId"),
    @NamedQuery(name = "WlTcCounties.findByRegion", query = "SELECT w FROM WlTcCounties w WHERE w.region = :region"),
    @NamedQuery(name = "WlTcCounties.findByCounty", query = "SELECT w FROM WlTcCounties w WHERE w.county = :county")})
public class WlTcCounties implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COUNTIES_ID")
    private Integer countiesId;
    @Column(name = "COUNTRY_ID")
    private Integer countryId;
    @Column(name = "REGION")
    private Integer region;
    @Size(max = 255)
    @Column(name = "COUNTY")
    private String county;

    public WlTcCounties() {
    }

    public WlTcCounties(Integer countiesId) {
        this.countiesId = countiesId;
    }

    public Integer getCountiesId() {
        return countiesId;
    }

    public void setCountiesId(Integer countiesId) {
        this.countiesId = countiesId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countiesId != null ? countiesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WlTcCounties)) {
            return false;
        }
        WlTcCounties other = (WlTcCounties) object;
        if ((this.countiesId == null && other.countiesId != null) || (this.countiesId != null && !this.countiesId.equals(other.countiesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.WlTcCounties[ countiesId=" + countiesId + " ]";
    }
    
}
