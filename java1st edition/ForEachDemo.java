class ForEachDemo
{
public static void main(String args[])
{

int[] arr={2,1,2,32,3,4,5,6};
for(int x:arr)
{

x*=10;
System.out.println(x);
}
for(int x:arr)
{

if(x==5)
break;
System.out.println(x);
}


}




}