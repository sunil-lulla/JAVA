class RaggedArray
{
public static void main(String args[])
{


int[][] arr=new int[13][];
arr[0]=new int[1];
arr[1]=new int[2];
arr[2]=new int[3];
arr[3]=new int[4];
arr[4]=new int[5];
arr[5]=new int[6];
arr[6]=new int[7];
arr[7]=new int[6];
arr[8]=new int[5];
arr[9]=new int[4];
arr[10]=new int[3];
arr[11]=new int[2];
arr[12]=new int[1];



//System.out.println(arr.length);
//System.out.println(arr[0].length);
//System.out.println(arr[1].length);
//System.out.println(arr[2].length);
for(int[] x:arr)
{
for(int y:x)
{
System.out.print(" "+y);
}
System.out.println();


}

}



}