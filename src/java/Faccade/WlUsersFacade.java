/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faccade;

import Entities.WlUsers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Patrick
 */
@Stateless
public class WlUsersFacade extends AbstractFacade<WlUsers> {
    @PersistenceContext(unitName = "WannaLiftPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WlUsersFacade() {
        super(WlUsers.class);
    }
    
}
