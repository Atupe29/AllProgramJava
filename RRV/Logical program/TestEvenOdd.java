class TestEvenOdd{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = scn.nextInt();

		boolean Even = EvenOdd.isEven(num);
		if(Even==true){
			
			System.out.println(num + "is Even");
		}else{
			System.out.println(num + "is Odd");
		}		
	}
}