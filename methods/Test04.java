interface Shape{
	abstract void FindArea();
}
class Rectangle implements Shape{
	public void FindArea(){
	System.out.println(l*b);
	}
	double l,b;
}
class Test04{
	public static void main(String[]args){
		Shape S=new Rectangle();
		S.FindArea();
	}
}