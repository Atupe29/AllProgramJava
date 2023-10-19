//Sim.java
interface Sim{
	public abstract void call();
	public abstract void sms();
}

//Airtel.java

class Airtel implements Sim{
	public void  call(){
		System.out.println("Calling from Airtel");
	}
	public void sms(){
		System.out.println("Sending message from Airtel");
	}
} 

class Mobile{
	void insertSim(Sim sim){
		sim.call();
		sim.sms();
	}
}

class Customer{
	public static void main(String[]args){
		Mobile iPhone = new Mobile();
		iPhone.insertSim(new Airtel());
	}
}