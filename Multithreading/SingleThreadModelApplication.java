
public class SingleThreadModelApplication {

	public static void main(String[] args) {

		PrintNumbers pn = new PrintNumbers();

		long time1 = System.currentTimeMillis();
		
		pn.Printprint1To50();

		System.out.println();
		
		pn.Print50To1();
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("Time taken to complete both tasks:"+((time2-time1)/1000)+"secs");
	}

}
