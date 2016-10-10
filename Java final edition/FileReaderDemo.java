import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileReaderDemo
{
public static void main(String[] args) throws FileNotFoundException,IOException
{
FileReader f= new FileReader("sam.txt");
int ch;
int count=0;
while((ch=f.read())!=-1)
{
System.out.print((char)ch);
if(ch!=32)
count++;
}
System.out.print(count);

}
}