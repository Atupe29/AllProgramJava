class Employee{
     int eno;
	 String ename;
	 String edept;
	 double sal;
}
class company{
	public static void main(String[] args){
		Employee s1=new employee();
		Employee s2=new employee();

		HK.eno=101;
		HK.ename="Rushi";
		HK.edept="programmer";
		HK.esal=50000.0;

		BK.eno=102;
		BK.ename="Rahul";
		BK.edept="manager";
		BK.esal=60000.0;

		System.out.println("In Displaying HK Employee Detail");
		System.out.println("Hk.eno\t:"+ hk.eno);
		System.out.println("HK.ename\t:"+ hk.ename);
		System.out.println("HK.edept\t:"+ hk.edept);
		System.out.println("HK.esal:"+ hk.esal);

		System.out.println("In Displaying BK Employee Detail");
		System.out.println("BK.eno\t:"+ bk.eno);
		System.out.println("BK.ename\t:"+ bk.ename);
		System.out.println("BK.edept\t:"+ bk.edept);
		System.out.println("BK.esal:"+ bk.esal);

	}
}
