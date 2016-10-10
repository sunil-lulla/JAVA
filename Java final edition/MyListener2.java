import javax.servlet.*;
public class MyListener2 implements ServletContextListener
{

public void contextInitialized(ServletContextEvent e)
{

ServletContext sc=e.getServletContext();
sc.setAttribute("name","developer");
System.out.print("Done\n\n\n\n\n\n\n\n\n\n\n\n");


}


public void contextDestroyed(ServletContextEvent e)
{
System.out.print("Undone\n\n\n\n\n\n\n\n\n\n\n\n");


}




}