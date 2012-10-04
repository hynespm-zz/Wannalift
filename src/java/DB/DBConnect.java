/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

/**
 *
 * @author Patrick Hynes
 */
public class DBConnect {
    private static String dbURL = "jdbc:derby://localhost:1527/lift;create=true;user=wannalift;password=wannalift";
    // jdbc Connection
    public static Connection conn = null;
    private static Statement stmt = null;
    private PreparedStatement insert;

    /**
     * @return the conn
     */
    public static Connection getConn() {
        return conn;
    }

    /**
     * @param aConn the conn to set
     */
    public static void setConn(Connection aConn) {
        conn = aConn;
    }

   
    
    public DBConnect() {
        try {
            createConnection();
        } catch (InstantiationException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 
     * @param sql 
     */
    public void insertStatements(String sql){
        
    }
    
    
    /**
     * 
     * @throws InstantiationException 
     */
    private static void createConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
      
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            setConn(DriverManager.getConnection(dbURL)); 
            
       
    }

    public void insertCounties(List<String> completeCounties) throws SQLException {
        
        String insertCountySql="INSERT INTO WL_COUNTIES (NAME) VALUES ('";
        
        
         
       for(String town:completeCounties){   
           Statement sta = conn.createStatement();
           insertCountySql=insertCountySql+town+"')";
         
           int res=sta.executeUpdate(insertCountySql);
            
           sta.close();
           insertCountySql="INSERT INTO WL_COUNTIES (NAME) VALUES ('";
       }
        
    }

    public void insertTowns(List<String> towns,List<String> completeCounties){
        
         String insertCountySql;
        System.out.println(towns.size());
        System.out.println(completeCounties.size());
        for (int i=0;i<towns.size();i++) {
           String town=towns.get(i);
           String county=completeCounties.get(i);
           insertTown(town,county);                                         
        }
         
      
        
        
        
    }

    private void insertTown(String town, String county) {
        try {
            if(!town.contains("'")&& !county.equals("Tipp")){
            
            Statement sta = conn.createStatement();
            String sql = "SELECT C_ID FROM WL_COUNTIES WHERE NAME='" + county + "'";
            System.out.println(sql+" "+town);
            ResultSet res = sta.executeQuery(sql);
            res.next();
            String cid = res.getString("C_ID");
            


            String insertCountySql = "INSERT INTO WL_TOWNS (C_ID,NAME) VALUES (" + cid + ",'" + town + "')";
            System.out.println(insertCountySql);
            int result = sta.executeUpdate(insertCountySql);
            System.out.println(insertCountySql);
            sta.close();
            res.close();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
