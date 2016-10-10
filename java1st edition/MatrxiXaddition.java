import java.util.Scanner;
class MatrixAddition
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in); 
System.out.println("enter no rows");
int row=sin.nextInt();
System.out.println("enter column");
int col=sin.nextInt();
int[][] mat=new int[row][col];
for(int i=0;i<row;i++)
{
System.out.println("enter for row"+(i+1));
for(int j=0;j<col;j++)
{

mat[i][j]=sin.nextInt();
}

}

}



}