
class Student{
	int sno;
	String sname;
	String course;
	double fee;
}
//import java.util.Scanner; 
class collage{
	public static void main(String[]args){
		java.util.Scanner scn=new java.util.Scanner(System.in);
		Student s1 =new Student(); 

		System.out.println("Enter no:");
		s1.sno = scn.nextInt();

		System.out.println("Entre name:");
		scn.nextLine();
		s1.sname = scn.nextLine();

		System.out.println("Entre course:");
		s1.course = scn.nextLine();

		System.out.println("Enter fee:");
		s1.fee = scn.nextDouble();
	}
}