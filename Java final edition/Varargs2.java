class Varargs2
{
static void vTest(int a)
{
System.out.print(a);
}
static void vTest(int ... a)
{
System.out.print(a);
}
static void vTest()
{
System.out.print("bang");
}


public static void main(String[] args)
{
vTest(2,3);
vTest(2);
vTest();


}

}