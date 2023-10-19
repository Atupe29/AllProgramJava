 interface I1{
	 void m1(int p);
 }

 interface I2{
	 void m1(int p,float f);
 }

 interface I3{
	 int m1(int p);
 }

 class  Test05_01{
     public static void main(String[] args){       
		 I1 i1 = (int p) -> { System.out.println("LE1 p: "+ p); };
                               
       /*  I1 i2 = (byte p) -> { System.out.println("LE1 p: "+ p); };                //CE: incompatible types: incompatible parameter types in lambda expression
         I1 i3 = (long p) -> { System.out.println("LE1 p: "+ p); };                //CE: incompatible types: incompatible parameter types in lambda expression
         I1 i4 = (Integer p) -> { System.out.println("LE1 p: "+ p); };                //CE: incompatible types: incompatible parameter types in lambda expression
         I1 i5 = (int p, int q) -> { System.out.println("LE1 p: "+ p); };        //CE: incompatible types: incompatible parameter types in lambda expression
         I1 i6 = (int p) -> { System.out.println("LE1 p: "+ p); return 5;}; */       //CE: incompatible types: bad return type in lambda expression
                               
         I2 i7 = (int p, float f) -> { System.out.printf("\nLE2 p: %d f: %f", p, f); };
         I2 i8 = (double p, float f) -> { System.out.printf("\nLE2 p: %d f: %f", p, f); };
         I2 i9 = (int p, float f, String s) -> { System.out.printf("\nLE2 p: %d f: %f", p, f); };
         I2 i10 = (float f, int p) -> { System.out.printf("\nLE2 p: %d f: %f", p, f); };

         I3 i12 = (int p) -> { System.out.println("\nLE3 p: " + p); return 'a';};
         I3 i13 = (int p) -> { System.out.println("\nLE3 p: " + p); return 9L;}; 
	     I3 i11 = (int p) -> { System.out.println("\nLE3 p: " + p); return 9;};
                                
         I3 i14 = (int p) -> { System.out.println("\nLE3 p: " + p); };                
         }
  }