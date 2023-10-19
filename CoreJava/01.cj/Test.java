 
 interface Area{
	 public abstract void findArea();

 }
 class Rectangle implements Area{
	 double l =10;
	 double b =5.6;
	 public void findArea(){
		 double res = l*b;
     System.out.println("Area of Rectangle:"+res);
	 }
 }
 class Square implements Area{
	double s=100;
	public void findArea()
	 {
		double res =s*s;
		System.out.println("area of square:"+res);

	 }
 }
 class Test{
	 public static void main(String[]args){
		 Rectangle r = new Rectangle();
		 r.findArea();
		 Square s= new Square();
		 s.findArea();
	 }
 }
 
