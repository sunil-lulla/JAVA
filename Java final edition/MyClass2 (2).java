class MyClass2
{

MyClass2()
{
MyClass2(24);
System.out.print("hey there!..");
}



MyClass2(int a)
{

System.out.print("hey there!..a");
}

int MyClass()
{
System.out.print("hey there!..");
return 22;
}

public static void main(String [] args)
{
MyClass2 mc= new MyClass2();
System.out.print(mc.MyClass());

}

}