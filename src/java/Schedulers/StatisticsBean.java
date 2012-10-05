/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Schedulers;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;

/**
 *
 * @author Patrick Hynes
 */
@Stateless
@LocalBean
public class StatisticsBean {

    // @Schedule(minute = "*", second = "0", dayOfMonth = "*", month = "*", year = "*", hour = "9-17", dayOfWeek = "Mon-Fri")
    public void myTimer() {
        System.out.println("Timer event: " + new Date());
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
