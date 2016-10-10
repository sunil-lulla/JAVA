class UsePassByRef
{
public static void main(String args[])
{

PassByRef ak= new PassByRef();
ak.show();
ak.swap(ak);
ak.show();
}
}
class PassByRef
{
private int a,b;
PassByRef()
{
a=0;
b=0;
}
public void swap(PassByRef  k)
{
k=new PassByRef();
k.a=k.a+1;
k.b=k.b+1;
}
public void show()
{
System.out.println(a+"\t"+b);
}



}