import java.util.ArrayList;
import java.util.Scanner;
class Contacts
{
private ArrayList<String> name=new ArrayList<>();
private ArrayList<Long> phoneNumber=new ArrayList<>();

public void setData(String name,long phoneNumber)
{
this.name.add(name);
this.phoneNumber.add(phoneNumber);
}


public boolean delete(long phoneNumber)
{
int pos=this.phoneNumber.indexOf(phoneNumber);
if(pos!=-1)
{
this.name.remove(pos);
this.phoneNumber.remove(pos);
return true;
}
return false;
}

public void deleteAll()
{
this.name.clear();
this.phoneNumber.clear();
System.out.println("Deleted Successfully..");
}


public boolean delete(String name)
{
int pos=this.name.indexOf(name);
if(pos!=-1)
{
this.name.remove(pos);
this.phoneNumber.remove(pos);
return true;
}
return false;
}


public boolean delete(int pos)
{
if(pos<0||pos>this.name.size())
return false;
this.name.remove(pos);
this.phoneNumber.remove(pos);
return true;



}










public boolean updatePhoneNumber(long phoneNumber,String name)
{
int pos=this.name.indexOf(name);
if(pos!=-1)
{
this.phoneNumber.set(pos,phoneNumber);
return true;
}
return false;
}


public void display()
{
for(int i=0;i<name.size();i++)
System.out.println(this.name.get(i)+"\t"+this.phoneNumber.get(i));
}










public boolean updateName(long phoneNumber,String name)
{
int pos=this.phoneNumber.indexOf(phoneNumber);
if(pos!=-1)
{
this.name.set(pos,name);
return true;
}
return false;
}





public long getPhoneNumber(String name)
{
int pos=this.name.indexOf(name);
if(pos!=-1)
return phoneNumber.get(pos);
return -1;
}


public String getName(long phoneNumber)
{
int pos=this.phoneNumber.indexOf(phoneNumber);
if(pos!=-1)
return name.get(pos);
return null;
}


}
