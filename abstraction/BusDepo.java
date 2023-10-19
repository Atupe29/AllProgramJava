class BusDepo{
	public static void main(String[]args){
		Driver hk = new Driver();
		hk.drive(new RedBus());
		System.out.println();
		hk.drive (new Volvo());

	}
}