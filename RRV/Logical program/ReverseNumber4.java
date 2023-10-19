import java.util.Scanner;
class ReverseNumber4{

	static void reverseNumber(int number){
		if (number<10){
			System.out.println(number);
		} 

		else{
			System.out.print(number % 10);
			reverseNumber(number/10);
		}
	} 

	public static void main(String[]args){
		System.out.print("Enter your number you want to reverse ::");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("The reverse number is ::");
		reverseNumber(num);

	}
}