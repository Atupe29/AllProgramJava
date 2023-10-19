import java.util.Scanner;
class Addition00{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your first value");
		int a = scn.nextInt();
		System.out.println("Enter your second value");
		int b = scn.nextInt();
		
		int c = a+b;
		System.out.println("Result:"+c);
	}
}