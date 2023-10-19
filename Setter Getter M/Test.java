class Example{
	int x;
	int y;
	void setX(int x){
		this.x = x;
	}
	void setY(int y){
		this.y = y;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	void display(){
		System.out.println(x);
		System.out.println(y);
    }
}
class Test{
	public static void main(String[]args){
		Example e1 = new Example();
		Example e2 = new Example();

		e1.setX(10);
		e1.setY(20);

		e2.setX(30);
		e2.setY(40);

		System.out.println(e1.getX()+"--"+e1.getY());
		System.out.println(e2.getX()+"--"+e2.getY());

		e1.setX(15);
		e1.setY(16);

		e2.setX(18);
		e2.setY(19);

		e1.display();
		e2.display();
	}
}