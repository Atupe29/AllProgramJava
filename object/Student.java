class Student{
	int sno;
	String sname;
	String scourse;
	double sfee;
}
class collage{
	public static void main(String[]args){
		Student S1=new student();
		Student S2=new student();

		s1.sno=101;
		s1.sname="RB";
	    s1.scourse="CJ";
		s1.sfee=2500.0;

		s2.sno=102;
		s2.sname="RM";
		s2.scourse="CJ";
		s2.sfee=3500.0;

		System.out.println("\ns1 object values");
		System.out.println("s1.sno\t:"+s1.sno);
		System.out.println("s1.sname\t:"+s1.sname);
		System.out.println("s1.scourse\t:"+s1.scourse);
		System.out.println("s1.fee\t:"+s1.fee);

		System.out.println("\ns2 object values");
		System.out.println("s2.sno\t:"+s2.sno);
		System.out.println("s2.sname\t:"+s2.sname);
		System.out.println("s2.scourse\t:"+s2.scourse);
		System.out.println("s2.fee\t:"+s2.fee);
	}
}


				