class Example{
	void m1(Example e){
	}
	void m2 (Sample s){
		
	}
}
class Sample{
	void m3(Example e){
	}
}

class Test{
	public static void main(String[]args){
		Example e1 = new Example();

		Example e2 = new Example();

		Sample s1 = new Sample();

		e1.m1(e2);
		e1.m2(s1);
		s1.m1(e1);
		s1.m3(e1);

	}

}
