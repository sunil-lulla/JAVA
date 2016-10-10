import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
class BookPrice
{
public static void main(String[] args)
{
Connection conn=null;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
conn =  DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
PreparedStatement ps= conn.prepareStatement("update allbooks set price=price+? where name=?");
Scanner sin= new Scanner(System.in);
String name=sin.next();
int price=sin.nextInt();
ps.setInt(1,price);
ps.setString(2,name);
int c=ps.executeUpdate();
if(c!=0)
System.out.println(c+" updates");
else
System.out.println("no records");
ps=conn.prepareStatement("select * from allbooks");
ResultSet rs=ps.executeQuery();
System.out.println();
while(rs.next())
{
System.out.print(rs.getString("name")+"\t");
price=rs.getInt("price");
if(rs.wasNull())
System.out.println("No records");
else
System.out.println(price);
}






}
catch(SQLException e)
{
System.out.println(e);

}

catch(ClassNotFoundException e)
{
System.out.println(e);
}





}
}