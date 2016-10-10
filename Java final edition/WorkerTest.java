class WorkerTest
{
public static void main(String[] args)
{
Worker []worker= new Worker[3];
worker[0]=new Worker("babu",11000,2013,9,28);
worker[1]=new Worker("kunal",11000,2003,6,21);
worker[2]=new Worker("aadi",11000,1993,6,20);
for(Worker k:worker)
{System.out.println(k.getName());
System.out.printf("%.2f\n",k.getSalary());
System.out.println(k.getHireDay());
k.raisesalary(10);
System.out.printf("%.2f\n",k.getSalary());
}


}
}
