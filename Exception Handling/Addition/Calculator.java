import java.util.Scanner;
import java.util.InputMismatchException;

class Calculator{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);

		while(true){
			try{
				System.out.print("\nEnter First No:");
				int a = scn.nextInt();

				System.out.print("\nEnter Second No:");
				int b = scn.nextInt();

				int c = Addition.add(a,b);
				System.out.println("Result:"+c);

			}catch(NegativeNumberException e){
				System.out.println(e.getMessage());
			}
		}// while close
		
	}//MM close

}//class close