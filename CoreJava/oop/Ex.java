class VarExample{
	String text;
	int wholeNumber=123;
	double floatingPoint=3.141592;
	boolean permission;
}
 class Ex
 {
	 public static void main(String[]args){
           
			   VarExample e1 = new VarExample();

			  e1.text= "Contain Test";
			  e1.wholeNumber=123;
			  e1.floatingPoint=5678;
			  e1.permission = true;
			  System.out.println("CONTAINS TEXT\t::"+e1.text);
			  System.out.println("WHOLENUMBER \t::"+e1.wholeNumber);
			  System.out.println("FLOATINGPOINT\t::"+e1.floatingPoint);
			  System.out.println("PERMISSION\t::"+e1.permission);
}
 }