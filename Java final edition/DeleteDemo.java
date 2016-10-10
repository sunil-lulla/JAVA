import java.util.*;
class DeleteDemo 
{
public static void main(String[] args)
{
ArrayList<String> al= new ArrayList<>();
Scanner sin= new Scanner(System.in);
System.out.println("Enter the data");
String string=null;
do
{
string=sin.next();
if(string.equals("quit")==false)
al.add(string);
else
break;
}
while(true);
System.out.println("Enter the initial data and ending data");
String lString=sin.next();
String uString=sin.next();
int i=0,k=0;
i=al.indexOf(lString);
k=al.indexOf(uString)+1;
if(i<0||k<0||i>al.size()||k>al.size())
System.out.println("Compilation Error");
else
{
if(i>k)
{
k--;
i++;
k=i+k;i=k-i;k=k-i;
}
while(i!=k)
{al.remove(i);k--;}
}

for(String f:al)
System.out.println(f);

}
}