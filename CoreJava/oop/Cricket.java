class Cricket{
	public static void main(String[]args){
		msDhoni ms1=new msDhoni();
		ms1.JerseyNo    =7;
		ms1.Roll        ="Captain";
		ms1.Team        ="India";
		ms1.Price       =250000;
		ms1.Gender      ='M';
		ms1.TotalRun    =67776;
	   	ms1.WicketKeeper=true;

		System.out.println("JerseyNo:"+ms1.JerseyNo);
		System.out.println("Roll:"+ms1.Roll);
		System.out.println("Team:"+ms1.Team);
		System.out.println("Price:"+ms1.Price);
		System.out.println("Gender:"+ms1.Gender);
		System.out.println("TotalRun:"+ms1.TotalRun);
		System.out.println("WicketKeeper:"+ms1.WicketKeeper);
	}
}

