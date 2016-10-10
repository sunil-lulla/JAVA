import java.sql.*;
class GetInfoFromDatabase
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","sam");
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("select * from Employee");
while(rs.next())
System.out.println(rs.getInt(1)+"\t\t\t"+rs.getString(2)+"\t\t\t"+rs.getInt(3));

}
catch(Exception e)
{
System.out.print(e.getMessage());
}

}
}