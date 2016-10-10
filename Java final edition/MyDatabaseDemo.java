import java.sql.*;
class MyDatabaseDemo
{
public static void main(String[] a)
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.print("Obtained");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
System.out.print("Connected");
PreparedStatement ps= conn.prepareStatement("select * from abhi");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
System.out.println(rs.getString(1));
}
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
}
}