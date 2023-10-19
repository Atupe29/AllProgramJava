import java.util.Scanner;
public class RNumber{  
public static void main(String[] args){
	Long num = 0L;
	Long reversenum = 0L; 
Scanner scn = new Scanner(System.in);
System.out.println("Enter number");	
 num = scn.nextLong();  
while(num != 0){  
Long remainder = num % 10;  
reversenum = reversenum * 10 + remainder;  
num = num/10;  
}  
System.out.println("The reverse number is: " + reversenum);  
}  
}  