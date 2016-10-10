class RecursionDemo
{
public  int fact(int n)
{
if(n==1)
return 1;
return(n*fact(n-1));
}
public static void main(String[] args)
{
int a=new RecursionDemo().fact(10);
System.out.print(a);
}
}