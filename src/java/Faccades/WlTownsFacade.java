/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faccades;

import Entity.WlTowns;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Patrick Hynes
 */
@Stateless
public class WlTownsFacade extends AbstractFacade<WlTowns> {
    @PersistenceContext(unitName = "WannaLiftPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WlTownsFacade() {
        super(WlTowns.class);
    }
    
}
