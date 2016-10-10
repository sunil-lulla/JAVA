import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class First extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
resp.setContentType("text/html");
PrintWriter pw= resp.getWriter();
pw.print("<a href='Second' > Click meh</a>");
pw.close();
}
}