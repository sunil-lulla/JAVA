import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletNew extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{

PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
String languages[]=req.getParameterValues("progScroll");
for(String a:languages)
pw.println(a);
pw.println(req.getRemoteHost());


}
}
