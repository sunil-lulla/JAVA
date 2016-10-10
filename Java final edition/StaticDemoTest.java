class StaticDemoTest
{
public static void main(String[] args)
{
StaticDemo a= new StaticDemo();
StaticDemo b= new StaticDemo();
++StaticDemo.a;
a.display();
b.display();
StaticDemo.A();
a.display();
b.display();


}


}