import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.sql.*;
import java.util.Scanner;
class InsertDate
{
public static void main(String[] args)
{
Connection conn=null;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
PreparedStatement ps=conn.prepareStatement("insert into Employee values(?,?,?,?)",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
System.out.print("insert the name,id,salary,Date");
Scanner kin= new Scanner(System.in);
ps.setString(1,kin.next());
ps.setInt(2,kin.nextInt());
ps.setInt(3,kin.nextInt());
String date=kin.next();
SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
java.util.Date d=null;
try
{
d=sdf.parse(date);
}
catch(ParseException e)
{
System.out.print(e);
}
Date sqlDate=new Date(d.getTime());
ps.setDate(4,sqlDate);
//ps.setDate(4,d);
ps.executeUpdate();
}
catch(ClassNotFoundException|SQLException e)
{
System.out.println(e);
}

finally
{
try{
conn.close();
}
catch(SQLException e)
{
System.out.println(e);
}

}


}
}