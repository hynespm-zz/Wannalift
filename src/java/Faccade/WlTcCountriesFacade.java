/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faccade;

import Entities.WlTcCountries;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Patrick
 */
@Stateless
public class WlTcCountriesFacade extends AbstractFacade<WlTcCountries> {
    @PersistenceContext(unitName = "WannaLiftPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WlTcCountriesFacade() {
        super(WlTcCountries.class);
    }
    
}
