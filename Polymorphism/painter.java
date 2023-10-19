class Shape{
	void findArea(){
	}
}

class Rectangle extends Shape{
	private static double l;
	private static double b;

	public Rectangle(double l, double b){
		this.l = l;
		this.b = b;
	}
	void findArea(){
		double area = l*b;
		System.out.println("Rectangle area:" + area);
	}
}

class Square extends Shape{
	private double s;
	public Square (double s){
	this.s = s;
}
   void findArea(){
	double area = s*s;
	System.out.println("Square area:" + area);
    }
}

class Circle extends Shape{
    final double PI = 3.14;
	private double r;

	public Circle (double r){
		this. r=r;	
	}
	void findArea(){
	    double area = PI*r*r;
		System.out.println("Circle area:" + area);
	}
}

class painter{
	public static void main(String[]args){
		Shape shape;

		shape = new Rectangle(75,48);
		shape.findArea();

		shape = new Square(1098);
		shape.findArea();

		shape = new Circle(56);
		shape.findArea();

	}
}