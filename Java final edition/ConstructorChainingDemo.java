class ConstructorChainingDemo
{
private int a;
private int b;
private int c;
ConstructorChainingDemo()
{
}
ConstructorChainingDemo(int c)
{
this.a=this.b=this.c=a;
}




ConstructorChainingDemo(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}





public static void main(String[] args)
{


ConstructorChainingDemo a = new ConstructorChainingDemo();

}
}