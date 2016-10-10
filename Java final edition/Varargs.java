class Varargs
{
static void vaTest(boolean b,int k,int...v)
{
for(int x:v)
System.out.print("\t"+x);
}
static void vaTest(boolean b,String...k)
{
System.out.print("\tbang"+b);
}


public static void main(String[] args)
{
vaTest(true,2,3,4,5);
System.out.println();
vaTest(false,12,23,44,5);
System.out.println();
vaTest(true,2,3);
System.out.println();
vaTest(false,3);
System.out.println();
vaTest(true,2,3,4,5,5,5,5,5,5,5,5);
System.out.println();
}
}