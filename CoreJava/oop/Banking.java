class BankAccount{
	String bankName;
	String branchName;
	String ifsc;
    long accNum;
	String accHName;
	char  gender;
	double balance;
	boolean activistatus;
	}

class Banking{
	public static void main(String[] args){
	    BankAccount ba1= new BankAccount();
		BankAccount ba2= new BankAccount();

            
		    ba1.bankName         ="Bank of maharashtra";
			ba1.branchName       ="Wadod Bazar";
			ba1.ifsc             ="MAHB0000697";
			ba1.accNum           = 68035555555555l;
			ba1.accHName         = "Rushikesh Bedke";
			ba1.balance          =20000;
			ba1.activistatus     =  true;
			ba1.gender           = 'M';


            ba2.bankName         ="Bank Of India";
			ba2.branchName       ="Phulambri";
			ba2.ifsc             ="stoidia058";
			ba2.accNum           = 8575828758l;
			ba2.accHName         = "Rahul Mete";
			ba2.balance          =100000;
			ba2.activistatus     =  true;
			ba2.gender           = 'M';

           
		System.out.println("ba1 instance values");
		System.out.println("bankname\t:"+ba1.bankName);
		System.out.println("branchname\t:"+ba1.branchName);
		System.out.println("ifsc\t\t:"+ba1.ifsc);
		System.out.println("accountno\t:"+ba1.accNum);
		System.out.println("accounthname\t:"+ba1.accHName);
		System.out.println("balance\t\t:"+ba1.balance);
        System.out.println("activistatus\t:"+ba1.activistatus);

	    System.out.println("==========____\2\1\1\1\1\1===========______");
       
	    
		
        System.out.println("\nba2 instance values");
		System.out.println("bankname\t:"+ba2.bankName);
		System.out.println("branchname\t:"+ba2.branchName);
		System.out.println("ifsc\t\t:"+ba2.ifsc);
		System.out.println("accountno\t:"+ba2.accNum);
		System.out.println("accounthname\t:"+ba2.accHName);
		System.out.println("balance\t\t:"+ba2.balance);
		System.out.println("activistatus\t:"+ba2.activistatus);
	}
}
