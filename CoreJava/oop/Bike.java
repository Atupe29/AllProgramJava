class Bike {

	int bno;
	String bname;
	String bmodel;
	double bprice;
}
class company{
	public static void main(String[] args){
		Bike b1=new Bike();
		Bike b2=new Bike();
		    
			b1.bno=4793;
			b1.bname="HF DELUXE";
			b1.bmodel="HERO";
			b1.bprice=55000.0;

			b2.bno=407;
			b2.bname="HONDA";
			b2.bmodel="SHINE";
			b2.bprice=700000.0;

		System.out.println("object values");
		System.out.println("b1.bno\t:"+b1.bno);
		System.out.println("b1.bname\t:"+b1.bname);
		System.out.println("b1.bmodel\t:"+b1.bmodel);
		System.out.println("b1.bprice\t:"+b1.bprice);
		

	    System.out.println("object values");
		System.out.println("b2.bno\t:"+b2.bno);
		System.out.println("b2.bname\t:"+b2.bname);
		System.out.println("b2.bmodel\t:"+b2.bmodel);
		System.out.println("b2.bprice\t:"+b2.bprice);
	}	
}
