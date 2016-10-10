import java.util.Scanner;
class UseContacts
{
public static void main(String[] args)
{
String name=null;
long phoneNumber=0;
Scanner sin= new Scanner(System.in);
Contacts ct= new Contacts();
for(;;)
{
System.out.println("Enter name and quit to stop");
name=sin.next();
if(name.equals("quit"))
break;
System.out.println("Enter number");
phoneNumber=sin.nextLong();
ct.setData(name,phoneNumber);
}


int status;
for(;;)
{
System.out.println("---------------------------------------------------------------------------");
System.out.println("1.Add new Data");
System.out.println("2.Search");
System.out.println("3.Update");
System.out.println("4.Delete");
System.out.println("5.Exit");
System.out.println("6.Display");

switch(sin.nextInt())
{

case 1:
	System.out.println("Enter name");
	name=sin.next();
	System.out.println("Enter number");
	phoneNumber=sin.nextLong();
	ct.setData(name,phoneNumber);
	break;


case 2:
	System.out.println("1.On the basis of number");
	System.out.println("2.on the basis of name");
	switch(sin.nextInt())
	{

	case 1:	
		System.out.println("Enter the number");
		phoneNumber=sin.nextLong();
		name=ct.getName(phoneNumber);	
		if(name!=null)
		System.out.println(name);
		else	
		System.out.println("Invalid number");
		break;


	case 2:
		System.out.println("Enter the name");
		name=sin.next();
		phoneNumber=ct.getPhoneNumber(name);	
		if(phoneNumber!=-1)
		System.out.println(phoneNumber);
		else	
		System.out.println("Invalid name");
		break;
	
	default:
		System.out.println("Invalid Choice");

	}
	break;
	
case 3:
	System.out.println("---update----");
	System.out.println("1.On the basis of number");
	System.out.println("2.on the basis of name");
	switch(sin.nextInt())
	{

	case 1:	
		System.out.println("Enter the number whose name u want to change");
		phoneNumber=sin.nextLong();
		System.out.println("Enter the name:");
		name=sin.next();
		if(ct.updateName(phoneNumber,name))
		System.out.println("Name Updated successfully");
		else
		System.out.println("Number not availble");
		break;
		
	case 2:
		System.out.println("Enter the name whose number u want to update");
		name=sin.next();
		System.out.println("Enter the number");
		phoneNumber=sin.nextLong();
		if(ct.updatePhoneNumber(phoneNumber,name))
		System.out.println("Phone number Updated successfully");
		else
		System.out.println("Name not availble");
		break;

	
	default:
		System.out.println("Invalid Choice");

	}

	break;



case 4:
	System.out.println("---Delete----");
	System.out.println("1.On the basis of number");
	System.out.println("2.on the basis of name");
	System.out.println("3.On the basis of Position");
	System.out.println("4.Delete all");
	switch(sin.nextInt())
	{
	case 1:
		System.out.println("Enter the number");
		phoneNumber=sin.nextLong();
		if(ct.delete(phoneNumber))
		System.out.println("Deleted successfully");
		else
		System.out.println("number not avilable");
		break;
		
	case 2:
		System.out.println("Enter the name");
		name=sin.next();
		if(ct.delete(name))
		System.out.println("Deleted successfully");
		else
		System.out.println("name not avilable");
		break;

	case 3:
		System.out.println("Enter the position");
		if(ct.delete(sin.nextInt()))
		System.out.println("Deleted successfully");
		else
		System.out.println("position not avilable");
		break;

	case 4:
		ct.deleteAll();
		break;
	
	default:		
		System.out.println("Invalid choice");
		
		


	}


	















	break;




case 6:
	ct.display();
	break;





	
case 5:
	System.exit(0);








}

}













}
}