class DoubleInfinityDemo
{
public static void main(String args[])
{
Double a=new Double(0/1.0);
System.out.println(a.isInfinite());
System.out.println(a.isNaN());
System.out.println(Double.isNaN(1/0.0));
}

}