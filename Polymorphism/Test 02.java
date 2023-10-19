abstract class Example{
	abstract void m1();
	abstract void m2();
}

abstract class Sample extends Example{
	void m1(){System.out.println("m1 from class Sample");}
}

class Xyz extends Sample{
	void m2(){System.out.println("m2 from class Xyz");}
}

class Pqr extends Sample{
	void m1(){System.out.println("m1 from class Pqr");}
	void m2(){System.out.println("m2 from class Pqr");}
}

class Test 02{
	public static void main(String[]args){
		Example e1;
		e1=new Xyz();
		e1.m1();
		e1.m2();

		System.out.println();
		e1=new Pqr();
		e1.m1();
		e1.m2();
	}
}