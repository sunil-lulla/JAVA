class RandomIDTest
{
public static void main(String[] args)
{
RandomID[] arr= new RandomID[3];
int i=9;
for(int k=0;k<arr.length;k++)
{
arr[k]=new RandomID("sam",11+i);
i+=8;
arr[k].getDetails();
}
arr[2].getNextID();
}
}