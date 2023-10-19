import java.util.Scanner;
import java.util.InputMismatchException;

class VoterRegOffice{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		while(true){
			Voter v = new Voter();
			try{
				System.out.print("\nEnter Your Name::");
				v.setName(scn.nextLine());

				System.out.print("Enter Your Age::");
				v.setAge(scn.nextInt());

				System.out.println("Hi " + v.getName() + "\nYour Details Are Saved:");
				System.out.println("Please Collect Your Voter Card:");
				System.out.println("From Your Nearest EMAHA SEVA Kendre After 30  Days:");
				
			}catch (InputMismatchException e){
				System.out.println("Please Pass Only Integer:");

			}catch(AgeLimitException e){
				System.out.println(e.getMessage());
			}
			scn.nextLine();
		}//while close
	}// MM close
}// class close