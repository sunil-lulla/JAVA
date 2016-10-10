/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sam
 */
public class MyJDBCCode {
    public static void main(String[] args) throws IOException {
        int counter=0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from employee");
            while(rs.next())
		{	
                                            
			                rs.updateString(1, "A");
                                       rs.updateRow();

		}

			
	            
            
            
        } 
	catch (SQLException ex) {
	System.out.print(ex.getMessage());
             
        } catch (ClassNotFoundException ex) {
System.out.print(ex);
                    }
            
            
            
            
        
        
        
        
    }
    
}
