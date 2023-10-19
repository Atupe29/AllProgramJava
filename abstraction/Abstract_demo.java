 abstract class a 
{
int i;
abstract static void display();
}
class B extends A{
int j;
void display(){
	System.out.println(j);
}
}
class Abstract_demo{


	public static void main(String[] args) 
	{
B obj = new B();
obj.j=2;
obj.display();
}
	}

