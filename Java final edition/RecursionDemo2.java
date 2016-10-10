class RecursionDemo2
{
public int sam(int n)
{
if(n==6)
return 0;
System.out.print(n+"\t");
return(n+sam(n+1));
}
public static void main(String[] args)
{

int k=new RecursionDemo2().sam(1);
System.out.print(k);
}
}