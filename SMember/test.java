class Ex{
	int x = 10;
	void m1(){
		x = 5;
	}
	void m2(){
		Ex e1 = new Ex();
		e1.x  = 7;
	}
	void m3(){
		x = 12;
		Ex e1 = new Ex();
		e1.x = 14;
	}
	void m4(){
		x = 16;
		Ex e1 = this;
		e1.x = 18;
	}
	void m5(){
		//e1.x =21;
	}
	void m6(){
		int x;
		x = 22;
	}
	void m7(){
	    int x;
		this.x = 23;
	}
}
	
class Test{
	public static void main(String[]args){
		Ex e1 = new Ex();
		System.out.println(e1.x);

		e1.m1();
		System.out.println(e1.x);

		e1.m2();
		System.out.println(e1.x);

		e1.m3();
		System.out.println(e1.x);

		e1.m4();
		System.out.println(e1.x);

		e1.m5();
		System.out.println(e1.x);

		e1.m6();
		System.out.println(e1.x);

		e1.m7();
		System.out.println(e1.x);
	}
}
