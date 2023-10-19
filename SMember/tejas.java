class tejas{
	static int a = 10;
	static{
		System.out.println("From SB");
		System.out.println("a:"+a);
		System.out.println("b:"+tejas.a);
		b = 50;
	}
	public static void main(String[]args){
		System.out.println("\n From MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	static int b = 20;
}