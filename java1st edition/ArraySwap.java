import java.util.Arrays;
class ArraySwap
{
public static void main(String args[])
{

int[] a={2,3,4,4,5,5,5,5,5};
int[] b={1,2,3,4,5,6,7,8,9};
int[] temp;
System.out.println("---------------Before swaping----------------");
System.out.println();
System.out.println();
System.out.println("         "+Arrays.toString(a));
System.out.println("         "+Arrays.toString(b));

temp=a;
a=b;
b=temp;
System.out.println();
System.out.println();
System.out.println();
//System.out.println();
//System.out.println();
System.out.println("---------------After swaping-----------------");
System.out.println();
System.out.println();
System.out.println("         "+Arrays.toString(a));
System.out.println("         "+Arrays.toString(b));


}



}