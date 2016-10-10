import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class TCSCompilerDesign {
	

	public void compilationErrors()
	{
		
		System.err.print("Compilation Errors");
		Runtime.getRuntime().exit(1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCSCompilerDesign tcsCompilerDesign = new TCSCompilerDesign();
		PrintStream so= System.out;
		PrintStream se= System.err;
		short T=0;
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		try {
			 T=Short.parseShort(bufferedReader.readLine());
			if(T<1||T>100)
				throw new NumberFormatException();
		} 
		
		catch (NumberFormatException | IOException e) {
			
		System.exit(0);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.exit(1);
			
		}
		String L;
		mainfor:
		for(int i=0;i<T;i++)
		{
			
			L=null;
			try {
				L=bufferedReader.readLine().replaceAll("\\s+", "");
				if(L.length()>10000||L.length()<1)
				{
					se.print("Compilation Error");
					continue mainfor;
				}
			} catch (IOException e) {
				se.print("Compilation Errors");
				continue mainfor;
			}
			
			char Larray[]=L.toCharArray();
			
			if(Larray[0]!='{')
			{
				se.print("Compilation Error");
				continue mainfor;
			}
					
			if(Larray[Larray.length-1]!='}')
			{
				se.print("Compilation Error");
				continue mainfor;
			}
				int opc=0,clc=0,opb=0,clb=0,opa=0,cla=0,p=0;
			for(int k=0;k<Larray.length;k++)
			{
				if(Larray[k]=='<')
					opc=k;
				if(Larray[k]=='>')
					clc=k;
			}
			if(clc==0||opc==0||clc<opc)
			{
				se.print("Compilation Error");
				continue mainfor;
			}
			
			clc=0;opc=0;opb=0;clb=0;
			for(int l=0;l<Larray.length;l++)
			{
				switch(Larray[l])
				{
				case '{':
				{
					opc++;
					if(l!=0)
					{
						if(Larray[l-1]=='>'||Larray[l-1]==')')
						{
							
								se.print("Compilation Error");
								continue mainfor;
						}
						
					}
					
					break;
				}
				case '}':
				{	clc++;
					break;
				}	
				case '<':
				{	opa++;
					if(opa>1)
					{
						se.print("Compilation Error");
						continue mainfor;
					}
					break;
				}
				case '>':
				{	cla++;
					if(cla>1){
						se.print("Compilation Error");
						continue mainfor;
					}
					break;
				}
				case '(':
				{	opb++;
					break;
				}
				case ')':
				{	clb++;
					break;
				}
				case 'P':
				{	++p;
					int temp=l-1;
					int temp2=l+1;
					if(temp==0)
					{
						se.print("Compilation Error");
						continue mainfor;
					}
					if(Larray[temp2]=='(')
					{
						se.print("Compilation Error");
						continue mainfor;
					}
					if(temp2==Larray.length-1)
					{
						se.print("Compilation Error");
						continue mainfor;
					}
					if(p>100)
					{
						se.print("Compilation Error");
						continue mainfor;
					}
					break;
				}
				}
				
			}
			if(opc!=clc||opb!=clb||opa!=cla)
			{
			
				se.print("Compilation Error");
				continue mainfor;
			}
			
			System.out.print("No Compilation Error");
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}

}
