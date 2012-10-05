/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faccade;

import Entities.WlTcTowns;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Patrick
 */
@Stateless
public class WlTcTownsFacade extends AbstractFacade<WlTcTowns> {
    @PersistenceContext(unitName = "WannaLiftPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WlTcTownsFacade() {
        super(WlTcTowns.class);
    }
    
}
