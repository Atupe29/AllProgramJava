class Company{
	public static void main(String[] args) throws IOException{
		Employee e1 = new Employee();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);
		Console cns = System.console();

		System.out.print("Plz Enter Username: ");
		String usn = cns.readLine();
		System.out.print("Plz Enter Password: ");
		char[] pwd = cns.readPassword();

		System.out.println("YOU LOGIN SUCCESSFUL::");

		int eno = Integer.parseInt(args[0]);
		String ename = args[1];

		System.out.print("Plz Enter Your Department No: ");
		String dept = br.readLine();
		System.out.print("Enter Your salary: ");
		double salary = Double.parseDouble(br.readLine()); 

		System.out.print("Enter Your Mobile No: ");
		long mobile = scn.nextLong();
		              scn.nextLine();
	    System.out.print("Enter Your Email: ");
		String email = scn.nextLine();

		String gender = System.getProperty("gender");
		String status = System.getProperty("status");
		boolean work  = Boolean.parseBoolean(status);
		System.out.println("Enter gender: " +gender);
		//System.out.println("Enter Working Status: " +work);
		System.out.println();

		System.out.println("employee no\t\t: " +eno);
		System.out.println("employee name\t\t: " +ename);
		System.out.println("department name\t\t: " +dept);

	}
}