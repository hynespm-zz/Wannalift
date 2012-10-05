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
@Table(name = "WL_TC_COUNTRIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WlTcCountries.findAll", query = "SELECT w FROM WlTcCountries w"),
    @NamedQuery(name = "WlTcCountries.findByCountryId", query = "SELECT w FROM WlTcCountries w WHERE w.countryId = :countryId"),
    @NamedQuery(name = "WlTcCountries.findByCountry", query = "SELECT w FROM WlTcCountries w WHERE w.country = :country")})
public class WlTcCountries implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COUNTRY_ID")
    private Integer countryId;
    @Size(max = 255)
    @Column(name = "COUNTRY")
    private String country;

    public WlTcCountries() {
    }

    public WlTcCountries(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WlTcCountries)) {
            return false;
        }
        WlTcCountries other = (WlTcCountries) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.WlTcCountries[ countryId=" + countryId + " ]";
    }
    
}
