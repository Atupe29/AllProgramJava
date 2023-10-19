class ExampleMM{
	static int a = 10;
	static{
		System.out.println("From SB");
		System.out.println("a:" + a);
		//System.out.println("b:" + b);
		System.out.println("b:" + Example.b);
	}
	public static void main(String[]args){
		System.out.println("\n from MM");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	static int b = 20;
}