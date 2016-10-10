class StaticBlocks
{
{
System.out.println("hey3");
}
StaticBlocks()
{
System.out.println("hey4");
}
public static void main(String[] args){System.out.println("hey2");
}
static 
{
System.out.println("hey");
StaticBlocks a= new StaticBlocks();
//System.exit(0);
}
}