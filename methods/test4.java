class test4{
	public static void main(String[]args){
		Example.m1(new D());
		Example.m1(new E());
		Example.m1(null);

		Example e1=new Example();

		e1.m2(new A());
		e1.m2(new B());
		e1.m2(new C());
		e1.m2(null);

		e1.m3(new B());
		String name=e1.m3(new c());
		System.out.println(e1.m3(null));
	}
}