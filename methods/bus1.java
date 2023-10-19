class Bus{
	void breaks(){
		System.out.println("Bus is stopping");
	}
public static void main(String[]args){
	Redbus Rb = new Redbus();
	Rb.breaks();

	Volvobus Vb = new Volvobus();
	Vb.breaks();

	Volvoplus Vp = new Volvoplus();
	Vp.breaks();
}

class Redbus implements Bus{
	 public void breaks(){
		System.out.println("Red bus is stop");
	}

}
class Volvobus implements Bus{
	 public void breaks(){
		System.out.println("Volvobus is running");
	}
}
class Volvoplus implements Bus{
	 public void breaks(){
		System.out.println("Volvoplus is running so fast");
	}
  }
}
