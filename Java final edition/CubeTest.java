import java.io.*;
class CubeTest
{
public static void main(String[] args) throws IOException
{
BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
double num=Double.parseDouble(bf.readLine());
Cube a= new Cube(new Square(new Origin()));
a.setCube(num);
a.showCube();

}
}