import java.io.BufferedReader;
import java.io.InputStreamReader;
public strictfp class CharacterInput
{
public strictfp static void main(String sam\u005b\u005d) throws Exception
{

	InputStreamReader iSR=new InputStreamReader(System.in);
	BufferedReader bR=new BufferedReader(iSR,5);
        char c=(char)bR.read();
	bR.readLine();
	System.err.println(c);

}

}