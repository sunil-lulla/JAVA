import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*; 
import java.io.*;
public class MyDBServlet extends HttpServlet
{

Connection conn;
PreparedStatement ps;
public void init() throws ServletException
{

try{
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
System.out.println("1");
ps=conn.prepareStatement("select * from Employee where name=? and password=?");
System.out.println("2");
}
catch(ClassNotFoundException e)
{
System.out.print(e);

}


catch(SQLException e)
{
System.out.print(e);

}
}
















public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{
PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
String username=req.getParameter("uname");
String password=req.getParameter("pwd");
try{
ps.setString(1,username);
ps.setString(2,password);
ResultSet rs=ps.executeQuery();
if(rs.next())
pw.println("Welcome"+username+"\t"+password);
else
pw.println("Invalid try again<a href='index.html'> go back</a>");
}
catch(SQLException e)
{
System.out.println(e);
}



















}
}