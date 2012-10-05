/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Faccade.*;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Patrick
 * Description: Bean to managed searchs and results from the main page
 */
@ManagedBean
@RequestScoped
public class MainSearchBean {

    
    
    
     @EJB
     private WlTcCountiesFacade countiesFaccade;
     private WlTcRegionsFacade regionFaccade;
     private WlTcCountriesFacade countriesFaccade;
     private WlTcTownsFacade townFaccade;
     
     
     
    /**
     * Creates a new instance of MainSearchBean
     */
    public MainSearchBean() {
    }

    /**
     * @return the countiesFaccade
     */
    public WlTcCountiesFacade getCountiesFaccade() {
        return countiesFaccade;
    }

    /**
     * @param countiesFaccade the countiesFaccade to set
     */
    public void setCountiesFaccade(WlTcCountiesFacade countiesFaccade) {
        this.countiesFaccade = countiesFaccade;
    }

    /**
     * @return the regionFaccade
     */
    public WlTcRegionsFacade getRegionFaccade() {
        return regionFaccade;
    }

    /**
     * @param regionFaccade the regionFaccade to set
     */
    public void setRegionFaccade(WlTcRegionsFacade regionFaccade) {
        this.regionFaccade = regionFaccade;
    }

    /**
     * @return the countriesFaccade
     */
    public WlTcCountriesFacade getCountriesFaccade() {
        return countriesFaccade;
    }

    /**
     * @param countriesFaccade the countriesFaccade to set
     */
    public void setCountriesFaccade(WlTcCountriesFacade countriesFaccade) {
        this.countriesFaccade = countriesFaccade;
    }

    /**
     * @return the townFaccade
     */
    public WlTcTownsFacade getTownFaccade() {
        return townFaccade;
    }

    /**
     * @param townFaccade the townFaccade to set
     */
    public void setTownFaccade(WlTcTownsFacade townFaccade) {
        this.townFaccade = townFaccade;
    }
}
