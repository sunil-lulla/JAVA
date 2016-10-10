import javax.servlet.http.*;
import java.io.*;
import javax.servlet.ServletException;
import java.util.Enumeration;
public class MyINfoServlet2 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
pw.println(req.getMethod());
pw.println(req.getServletPath());
pw.println(req.getHeader("userAgent"));
Enumeration em=req.getHeaderNames();
while(em.hasMoreElements())
{
String key=(String)em.nextElement();
pw.print(key+" --- ");
System.out.println();
pw.println(req.getHeader(key));
}
pw.close();














}
}