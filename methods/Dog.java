3
.
class Dog extends Animal{
	void voice(){}
	public static void main(String[]args){
		System.out.println("Dog is Barking");
		Dog D=new Dog();
		Animal A=new Animal();	
		D.voice();
		A.voice();
	}
}
