public class Employee{
	public static void main(String[]args){
    String name;
    String id;
    double salary;
    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public Double getSalary(){
        return salary;
    }
}
}
