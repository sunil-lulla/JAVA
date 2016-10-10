import java.sql.*;
class UpdateSalary
{
public static void main(String[] args)
{

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery("select name,salary from employee");
while(rs.next())
{
if(rs.getString(1).equals("sam"))
{

int salary=rs.getInt(2);
rs.updateInt(2,salary+700);
rs.updateRow();
}
}


System.out.println("updaate");




}
catch(SQLException e)
{

}


catch(ClassNotFoundException e)
{

}



}
}