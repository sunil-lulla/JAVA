import java.sql.*;
class MyScrollableResultSet4
{
public static void main(String[] args){
int counter=0;
 try {
            
		Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            	
		ResultSet rs=st.executeQuery("select * from employee");
		
		while(rs.next())
		{	
			System.out.print("2");
			int sal=rs.getInt(3);
			if(sal>5000)
			{
			System.out.print("1");
			rs.updateInt(3,sal+500);
counter++;		
			}
			

		}

			
	            
            
            
        } 
	catch (SQLException ex) {
	System.out.print(ex.getMessage());
             
        } catch (ClassNotFoundException ex) {
System.out.print(ex);
                    }



System.out.print(" updated "+counter);

}

}