import java.io.File;

public class FileHandlingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		File file= new File("C:\\Users\\Sam\\Desktop\\");
		
		File[] a=file.listFiles();
		for(File k:a)
		{
			System.out.println(k);
		}
		System.out.print(a.length);
		
	}

}
