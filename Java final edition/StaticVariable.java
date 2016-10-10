class StaticVariable
{
static  int a=12;
public static void Variable()
{
   int a=12;
System.out.println(a);
//++a;
}
public void A()
{
Variable();
Variable();
Variable();
}
public static void main(String args[])
{
StaticVariable a= new StaticVariable();
a.A();
}



}