class Test{
	public static void main(String[]args){
		Example e1=new Example();
		int q=18;
		System.out.println("b m c q:"+q);
		e1.m1(q);
		System.out.println("a m c q:"+q);
		System.out.println();
		Example e2=new Example();
		System.out.println("b m c e2:"+e2);
		e1.m2(e2);
		System.out.println("a m c e2:"+e2);
		System.out.println();
		System.out.println("b m c e2:"+e2);
		System.out.println("b m c e2:"+e2.x);
		e1.m3(e2);
		System.out.println("a m c e2.x:"+e2.x);
		System.out.println("a m c e2:"+e2);
		System.out.println();
		System.out.println("b m c e2.x:"+e2.x);
		e1.m4 (e2);
		System.out.println("b m c e2.x:"+e2.x);
		System.out.println();
		System.out.println("b m c e2.x:"+e2.x);
		e1.m5(e2);
		System.out.println("a m c e2.x:"+e2.x);
	}
}