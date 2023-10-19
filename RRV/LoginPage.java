import java.io.*;
import java.util.Scanner;
class LoginPage{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("username:");
		String usn = sc.nextLine();

		System.out.println("Password");
		String password = sc.nextLine();
        
		System.out.println("Email");
		String email = sc.nextLine();

		System.out.println("Address");
		String addr = sc.nextLine();
		
		System.out.println("username:"+ usn);
		System.out.println("Password:"+password);
		System.out.println("Email:"+ email);
		System.out.println("Address:"+ addr);		
	}
}

