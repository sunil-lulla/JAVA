import javax.servlet.*;
public class MyListener implements ServletContextListener
{



public void contextInitialized(ServletContextEvent e)
{
System.out.print("Bang");
}


public void contextDestroyed(ServletContextEvent e)
{

System.out.print("Bang2");


}

}