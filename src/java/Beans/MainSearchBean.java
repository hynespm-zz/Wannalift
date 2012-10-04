/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entity.*;
import Faccades.WlCountiesFacade;
import Faccades.WlTownsFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Patrick Hynes
 */
@ManagedBean
@RequestScoped
public class MainSearchBean {
    
    
    @EJB
    private WlCountiesFacade countyFaccade;
    @EJB
    private WlTownsFacade townFaccade;
    /**
     * Fields for retrieving the list of towns and counties
     */
    private List<WlTowns> towns;
    private List<WlCounties> counties;
    
    
    /**
     * Creates a new instance of MainSearchBean
     */
    public MainSearchBean() {
        
        }
    
    
  

    /**
     * @return the countyFaccade
     */
    public WlCountiesFacade getCountyFaccade() {
        
        if (this.countyFaccade == null) {
            try {
                setCountyFaccade((WlCountiesFacade) new InitialContext().lookup("java:module/WlCountiesFacade"));
            } catch (NamingException ex) {
                Logger.getLogger(MainSearchBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return countyFaccade;
        
      
    }

    /**
     * 
     * @param countyFaccade the countyFaccade to set
     */
    public void setCountyFaccade(WlCountiesFacade countyFaccade) {
        this.countyFaccade = countyFaccade;
    }

    /**
     * @return the townFaccade
     */
    public WlTownsFacade getTownFaccade() {
        
         if (this.townFaccade == null) {
            try {
                setTownFaccade((WlTownsFacade) new InitialContext().lookup("java:module/WlTownsFacade"));
            } catch (NamingException ex) {
                Logger.getLogger(MainSearchBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        return townFaccade;
    }

    /**
     * @param townFaccade the townFaccade to set
     */
    public void setTownFaccade(WlTownsFacade townFaccade) {
        this.townFaccade = townFaccade;
    }

    /**
     * @return the towns
     */
    public List<WlTowns> getTowns() {
        if(towns == null){
            setTowns(this.getTownFaccade().findAll());
        }
        return towns;
    }

    /**
     * @param towns the towns to set
     */
    public void setTowns(List<WlTowns> towns) {
        this.towns = towns;
    }

    /**
     * @return the counties
     */
    public List<WlCounties> getCounties() {
        if(counties == null){
            this.setCounties(this.getCountyFaccade().findAll());
        }
        return counties;
    }

    /**
     * @param counties the counties to set
     */
    public void setCounties(List<WlCounties> counties) {
        this.counties = counties;
    }
}
