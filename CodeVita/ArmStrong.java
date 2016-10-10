strictfp class ArmStrong
{
public strictfp static void main(String\u005b\u005d args)
{

int num=671;
int temp=0;
int temp2=0;
for(temp2=num;num>0;num/=10)
{
temp+=StrictMath.pow(num%10,3);
}

if(temp2==temp)
System.out.print("armstrong");
}
}