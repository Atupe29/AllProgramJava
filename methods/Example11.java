class Example11{
	public static void main(String[]args){
		int sum=0;
		for (int i=1;i<args.length;i++){
		sum=sum+Integer.parseInt(args[i]);
	}
	System.out.println("sum of all values:"+sum);
	}
}