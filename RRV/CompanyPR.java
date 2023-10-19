import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class CompanyPR{ 
	public static void main(String[]args)throws IOException{
		 Console cns = System.console();
		 System.out.print("Username : ");
		 String usn = cns.readLine();
		 
         System.out.print("Password :");
		 String pwd = new String(cns.readPassword());

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 Scanner scn = new Scanner(System.in);

		 Employee emp = new Employee();
		 
		 emp.eno = Integer.parseInt(args[0]);
		 emp.ename = args[1];

		 System.out.print("Enter sal : ");
		 emp.sal = Double.parseDouble(br.readLine());

		 System.out.print("Enter dept : ");
		 emp.dept = br.readLine();

		 System.out.print("Enter email : ");
		 emp.email = scn.nextLine();

		 emp.gender = System.getProperty("gender").charAt(0);
		 emp.workingStatus = Boolean.parseBoolean(System.getProperty("status"));

		 System.out.println("eno\t: " + emp.eno);
		 System.out.println("enmae\t: " + emp.ename);
		 System.out.println("sal: " + emp.sal);
		 System.out.println("dept: " + emp.dept);
		 System.out.println("mobile: " + emp.mobile);
		 System.out.println("email: " + emp.email);
		 System.out.println("gender: " + emp.gender);
		 System.out.println("workingStatus: " +emp.workingStatus);
	}
}