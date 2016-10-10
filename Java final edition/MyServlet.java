import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class MyServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{
String name=req.getParameter("username");
String password=req.getParameter("pswrd");
PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
String gender=req.getParameter("gender");
String cb1=req.getParameter("cb1");
String cb2=req.getParameter("cb2");
pw.println(name+"\t"+password+"\t"+gender+"\t"+cb1+"\t"+cb2);
pw.close();


}
}