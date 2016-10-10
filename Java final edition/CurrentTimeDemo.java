class CurrentTimeDemo
{
public static void main(String[] args)
{
long totalMilli=System.currentTimeMillis();
long totalSec=totalMilli/1000;
long totalMilliLeft=totalMilli%1000;
long totalHour=totalSec/60;
long totalSecLeft=totalHour%60;
System.out.print("hou="+totalHour+"sec="+totalSecLeft+" milli="+totalMilliLeft+"GMT");


}
}