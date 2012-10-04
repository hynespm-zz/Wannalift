/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faccades;

import Entity.WlCounties;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Patrick Hynes
 */
@Stateless
public class WlCountiesFacade extends AbstractFacade<WlCounties> {
    @PersistenceContext(unitName = "WannaLiftPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WlCountiesFacade() {
        super(WlCounties.class);
    }
    
}
