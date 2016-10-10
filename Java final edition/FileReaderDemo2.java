import java.io.*;
class FileReaderDemo2
{
public static void main(String args[])
{
File a=null;
FileReader f=null;
FileWriter ab=null;
try
{
a= new File("sam.txt");
ab= new FileWriter(a,true);
f= new FileReader(a);
char []ch=new char[(int)a.length()];

ab.write("\r\nsklkam sdjksjd sfd");
}
catch(FileNotFoundException e)
{
System.out.print("file not found");
}
catch(IOException e)
{
System.out.print("error in reading file");
}

finally
{

if(f!=null)
{
try{
ab.flush();
f.close();
System.out.print("file saved suu");
}
catch(IOException e)
{

}
}


}



}
}