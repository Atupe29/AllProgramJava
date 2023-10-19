import java.io.Console;
class LogIn{
	public static void main(String[]args){
		Console cns = System.console();

		System.out.println("username:");
		String usn = cns.readLine();

        System.out.println("Password:");
		char[] pwd = cns.readPassword();

		System.out.println("you enterred:");
		System.out.println("Username:"+usn);
		System.out.println("Password:"+new String(pwd));

	}
}