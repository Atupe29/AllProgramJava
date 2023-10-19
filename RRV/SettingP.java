class SettingP{
	public static void main(String[]args){
		System.setProperty("email","rushibedke4793@gmail.com");
		System.setProperty("mobile","9422224294");
		//System.setProperty("rollNo","32");
		//System.setProperty("fee"," ");
		
		System.out.println("name\t:"+System.getProperty("sname"));
		System.out.println("no\t:"+System.getProperty("sno"));
		System.out.println("rollNo\t:"+System.getProperty("rollNo"));
		System.out.println("fee\t:"+System.getProperty("fee"));

		System.out.println("email\t:"+System.getProperty("email"));
		System.out.println("mobile\t:"+System.getProperty("mobile"));
		//System.out.println("rollNo\t:"+System.getProperty("rollNo"));
        System.out.println("course\t:"+ args[0]);
		//System.out.println("fee\t:"+System.getProperty("fee"));


	}
}