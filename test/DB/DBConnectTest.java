/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Patrick
 */
public class DBConnectTest {
    /**
     * 
     */
    private DBConnect connect;
    public DBConnectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        connect=new DBConnect();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConn method, of class DBConnect.
     */
    @Test
    public void testGetConn() {
        System.out.println("getConn");
        Connection expResult = null;
        Connection result = connect.getConn();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setConn method, of class DBConnect.
     */
    @Test @Ignore
    public void testSetConn() {
        System.out.println("setConn");
        Connection aConn = connect.getConn();
        DBConnect.setConn(aConn);
        // TODO review the generated test code and remove the default call to fail.
        //assertNotSame(expResult, result);
    }

    /**
     * Test of insertStatements method, of class DBConnect.
     */
    @Test@Ignore
    public void testInsertStatements() {
        System.out.println("insertStatements");
        String sql = "";
        DBConnect instance = new DBConnect();
        instance.insertStatements(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertCounties method, of class DBConnect.
     */
    @Test @Ignore
    public void testInsertCounties() throws Exception {
        System.out.println("insertCounties");
        List<String> completeCounties = null;
        DBConnect instance = new DBConnect();
        instance.insertCounties(completeCounties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTowns method, of class DBConnect.
     */
    @Test @Ignore
    public void testInsertTowns() {
        System.out.println("insertTowns");
        List<String> towns = null;
        List<String> completeCounties = null;
        DBConnect instance = new DBConnect();
        instance.insertTowns(towns, completeCounties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
