class AdditionParse{
	public static void main(String[]args){
		if(args.length==0){
			System.out.println("Enter your number");
			return;
		}
		int sum=Integer.parseInt(args[0]);
		for (String value:args){
			sum=Integer.parseInt(value);
		}
		System.out.println("Addition is:"+sum);
	}
}