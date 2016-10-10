class UsePassByValue
{
public static void main(String[] args)
{
int a=9;
int b=10;
PassByValue pbv= new PassByValue(a,b);
System.out.println(a+"  "+b);
pbv.show();
pbv.setValue();
pbv.show();
System.out.println(a+"  "+b);
}
}
class PassByValue{
private int a,b;
PassByValue(int c,int d)
{
a=c;
b=d;
}
public void setValue()
{
a*=2;
b*=2;
}
public void show()
{
System.out.println(a+"\t"+b);
}




}