class StaticThis
{
static void A(StaticThis a)
{
System.out.println(k);
}
public static void main(String[] args)
{
StaticThis a= new StaticThis();
StaticThis.A(a);
}
}