import java.util.Scanner;
class StringWordsReverse{
	public static String reverseStringWords(String s){ 

		String[] StringWords = s.split("");
		int      noOfWords   = StringWords.length;

		StringBuilder resultBuffer = new StringBuilder();

		for ( int i=noOfWords-1; i>=0 ; i-- ){
			resultBuffer.append(StringWords[i]);
			resultBuffer.append("");

		}

		return resultBuffer.toString().trim();

	}

	public static void main(String[]args){
		Scanner s= new Scanner(System.in);
		System.out.print(reverseStringWords("\ni am rushi"));

	}
}