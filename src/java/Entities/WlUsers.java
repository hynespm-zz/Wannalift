/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
 * @author Patrick
 */
@Entity
@Table(name = "WL_USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WlUsers.findAll", query = "SELECT w FROM WlUsers w"),
    @NamedQuery(name = "WlUsers.findByUid", query = "SELECT w FROM WlUsers w WHERE w.uid = :uid"),
    @NamedQuery(name = "WlUsers.findByWlUsername", query = "SELECT w FROM WlUsers w WHERE w.wlUsername = :wlUsername"),
    @NamedQuery(name = "WlUsers.findByFirstName", query = "SELECT w FROM WlUsers w WHERE w.firstName = :firstName"),
    @NamedQuery(name = "WlUsers.findByLastName", query = "SELECT w FROM WlUsers w WHERE w.lastName = :lastName"),
    @NamedQuery(name = "WlUsers.findByEmail", query = "SELECT w FROM WlUsers w WHERE w.email = :email"),
    @NamedQuery(name = "WlUsers.findByTelephone", query = "SELECT w FROM WlUsers w WHERE w.telephone = :telephone")})
public class WlUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "UID")
    private Integer uid;
    @Size(max = 255)
    @Column(name = "WL_USERNAME")
    private String wlUsername;
    @Size(max = 255)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 255)
    @Column(name = "LAST_NAME")
    private String lastName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEPHONE")
    private Integer telephone;

    public WlUsers() {
    }

    public WlUsers(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getWlUsername() {
        return wlUsername;
    }

    public void setWlUsername(String wlUsername) {
        this.wlUsername = wlUsername;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WlUsers)) {
            return false;
        }
        WlUsers other = (WlUsers) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.WlUsers[ uid=" + uid + " ]";
    }
    
}
