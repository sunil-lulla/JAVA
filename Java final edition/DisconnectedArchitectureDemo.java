/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Sam
 */
public class DisconnectedArchitectureDemo {
    public static void main(String[] a)
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        CachedRowSetImpl crs= new CachedRowSetImpl();
        crs.setUrl("jdbc:oracle:thin:@//localhost:1521/xe");
        crs.setUsername("system");
        crs.setPassword("sam");
        crs.setCommand("select e.* from Employee e");
        crs.execute();
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
        
        while(crs.next())
        {
            
         
        System.out.println(crs.getString(1)+"\t"+crs.getInt(2)+"\t"+crs.getInt(3)+"\t"+sdf.format(crs.getDate(4)));
               
        }
        
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        
        }
        
        
        
        
    }
}
