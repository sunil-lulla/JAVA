class AmbiguityDemo
{
public void A(double b,char a)
{
System.out.print("in double");
}
public void A(long b,int a)
{
System.out.print("in int");
}
public void A(char b,char a)
{
System.out.print("in int");
}

}