class EmployeetutorialTest
{
public static void main(String[] args)
{

EmployeeTutorial[] e= new EmployeeTutorial[3];
e[0]=new EmployeeTutorial("sam",23);
e[1]=new EmployeeTutorial("sami",20);
e[2]=new EmployeeTutorial("samsonite",39);
for(EmployeeTutorial et:e)
{
System.out.println(et.getName()+"\t"+et.getAge()+"\t"+et.getEmpId());
}


}
}