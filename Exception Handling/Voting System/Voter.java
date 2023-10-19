public class Voter{
	private int age;
	private String name;

	public void setAge(int age)
		             throws AgeLimitException{

	   if(age <18 || age>120)
		 throw new AgeLimitException("you are not eligible for voting");
			this.age = age;
		   }

		   public int getAge(){
			return this.age;
		   }

		   public void setName(String name){
			this.name = name;
		   }

		   public String getName(){
			return this.name;
		   }
   }