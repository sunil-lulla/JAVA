
import java.util.ArrayList;
import java.util.Scanner;

public class Online 
{

	int arr[][];
	
	public void makeConnection(int i,int j)
	{
		arr[i][j]=1;
		arr[j][i]=1;
		
		for(int x=0;x<arr[i].length;x++)
		{
			int p=arr[i][x];
			if(p==1)
			{
				arr[x][j]=1;
				arr[j][x]=1;
			}
		
		}
		
		for(int x=0;x<arr[j].length;x++)
		{
			int p=arr[j][x];
			if(p==1)
			{
				arr[x][j]=1;
				arr[j][x]=1;
			}
		
		}
	}
	
	public String checkConnection(int i,int j)
	{
		if(arr[i][j]!=0 || arr[i][j]!=0)
			return "yes";
		return "no";
	}
	
	public static void main(String[] args) 
	{
		try{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter total people in network :");
		int people=kb.nextInt();
		Online obj=new Online();
		obj.arr=new int[people][people];
		System.out.println("enter queries ");
		String str="";
		//String ans="";
		String ch="";
		while(!str.equals("-1"))
		{
			str=kb.next();
			ch=str.substring(0, 1);
			if(ch.equalsIgnoreCase("C"))
			{
				int i=Integer.parseInt(str.substring(1, 2))-1;
				int j=Integer.parseInt(str.substring(2, 3))-1;
				obj.makeConnection(i,j);
			}
			if(ch.equalsIgnoreCase("Q"))
			{
				int i=Integer.parseInt(str.substring(1, 2))-1;
				int j=Integer.parseInt(str.substring(2, 3))-1;
				System.out.println(obj.checkConnection(i,j));
			}
			
		}
		}catch(Exception ex)
		{
		}

	}

}
