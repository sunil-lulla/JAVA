class One
{
int a;
Two two;
One(Two two,int a)
{
this.two=two;
this.a=a;
}

void display()
{
System.out.print("one var"+this.a);
two.display();
two.setA(58);
two.display();

}




}