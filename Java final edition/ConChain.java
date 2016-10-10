class ConChain
{
int x=10;
ConChain()
{
this(x);
}

ConChain(int a)
{
this.x=a+10;
}
void show()
{
System.out.print(this.x);
}
}