import java.util.Scanner;

public class ATM{
	public static void main(String[]args){
		int balance = 10000, deposite,withdraw;

		Scanner scn = new Scanner(System.in);

		while(true){
			System.out.println("welcome to Rushi's ATM\n");
			System.out.println("Choose your Activity:");
			System.out.println("Press 1 for Withdraw:");
			System.out.println("press 2 for Deposite:");
			System.out.println("Press 3 for check balance:");
			System.out.println("Press 4 for exit:");
	
			int choice = scn.nextInt();
			switch(choice){
				case 1:
                    System.out.println("Please enter amount in 100 multiple");

					System.out.println("Enter money for withdraw");

            withdraw = scn.nextInt();
			if (withdraw%100==0){
				balance = balance-withdraw;
				 
				System.out.println("Please collect your amount:");
			}

			else {
				System.out.println("Enter 100 multiple amount:");

			}
			System.out.println("");
			break;

			case 2:

			System.out.println("Enter your Amount to Deposited:");

			deposite = scn.nextInt();

			balance = balance + deposite;
			System.out.println("Your money successfully added to your account:");
			System.out.println("");
			break;

			case 3:

			System.out.println("Balance:"+balance);
			System.out.println("");
			break;
            
			case 4:
			System.exit(0);

			}

		}
	}
}