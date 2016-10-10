class InfiniteDemo
{
public static void main(String args[])
{
Double a= new Double(1/0.0);

System.out.println(a.isInfinite()); //true
System.out.println(a.isNaN());//false



}

}