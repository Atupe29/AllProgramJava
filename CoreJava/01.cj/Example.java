class  Test{ 

	void m1(){
		System.out.println("m1 method execute");
	}
	void m2(){
		System.out.println("m2 method execute");
	}
	
	static void m3(){
		System.out.println("m3 method execute");
	}
	static void m3(String s){
		System.out.println(" m4 int param method execute");
		}

                    
}

class Example{
	public static void main(String args[]){
		Test t1=new Test();
		t1.m1();
		t1.m2();
		t1.m3();
		Test.m3("rushi");
	}
		
}  