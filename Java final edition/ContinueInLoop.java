class ContinueInLoop
{
public static void main(String[] args)
{
short count=0;
outer:
for(int i=0;i<9;i++)
{
inner:
for(int j=0;j<9;j++)
{
for(int k=0;k<9;k++)
{
count++;
if(k%2==0)
continue;
if(k%3==0)
continue inner;

System.out.println("i= "+i+"\t"+"j= "+j+"\t"+"k= "+k);




}
}



}

System.out.println("count"+count);

}
}