class Student4{
	public static void main(String[]args){
		Student s1 = new Student();
		int sno = Integer.parseInt(args[0]);
        s1.sname = args[1];
		s1.course = args[2];
		Double.fee = Double.parseDouble(args[3]);
		String.email = args[4];
		Long mobile = Long.parseLong(args[5]);
		//char gender = args[6] charAt[7];
		Boolean status = Boolean.parseBoolean(args[8]);

		System.out.println("sno: "+sno);
		System.out.println("sname: "+sname);
		System.out.println("fee: " +fee);
		System.out.println("email: "+email);
		System.out.println("mobile: "+mobile);
		System.out.println("gender: "+gender);
		System.out.println("status: "+status);

	}
}