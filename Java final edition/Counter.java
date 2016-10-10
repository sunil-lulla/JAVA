class Counter
{
public static int[] count(int[] arr,int num)
{
int[] brr={0,0,0};
for(int i=0;i<arr.length;i++)
{
        if(arr[i]==num)
         brr[0]+=1;					
       else if(arr[i]>num)	
          brr[1]+=1;	
       else
	brr[2]+=1;	
}
return brr;
}
}
