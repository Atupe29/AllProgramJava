import java.util.Scanner;
class PrimeCheck{
	public static void main(String[]args){
		
		boolean isPrime = true;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scn.nextInt();
		for(int i = 2;i<=n;i++){
			if (n%i==0){
				isPrime = false;
				break;
				
		    }
			if (isPrime){
				System.out.println(n+"\n is a prime number");
				break;
			} else 
				System.out.println(n+"\n is not a prime number");
			    break;
		}
	}
}