import java.util.Scanner;
class MatrixAddition
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in); 
System.out.println("------------- Matrix 1---------------");
System.out.println("enter no rows");
int row=sin.nextInt();
System.out.println("enter column");
int col=sin.nextInt();
int[][] mat=new int[row][col];
int i=0,j=0;
for(i=0;i<row;i++)
{ 
for(j=0;j<col;j++)
{
mat[i][j]=sin.nextInt();
}
}
System.out.println("-------------Matrix 2---------------");
System.out.println("enter no rows");
int row2=sin.nextInt();
System.out.println("enter column");
int col2=sin.nextInt();
int[][] mat2=new int[row2][col2];
for(i=0;i<row2;i++)
{ 
for(j=0;j<col2;j++)
{
mat2[i][j]=sin.nextInt();
}
}




System.out.println("------------mat1-------------");
for(i=0;i<row;i++)
{
System.out.print("\t"+"   ");
for(j=0;j<col;j++)
{

System.out.print(mat[i][j]+" ");
}
System.out.println();


}
System.out.println("------------mat2_-------------");
for(i=0;i<row2;i++)
{
System.out.print(mat[i][j]+" ");
for(j=0;j<col2;j++)
{

System.out.print(mat2[i][j]+" ");
}


}



if(row==row2&&col==col2)
{
System.out.println("here is the sum");

for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.println(""+(mat[i][j]+mat2[i][j]));
}
System.out.println();

}



}
else
System.out.println("not possible");




}

}



