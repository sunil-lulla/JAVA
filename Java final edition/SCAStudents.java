import java.util.Scanner;
class SCAStudents
{
public static void main(String[] args)
{

System.out.println("Enter the number of branches of SCA");
Scanner sin= new Scanner(System.in);
int branch=sin.nextInt();
int[] student= new int[branch];
int course=0;
for(int i=0;i<branch;i++)
{
System.out.println("Enter the number of courses in branch no "+(i+1)+" of SCA");
course=sin.nextInt();
for(int j=0;j<course;j++)
{
System.out.println("Enter the number of students in course no "+(j+1)+" of SCA");
student[i]+=sin.nextInt();
}
}

for(int i=0;i<student.length;i++)
{
System.out.println("The number of students in branch no "+(i+1)+" is : "+student[i]);
}




}
}