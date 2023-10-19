class Farming{
	int fno;
	String fname;
	String fdept;
	double fprice;
}
class Gavali{
	public static void main(String[] args){
	Farming f1=new Farming();
	Farming f2=new Farming();
	       

		  f1.fno=13;
		  f1.fname="GAVALI";
		  f1.fdept="TARBUJ";
		  f1.fprice=10;


		  f2.fno=19;
		  f2.fname="MOTHAMALA";
		  f2.fdept="ADRAK";
		  f2.fprice=20;


		  System.out.println("FARM DETAIL");
		  System.out.println("f1.fno  \t=" +f1.fno);
		  System.out.println("f1.fname\t="+f1.fname);
		  System.out.println("f1.fdept\t="+f1.fdept);
		  System.out.println("f1.fprice\t="+f1.fprice);

          System.out.println("\nFARM DETAIL");
		  System.out.println("f2.fno	\t="+f2.fno);
		  System.out.println("f2.fname\t="+f2.fname);
		  System.out.println("f2.fdept\t="+f2.fdept);
		  System.out.println("f2.fprice\t="+f2.fprice);
	}
}







