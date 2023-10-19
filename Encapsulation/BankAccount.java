class BankAccount{
	private double balance;
	public void setBalance (double balance)throws IllegalArgumentException{
		if(balance==0){
			throw new IllegalArgumentException("DoNot Pass -ve amount");
		}
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
}