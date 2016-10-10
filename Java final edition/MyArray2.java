import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MyArray2
{
public static void  main(String[] args) throws IOException
{

BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine(),10);
int[] nums=new int[n];
int sum=0;
for(int i=0;i<nums.length;i++)
{
nums[i]=Integer.parseInt(br.readLine(),10);
sum+=nums[i];
}
for(int i=0;i<nums.length;i++)
{
System.out.print("\t"+nums[i]);
}

System.out.print("averagef:"+((float)sum/n));
}
}