/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import DB.DBConnect;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick
 */
public class DataImport {

    private static DBConnect connect;
    private static String str;

    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
        List<String> towns = new ArrayList();
        List<String> counties = new ArrayList();
        List<String> regions = new ArrayList();
        List<String> countries = new ArrayList();

        BufferedReader in = new BufferedReader(new FileReader("c:\\data\\tc_counties.csv"));
        connect = new DBConnect();
//        while ((str = in.readLine()) != null) {
//            str = str.replaceAll("'", "");
//            String[] temp = str.split("\t");
//            System.out.println(str);
//            String insertTownSql = "INSERT INTO WL_TC_TOWNS (COUNTY_ID,TOWN,BS) VALUES (" + temp[1] + ",'" + temp[2] + "','" + temp[3] + "')";
//            Statement sta = DBConnect.getConn().createStatement();
//            int res = sta.executeUpdate(insertTownSql);
//            sta.close();
//        }

//        
//         while ((str = in.readLine()) != null) {
//            str = str.replaceAll("'", "");
//            String[] temp = str.split("\t");
//            System.out.println(str);
//            String insertTownSql = "INSERT INTO WL_TC_REGIONS (COUNTRY_ID,REGION,RANK) VALUES (" + temp[1] + ",'" + temp[2] + "'," + temp[3] + ")";
//            Statement sta = DBConnect.getConn().createStatement();
//            int res = sta.executeUpdate(insertTownSql);
//            sta.close();
//        }
        
//        while ((str = in.readLine()) != null) {
//            str = str.replaceAll("'", "");
//            String[] temp = str.split("\t");
//            System.out.println(str);
//            String insertTownSql = "INSERT INTO WL_TC_COUNTRIES (COUNTRY) VALUES ('" + temp[1] + "')";
//            Statement sta = DBConnect.getConn().createStatement();
//            int res = sta.executeUpdate(insertTownSql);
//            sta.close();
//        }
        
        
         while ((str = in.readLine()) != null) {
            str = str.replaceAll("'", "");
            String[] temp = str.split("\t");
            System.out.println(str);
            String insertTownSql = "INSERT INTO WL_TC_COUNTIES (COUNTRY_ID,REGION,COUNTY) VALUES (" + temp[1] + "," + temp[2] + ",'" + temp[3] + "')";
            Statement sta = DBConnect.getConn().createStatement();
            int res = sta.executeUpdate(insertTownSql);
            sta.close();
        }
        in.close();

    }
}
