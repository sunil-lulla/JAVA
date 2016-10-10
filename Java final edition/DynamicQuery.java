import java.sql.*;
import java.util.*;
class DynamicQuery extends Object
{
public static Statement getStatement()
{
Statement st=null;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
st=conn.createStatement();
}
catch(Exception e)
{
System.out.print(e);
}
return st;
}


public static void main(String[] args) throws SQLException
{
Statement st=DynamicQuery.getStatement();
Scanner sin= new Scanner(System.in);
int id=sin.nextInt();
String name=sin.next();
String  salary=sin.next();

String query="select * from Employee where empid="+id+" and name='"+name+"')";

System.out.print(query);
ResultSet rs=st.executeQuery(query);

while(rs.next())
{
System.out.println("A gya");
System.out.print(rs.getString(1));
}
}
}