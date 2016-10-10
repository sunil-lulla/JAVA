import java.io.IOException;
class UseMatrixMultiplication
{
public static void main(String[] args) throws IOException
{
MatrixMultiplication a= new MatrixMultiplication(3,3);
MatrixMultiplication b= new MatrixMultiplication(3,3);
int[][] mat1;
mat1=a.getMatrix();
int[][] mat2;
mat2=b.getMatrix();
int[][] m3;
m3=a.getSum(mat1,mat2);
a.displayMatrix(m3);
}
}