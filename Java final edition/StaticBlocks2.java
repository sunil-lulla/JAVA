class StaticBlocks2
{
static
{
String[] ak=new String[6];
System.out.print("helll");
main(ak);
}
private static int a=10;
static
{
System.out.print("2");

}


public static void main(String[] args)
{
System.out.print("main");
main(args);
}

static
{
System.out.print("3");

}



}