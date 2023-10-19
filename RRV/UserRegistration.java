import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class UserRegistration{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("username : ");
		String usn = br.readLine();

		System.out.print("password : ");
		char pwd = (char)br.read();

		System.out.print("Email : ");
		String email = br.readLine();  br.readLine();

        System.out.print("Address : ");
		String addr = br.readLine();

		System.out.println("username : "+usn);
		System.out.println("password : "+pwd);
		System.out.println("Email : "+email);
		System.out.println("Address : "+addr);
	}
}