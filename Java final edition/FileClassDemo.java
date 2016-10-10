import java.io.*;
import java.util.*;
class FileClassDemo
{
public static void main(String[] args)
{
File f= new File("jdbc");
String[] a=f.list();
for(String k:a)
System.out.println(k);
}
}