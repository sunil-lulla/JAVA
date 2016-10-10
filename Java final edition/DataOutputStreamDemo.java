import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
class DataInputStreamDemo
{
public static void main(String[] args) throws IOException
{

DataInputStream a= new DataInputStream(new FileInputStream("c:/windows/twain.dll")); 
int bc=a.readInt();
System.out.print(bc);
}
}