import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class MatrixMultiplication
{
private int mat[][];
private int row,col;
MatrixMultiplication(int r,int c)
{
row=r;
col=c;
mat=new int[r][c];
}
int[][] getMatrix() throws IOException
{
BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st;
for(int i=0;i<row;i++)
{
System.out.println("enter the data for row"+(i+1));
st=new StringTokenizer(a.readLine()," ");
for(int j=0;j<col;j++)
{
mat[i][j]=Integer.parseInt(st.nextToken(),10);
}
}
return mat;
}

int[][] getSum(int [][]f1,int[][] f2)
{
int[][] temp=new int[row][col];

for(int i=0;i<row;i++)
for(int j=0;j<col;j++)
	temp[i][j]=f1[i][j]+f2[i][j];
	
return temp;
}

void displayMatrix(int[][] mat3)
{

for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat3[i][j]+"\t");
}
System.out.println();
}


}








}