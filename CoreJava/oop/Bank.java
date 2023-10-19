class BankAccount{
	String bankName;
	String branchName;
	String ifsc;
    double accNum;
	String accHName;
	double balance;
}
class bank{
	public static void main(String[] args){
	    Bank Account ba1=new Bank Account();
		Bank Account ba2=new Bank Account();

            
		    ba1.baBank name        ="Bank of maharashtra";
			ba1.baBranch name      ="Wadod Bazar";
			ba1.baifsc             ="MAHB0000697";
			ba1.baAccountNumber    ="68030790202";
			ba1.baAccountHolderName="Rushikesh Bedke";
			ba1.baBalance          =2000;

            ba2.baBankName         ="Bank of maharashtra";
			ba2.baBranchName       ="Wadod Bazar";
			ba2.baifsc             ="MAHB00009767";
			ba2.baAccountNumber    ="72587598976";
			ba2.baAccountHolderName="Rahul Mete";
			ba2.baBalance          =4000;
	
		System.out.println("ba1 instance values");
		System.out.println("ba1.bankname\t:"+ba1.bankname);
		System.out.println("ba1.branchname\t:"+ba1.branchname);
		System.out.println("ba1.ifsc\t\t:"+ba1.ifsc);
		System.out.println("ba1.accountnumber\t\t:"+ba1.accountnumber);
		System.out.println("ba1.accountholdername\t:"+ba1.accountholdername);
		System.out.println("ba1.balance\t\t:"+ba1.balance);
		System.out.println();
        System.out.println("ba1 instance values");
		System.out.println("ba1.bankname\t:"+ba1.bankname);
		System.out.println("ba1.branchname\t:"+ba1.branchname);
		System.out.println("ba1.ifsc\t\t:"+ba1.ifsc);
		System.out.println("ba1.accountnumber\t\t:"+ba1.accountnumber);
		System.out.println("ba1.accountholdername\t:"+ba1.accountholdername);
		System.out.println("ba1.balance\t\t:"+ba1.balance);

	}
}
