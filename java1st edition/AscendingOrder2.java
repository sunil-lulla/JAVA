class AscendingOrder
{
public static void main(String[] args)
{
String temp;
//int[] arr=new int[args.length];
/*
*
*
*for converting string into integer
*
*/

//for(int i=0;i<args.length;i++)
//{
//arr[i]=Integer.parseInt(args[i]);
//}
/*
for(int i=0;i<args.length;i++)
{
System.out.println(arr[i]);
}
*/
for(int i=0;i<args.length;i++)
{
for(int j=i+1;j<args.length;j++)
{
if(args[i]>args[j])
{
temp=args[i];
args[i]=args[j];
args[j]=temp;
}
}
}
for(int i=0;i<args.length;i++)
{
System.out.println(args[i]);
}


}


}