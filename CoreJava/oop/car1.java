class car1{
	static int carNo=10;
	static String carName="Thar";
	static double price =200000.00;

	static void Gear(){
		int gear=4;
		 
		System.out.println("Gear :"+gear);
	}
   public static void main(String args[]){
	  // car1.carNo=10;
	   System.out.println("NO:"+carNo);
	   System.out.println("Name:"+carName);
	   System.out.println("price:"+price);
	   Gear();
   }
}

