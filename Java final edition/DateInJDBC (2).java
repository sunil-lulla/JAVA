import java.sql.*;
import java.text.SimpleDateFormat;
class DateInJDBC
{
public static void  main(String[] args)
{


try
{

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
Statement st=conn.createStatement();

ResultSet rs=st.executeQuery("select * from Employee");
while(rs.next())
{
java.util.Date date= rs.getDate(4);
SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+sdf.format(date));
}




System.out.print("Siam");

}

catch(Exception e)
{
System.out.print(e);

}


}
}