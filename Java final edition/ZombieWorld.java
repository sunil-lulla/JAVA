import java.util.Scanner;
class ZombieWorld
{
public static void main(String[] args)
{

int[] N;
int P,D,T;
boolean lose=false;
Scanner kin= new Scanner(System.in);
int test=kin.nextInt();
for(int i=0;i<test;i++)
{
lose=false;
N=new int[kin.nextInt()];
P=kin.nextInt();
D=kin.nextInt();
T=kin.nextInt();
for(int j=0;j<N.length;j++)
{
N[j]=kin.nextInt();
}


for(int j=0;j<N.length-1;j++)
{
for(int k=j+1;k<N.length;k++)
{
if(N[j]>N[k])
{
N[k]=N[j]*N[k];
N[j]=N[k]/N[j];
N[k]=N[k]/N[j];
}
}

System.out.print("\n\n"+P+"\n\n");



for(j=0;j<N.length&&T>0;T--,j++)
{
if(P>=N[j])
{
P=P+(P-N[j]);
}
else
{
lose=true;
System.out.print("lose");
break;
}

}

if(P>D&&lose!=true)
System.out.print("Yes");
else
System.out.print("No");





}
}
}
}