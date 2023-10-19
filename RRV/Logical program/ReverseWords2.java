import java.util.Scanner;
class ReverseWords2{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String");

		String Str = s.nextLine();
		String result = StringWordsReverse.reverseStringWords(Str);

		System.out.println("\noriginal string:" +Str);
		System.out.println("\nreverse string:"  +result);
	}
}