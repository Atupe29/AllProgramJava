class Substraction{
	public static void main(String[]args){
		if (args.length==0){
			System.out.println("Enter value");
			return;
		}	
		int sub = Integer.parseInt(args[0]);
		for(String value:args){
			sub-=Integer.parseInt(value);
		}
		System.out.println("Substraction is:"+sub);
	}
}