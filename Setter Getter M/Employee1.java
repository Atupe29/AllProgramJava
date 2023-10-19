
class Employee1{
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
	public String setEname(String ename){
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