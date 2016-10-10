class Num
{
private int x;
private int y;
public void setData(int x,int y)
{
this.x=x;
this.y=y;
}
public void swap(Num a,Num b)
{
int temp;
temp=a.x;
a.x=b.x;		
b.x=temp;
temp=a.y;
a.y=b.y;
b.y=temp;
}
public void display()
{
System.out.println(x+"\t"+y);
}

	


}