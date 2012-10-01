/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;


import DB.DBConnect;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick Hynes
 */
public class WL_Import {

    private static DBConnect connect;
    
    public static void main(String[] args) {
        try {
            
           
            PreparedStatement countInsert;
            PreparedStatement countSelect;
            
            String insertTownSql="INSERT INTO WL_TOWNS (COUNT_ID,NAME) VALUES (?,?)";
            String insertCountySql="INSERT INTO WL_COUNTIES (NAME) VALUES (?)";
            String queryCountySql="SELECT COUNTY_ID FROM WL_COUNTIES WHERE NAME='?'";
            
           
            
            BufferedReader in = new BufferedReader(new FileReader("e:\\patrick.txt"));
            String str;
            List<String> towns=new ArrayList();
            List<String> counties=new ArrayList();
            System.out.println("Hi");
             connect=new DBConnect();
            while ((str = in.readLine()) != null) {                
                    String[] temp = str.split("\t");
                    towns.add(temp[0]);
                    counties.add(temp[1]);
                }
            System.out.println(towns.size());
            in.close();
            
            
//            List<String> completeCounties=new ArrayList();
//            
//            for(String county:counties){
//                
//                boolean exists=false;
//                for(String realCounty:completeCounties){
//                    if(county.equals(realCounty)){
//                       exists=true;                       
//                       break;
//                    }
//                }
//                if(!exists){
//                    completeCounties.add(county);                    
//                }
//            }
             
            
             
             
             //connect.insertCounties(completeCounties);
             connect.insertTowns(towns,counties);
             
             
         
             
             
//           
//            countSelect=connect.getConn().prepareStatement(queryCountySql);
//            countInsert=connect.getConn().prepareStatement(insertCountySql);
//            insert=connect.getConn().prepareStatement(insertTownSql);
//            
//             /**
//              * Insert the counties
//              */
//            List<String> indexes=new ArrayList();
//            for(int i=0;i<counties.size();i++){
//                String county=counties.get(i);
//               if(!county.equals("")){
//                   
//                   /**
//                    * Find out if its already there
//                    */
//                   countSelect.setObject(1, county);
//                   ResultSet rs=countSelect.executeQuery();
//                   if(!rs.next()){
//                       /**
//                        * Is empty
//                        */
//                       countInsert.setObject(1, county);
//                       countSelect.execute();                       
//                   }
//                   
//                   
//               }else{
//                   indexes.add(new String(new Integer(i).toString()));
//               }
//               countSelect.close();
//            }
//            connect.getConn().commit();
//            
//            
//            System.out.println("Number of towns:"+towns.size());
//            System.out.println("Number of couties:"+counties.size());
            
        } catch (Exception e) {
        }


    }
}
