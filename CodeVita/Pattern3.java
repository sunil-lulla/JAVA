
public class Pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5-i;j++)
			System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print(j+" ");
				System.out.print("\n");
		}
		
	}

}
