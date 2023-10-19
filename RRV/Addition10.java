class Addition10{
	public static void main(String[]args){
		int Sum=0;
		for (int i=1;i<args.length;i++){
			
			Sum = Sum+Integer.parseInt(args[i]);
			
				
		}
		System.out.println("Sum is:"+Sum);
	}
}