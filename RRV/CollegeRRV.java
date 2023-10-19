import java.util.Scanner;
class CollegeRRV{
	public static void main(String[]args){
		
		Scanner scn = new Scanner(System.in);
		Student s1  = new Student();

		System.out.println("Enter sno:");
		s1.sno=scn.nextInt();
		scn.nextLine();

		System.out.println("Enter sname:");
		s1.sname=scn.nextLine();

		System.out.println("Enter course:");
		s1.course=scn.nextLine();

		System.out.println("Enter fee:");
		s1.fee=scn.nextDouble();

		System.out.println("Enter E-mail:");
		s1.email=scn.next();

		System.out.println("Enter mono:");
		s1.mono=scn.nextLong();

		System.out.println("Enter studying:");
		s1.Studying=scn.nextBoolean();

		System.out.println("Enter gender:");
		s1.gender=scn.next().charAt(0);
		System.out.println();

		System.out.println("Student no\t:"+s1.sno);
		System.out.println("Student name\t:"+s1.sname);
		System.out.println("Course\t\t:"+s1.course);
		System.out.println("fee\t\t:"+s1.fee);
		System.out.println("email\t\t:"+s1.email);
		System.out.println("Studying\t:"+s1.Studying);
		System.out.println("Gender\t\t:"+s1.gender);
	}
}
