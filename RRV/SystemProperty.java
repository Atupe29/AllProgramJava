import java.util.Properties;
import java.util.Enumeration;

class SystemProperty{
	public static void main(String[]args){
		String OSName = System.getProperty("os.name");
		System.out.println("os name:"+ OSName);

		if (OSName.toLowerCase().contains("Windows")){
			String path = ".\\abc\\bbc\\xyz.txt";
			System.out.println("Windows os path:"+ path);
		}
		else if (OSName.toLowerCase().contains("linux")){
			String path="./abc/bbc/xyz.txt";
			System.out.println("linux.os path:"+ path);
		}
		
		
	}
}