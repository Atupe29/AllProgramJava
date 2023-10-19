class Test01{
   public static void main(String[]args){
	  Student s1 = new Student(1,"Rushi",12);
      Student s2 = new Student(2,"Rahul",12);
      Student s3 = new Student(1,"Rushi",12);
      Student s4 = s2;
      
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
      System.out.println();
      
      System.out.println(s1==s3);
      System.out.println(s1.equals(s3));
      
      System.out.println(s2==s4);
      System.out.println(s2.equals(s4));

      Address add = new Address();

      //System.out.println(s1==add);
      System.out.println(s1.equals(add));
      //System.out.println(add.equals(s1));

      System.out.println(null==null);
      //System.out.println(null.equals(null));
      
      Address a1 = null;  
      Address a2 = null;
    
      System.out.println(a1==a2);
     // System.out.println(a1.equals(a2));

      Address a3 = new Address();
      System.out.println(a3==a2);
      System.out.println(a3.equals(a2));
     
      System.out.println(s2.equals(a2));

   }
}