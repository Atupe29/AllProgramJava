class Example1{
	public static void main(String[]args){
		try{
			System.out.println("in try");
		}
		catch(ArithmeticException ae){
			System.out.println("In each");
		}
		finally{
			System.out.println("In finally");
		}
		System.out.println("After try/catch/finally");
	}
}