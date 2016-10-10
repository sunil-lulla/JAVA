class Method3
{
private static int a;
private int b;
public void A()
{
System.out.print(a);
}
}

class Method2
{

private static float b;
public static  void main(String[] args)
{
System.out.print(b);
Method3 a= new Method3();
a.A();
}

}




