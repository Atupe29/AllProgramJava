 public class car {
	String modelName;
	double price;
	String modelNumber;

	public String modelName(){
	  return  "Thar";
	}
	public double price(){
	 return 110000;
	}
	public String modelNumber(){
	 return "MH20EB4793";
	}
	public static void main(String[]args){
		car c1=new car();
		car c2=new car();

        System.out.println("Name:"+c1.modelName());

	    System.out.println("Name:"+c1.modelName());
		System.out.println("Price:"+c1.price());
		System.out.println("Number:"+c1.modelNumber());
	
		
        System.out.println("\nName:"+c2.modelName());
		System.out.println("Price:"+c2.price());
		System.out.println("Number:"+c2.modelNumber());
	}
 }


	

