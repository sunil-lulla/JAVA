class Factory
{
private int a;
private Factory()
{
a=10;
}
public static Factory getFactoryInstance()
{
Factory a= new Factory();
return a;
}
public void show()
{
System.out.print(a);
} 
}