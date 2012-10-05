/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faccade;

import Entities.WlTcCounties;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Patrick
 */
@Stateless
public class WlTcCountiesFacade extends AbstractFacade<WlTcCounties> {
    @PersistenceContext(unitName = "WannaLiftPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WlTcCountiesFacade() {
        super(WlTcCounties.class);
    }
    
}
