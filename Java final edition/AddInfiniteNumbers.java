import java.util.*;
class AddInfiniteNumbers
{
public static void main(String[] args)
{
ArrayList<Integer> al= new ArrayList<Integer>();
int num;
do
{
num=new Scanner(System.in).nextInt();
if(num==-1)
break;
al.add(num);
}
while(true);
System.out.println("the size of list is:"+al.size());
for(Integer in:al)
System.out.println(in);

}
}