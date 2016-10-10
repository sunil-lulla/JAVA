class Cube
{
private Square square=null;
private double cube=0.0d;
Cube(Square square)
{
this.square=square;
}
public void setCube(double num)
{
cube=num*square.square(num);
} 
public void showCube()
{
System.out.println(cube);
}
}