class Example{
	int x;
	void m1 (int p){
		x = p;
	}
	void m2(int x){
		x = x;
	}
	void m3(int x){
		this.x = x;
	}

	public static void main(String[]args){
		Example e1 = new Example();
		System.out.println(e1.x);

		e1.m1(50);
		System.out.println(e1.x);

		e1.m2(60);
		System.out.println(e1.x);

		e1.m3(70);
		System.out.println(e1.x);
	}
}