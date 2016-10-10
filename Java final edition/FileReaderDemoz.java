import java.io.*;
class FileReaderDemoz
{
public static void main(String[] args) throws FileNotFoundException,IOException
{

File f= new File("c:/windows/twain.dll");
FileReader f2= new FileReader(f);
char []ch=new char[(int)f.length()];
f2.read(ch);
System.out.print(ch);


}

}