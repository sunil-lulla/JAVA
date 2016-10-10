import java.sql.*;
class NewData
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery("select id,name,salary from employee");
rs.absolute(2);
rs.deleteRow();
System.out.println("updaate");
}

catch(SQLException e)
{
System.out.print(e);
}


catch(ClassNotFoundException e)
{
System.out.print(e);
}


}
}