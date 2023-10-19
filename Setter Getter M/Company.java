    class Employee{
	private int eno;
	private String ename;
	private double sal;
	
	public void setSal(double sal){
		this.sal = sal;
	}

	public double getSal(){
		return sal;
	} 
	public void setEno(int eno){
		this.eno = eno;
	}
	public int getEno(){
		return eno;
	}
	public void setEname(String ename){
		 this.ename = ename;

	}

	public String getEname(){
		return ename;
	}

	public void display(){
		System.out.println("eno: "+eno);
		System.out.println("ename: "+ename);
		System.out.println("sal: "+sal);

	}
} 


class Company{
	public static void main(String[]args){
		Employee e1 = new Employee();
		e1.display();

		e1.setEno(101);
		e1.setEname("Rushi");
		e1.setSal(54000);

		e1.display();

		e1.setSal(e1.getSal()+e1.getSal()*20/100);

		System.out.println(e1.getSal());
	}

}