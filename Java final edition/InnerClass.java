import java.util.*;
class InnerClass
{
private double interest=0.0f;
InnerClass(double interest)
{
this.interest=interest;
}
void contact(double rate)
{
Scanner sin= new Scanner(System.in);
int pass=sin.nextInt();
if(pass==12345)
{
Interest in= new Interest(rate);
in.calculate();
}
else
{
System.out.println("invalid");
System.exit(0);
}

}
private class Interest
{
private double interest;
Interest(double interest)
{
this.interest=interest;
InnerClass.this.interest=60;
}
public void show()
{
System.out.println(InnerClass.this.interest);
}
private void calculate()
{
System.out.print(this.interest+200);
show();
}
}
}
