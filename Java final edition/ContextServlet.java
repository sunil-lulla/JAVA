import javax.servlet.*;
import javax.servlet.http.*;
public class ContextServlet extends HttpServlet
{

public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException
{
ServletContext sc=super.getServletContext();
System.out.println(sc.getInitParameter("Sunil"));
}


} 