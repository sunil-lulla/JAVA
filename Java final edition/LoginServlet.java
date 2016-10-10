import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class LoginServlet extends HttpServlet
{
private PreparedStatement ps=null;
private Connection con=null;
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{
doPost(req,resp);
} 
public void init() throws ServletException
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.print("Loaded successfully");
con=DriverManager.getConnection("jdbc:oracle:thin:@//Sam-pc:1521/xe","system","sam");
ps=con.prepareStatement("select * from login where USERID= ? and PASS= ? ");
System.out.print("init");
}
catch(ClassNotFoundException e)
{
System.out.print("class not avilable"+e.getMessage());
}
catch(SQLException e)
{
System.out.print("SQl"+e.getMessage());
}
}

public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{
PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
try
{
int uid=Integer.parseInt(req.getParameter("name"));
String pwd=req.getParameter("pwd");
System.out.print(pwd+" "+uid);
ps.setInt(1,uid);
ps.setString(2,pwd);
ResultSet rs=ps.executeQuery();
System.out.println(rs);
pw.print("<html><body bgcolor='red'>");



if(rs.next())
pw.println("<h1>welcome user jee</h1>");


else
pw.println("<h1>denied<a href='LoginPage.html'>try again</a></h1>");
}
catch(NumberFormatException e)
{
pw.println("<h1>Invalid Input</h1>");
}
catch(SQLException e)
{
System.out.print("error");
throw new ServletException("error occured"+e.getMessage());
}
pw.println("</body></html>");











}
public void destroy()
{
try{
con.close();
}
catch(SQLException e)
{
}
}





}