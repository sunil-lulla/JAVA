class AscendingOrder
{
public static void main(String[] args)
{
int temp=0;
int[] arr=new int[args.length];
/*
*
*
*for converting string into integer
*
*/
for(int i=0;i<args.length;i++)
{
arr[i]=Integer.parseInt(args[i]);
}
/*
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
*/
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}


}


}