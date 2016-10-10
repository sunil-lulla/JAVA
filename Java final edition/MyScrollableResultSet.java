import java.sql.*;
class MyScrollableResultSet
{
public static void main(String[] args){

 try {
            
		Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
            PreparedStatement st=conn.prepareStatement("truncate table Employee");
            	int i=st.exceuteUpdate();
	if(i!=0)
	{
System.out.println("Truncated");
	}
            
		st=conn.prepareStatement("insert into Employee values(?,?,?)");
	    
            
	for(int i=0;i<1200;i++)
	{

	rs.setString(1,i.toString());
	rs.setInt(2,i);
	rs.setInt(2,1000+i*100);
	rs.executeUpdate();

	
	}	


	System.out.print("updated");            
            
            
            
        } 
	catch (SQLException ex) {
	System.out.print(ex);
             
        } catch (ClassNotFoundException ex) {
System.out.print(ex);
                    }



System.out.print("updated");

}

}