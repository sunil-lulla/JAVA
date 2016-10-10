class Square
{
private double square=0.0d; 
private Origin one=null;
Square(Origin one)
{
this.one=one;
}
public double square(double square)
{
this.square=square*one.get(square);
return this.square;
}
}