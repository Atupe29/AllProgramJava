class SettingProperties{
	public static void main(String[]args){

		System.setProperty("email","akshaygondale18@gmail.com");
		System.setProperty("mobile","8329404030");

		System.out.println("S information:");
		System.out.println("sno\t:"+System.getProperty("sno"));
		System.out.println("sname\t:"+System.getProperty("sname"));

		System.out.println("course\t:"+args[0]);
		System.out.println("fee\t:"+args[1]);

		System.out.println("email\t:"+System.getProperty("email"));
		System.out.println("mobile\t:"+System.getProperty("mobile"));
		
	}
}