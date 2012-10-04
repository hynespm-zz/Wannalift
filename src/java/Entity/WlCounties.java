/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Patrick Hynes
 */
@Entity
@Table(name = "WL_COUNTIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WlCounties.findAll", query = "SELECT w FROM WlCounties w"),
    @NamedQuery(name = "WlCounties.findByCId", query = "SELECT w FROM WlCounties w WHERE w.cId = :cId"),
    @NamedQuery(name = "WlCounties.findByName", query = "SELECT w FROM WlCounties w WHERE w.name = :name")})
public class WlCounties implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "C_ID")
    private Integer cId;
    @Size(max = 50)
    @Column(name = "NAME")
    private String name;

    public WlCounties() {
    }

    public WlCounties(Integer cId) {
        this.cId = cId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cId != null ? cId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WlCounties)) {
            return false;
        }
        WlCounties other = (WlCounties) object;
        if ((this.cId == null && other.cId != null) || (this.cId != null && !this.cId.equals(other.cId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enities.WlCounties[ cId=" + cId + " ]";
    }
    
}
