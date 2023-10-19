import java.util.Scanner;
class Bank{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		while(true){
			try{
				System.out.print("\n Enter Balance:");
				double balance = scn.nextDouble();scn.nextLine();
				ba.setBalance(balance);
				System.out.println("current balance:"+ba.getBalance());
				break;
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
		    }
		}
	}
}