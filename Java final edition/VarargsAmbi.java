class VarargsAmbi
{

static void A(int k,int ... a)
{}
static void A(int ...b)
{}
public static void main(String[] args)
{
A(23,2);



}
}