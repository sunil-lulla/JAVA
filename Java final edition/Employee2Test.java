class Employee2Test
{
public static void main(String[] args)
{
Employee2[] a= new Employee2[7];
for(Employee2 b:a)
{
b= new Employee2("Sam",23,1);
b.show();
b.showNextID();
}
Employee2 kk= new Employee2("pan",90,1);
System.out.println("\n");
kk.showNextID();
{
Employee2  e1= new Employee2("amy",29,1); 
e1.show();
e1.showNextID();
Employee2  e2= new Employee2("amy",29,1); 
e2.show();
e2.showNextID();
e1=e2=null;
System.gc();
System.runFinalization();
}
//Employee2 kk= new Employee2("pan",90);
kk.showNextID();
}
}
