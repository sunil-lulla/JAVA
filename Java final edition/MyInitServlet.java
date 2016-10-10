import javax.servlet.*;
import javax.servlet.http.*;
public class MyInitServlet extends HttpServlet
{

public void init() throws ServletException
{
ServletConfig scf=super.getServletConfig();
System.out.println(scf.getInitParameter("name"));
}

public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException
{
System.out.println("Hello");
}
}