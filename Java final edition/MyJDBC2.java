/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MyJDBC2 {
    
   
    
    public static void main(String[] args) {
        int count=0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("Select salary from Employee");
            while(rs.next())
            {
            int a= rs.getInt(1);
            if(a>50000)
            {
                System.out.println("---"+rs.getInt(1));
                rs.updateInt(1, a+500);
                ++count;
                 System.out.println(rs.getInt(1));
             rs.updateRow();     
            }
            }
              
            
            System.out.println(count+" records updated successfully");
           
            
            
            
            
            
       conn.close();     
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        
       
        
    }
    
}
