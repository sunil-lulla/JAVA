/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;


public class GuessDay {
    public static void main(String[] args) {
      
        Scanner sin= new Scanner(System.in);
        PrintStream pw=System.out;
        try{
        
        pw.print("Months: ");    
        int noOfMonth=sin.nextInt();
        pw.print("Days: ");
        sin.nextLine();
        String noOfDays=sin.nextLine();
        String date=sin.next();
        String day=sin.next();     
        StringTokenizer st= new StringTokenizer(noOfDays," ");
        
        if(noOfMonth<st.countTokens()||noOfMonth>st.countTokens())
        {
        System.exit(0);
        }
        
        int days[]=new int[st.countTokens()];
        int i=0;
        int sum=0;
        while(st.hasMoreTokens())
        {
            
            days[i]=Integer.parseInt(st.nextToken());
            sum+=days[i];
            if(days[i]>250)
                break;
            
            i++;
            
        }
       st=new StringTokenizer(date,"-"); 
        int d,m,y;
        if(st.countTokens()>3)
        {
        System.exit(0);
        }
        d=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        y=Integer.parseInt(st.nextToken());
             
        if(noOfMonth>250)
        {
                System.exit(0);
        }
        
        
        
        
        int T=sin.nextInt();
      
        sin.nextLine();
        String providedDate;
        
	for(int j=0;j<T;j++)
        {
	
            providedDate=sin.nextLine();
            st= new StringTokenizer(providedDate,"-");
            
                int d1=Integer.parseInt(st.nextToken());
                int m1=Integer.parseInt(st.nextToken());
                int y1=Integer.parseInt(st.nextToken());
                if(y1-y>5000)     
                   continue;
                int dayTotal; 
                dayTotal=sum*(y1-y);
                 
                              
                               
                
                 
                 if(m-m1!=0)
                 {
                    
                     if(m>m1)
                     {
                     
                     
                     }
                 
                 
                     else  if(m1>m)
                     {
                     
                     for(int k=m-1;k<m1-1;k++)
                     {
                     dayTotal+=days[k];
                     }
                     
                     
                 
                 }
                 
                 if(d>d1)
                 dayTotal+=d-d1;
                 else
                  dayTotal+=d1-d;   
                 
                 
                 
                 
                 
                 int value=dayTotal%7;
                 
                 
                 
                 
                 
                 
                 
        
        
        
        switch(date.toLowerCase())
        {
             case "monday":
                    value+=2;
                    break;
             case "tuesday":
                    value+=3;
                    break;
             case "wednesday":
                    value+=4;
                    break;
             case "thursday":
                    value+=5;
                    break;
             case "friday":
                    value+=6;
                    break;
             case "saturday":
                    value+=7;
                    break;
             case "sunday":
                    value+=1;
                    break;
		        
        

}
        
        
        
                 
		pw.print(dayTotal);                 
                 dayTotal=dayTotal%7;
                 
                 switch(dayTotal)
                 {
                 
                 
                 
                     case 0:
                         pw.println("Monday");
                         break;
                 
                       case 1:
                         pw.println("Tuesday");
                         break;
                           case 2:
                         pw.println("wednesday");
                         break;
                               case 3:
                         pw.println("Thursday");
                         break;
                 
                 case 4:
                         pw.println("Friday");
                         break;
                 
                 
                 case 5:
                         pw.println("Saturday");
                         break;
                 
                 
	 case 6:
                         pw.println("Sunday");
                         break;
        
	default:
		pw.print("no such days");		             
                 }
                 
	                
        
        }
        
  
        
	        
        
        
        
        
        
                       
        }
        }
        
        catch(Exception e)
        {
        pw.print(e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
   
}
