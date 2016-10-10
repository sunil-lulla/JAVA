class MatrixAdd
{
public static void main(String args[])
{

int[][] mat1={{1,2,3},{1,2,3},{1,2,3}};
int[][] mat2={{2,2,3},{1,2,3}};
if(mat1.length==mat2.length)
{
for(int i=0;i<mat1.length;i++)
{
for(int j=0;j<mat1[i].length;j++)
{
System.out.print(" "+(mat1[i][j]+mat2[i][j]));
}
System.out.println();
}

}
else
{
System.out.println("errorno");
}
}



}