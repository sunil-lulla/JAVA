class NumTest
{
public static void main(String[] args)
{
Num a= new Num();
Num b= new Num();
a.setData(10,20);
b.setData(30,40);
a.display();
b.display();
new Num().swap(a,b);
a.display();
b.display();



}
}