class UsePassByValueProof
{
public static void main(String[] args)
{
Employee k= new Employee(10);
Employee k2= new Employee(20);
k.show();
k2.show();
PassByValueProof a= new PassByValueProof();
a.swap(k,k2);
k.show();
k2.show();


}
}

class Employee
{
int id;
Employee(int id)
{
this.id=id;
}

public void show()
{

System.out.println(id);

}


}
class PassByValueProof
{
public void swap(Employee a,Employee b)
{
a.show();
b.show();
Employee temp;
temp=a;
a=b;
b=temp;
a.show();
b.show();
}




}