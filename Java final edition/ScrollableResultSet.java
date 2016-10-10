import java.sql.*;
class MyScrollableResultSet
{
public static void main(String[] args){

 try {
            
		Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=st.executeQuery("select * from employee");
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println("hey");
            }
            
            while(rs.previous())
            {
                System.out.println(rs.getString(1));
            }
            
            
            
            
        } 
	catch (SQLException ex) {
            Logger.getLogger(MyJDBCCode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyJDBCCode.class.getName()).log(Level.SEVERE, null, ex);
        }



}

}