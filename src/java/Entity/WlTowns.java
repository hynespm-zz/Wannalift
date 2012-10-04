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
@Table(name = "WL_TOWNS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WlTowns.findAll", query = "SELECT w FROM WlTowns w"),
    @NamedQuery(name = "WlTowns.findByTId", query = "SELECT w FROM WlTowns w WHERE w.tId = :tId"),
    @NamedQuery(name = "WlTowns.findByCId", query = "SELECT w FROM WlTowns w WHERE w.cId = :cId"),
    @NamedQuery(name = "WlTowns.findByName", query = "SELECT w FROM WlTowns w WHERE w.name = :name")})
public class WlTowns implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "T_ID")
    private Integer tId;
    @Column(name = "C_ID")
    private Integer cId;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;

    public WlTowns() {
    }

    public WlTowns(Integer tId) {
        this.tId = tId;
    }

    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
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
        hash += (tId != null ? tId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WlTowns)) {
            return false;
        }
        WlTowns other = (WlTowns) object;
        if ((this.tId == null && other.tId != null) || (this.tId != null && !this.tId.equals(other.tId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enities.WlTowns[ tId=" + tId + " ]";
    }
    
}
