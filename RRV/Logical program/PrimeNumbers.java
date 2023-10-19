import java.util.Scanner;
class PrimeNumbers{
   public static void main (String[] args){
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter your no:");
	   int num = scn.nextInt();
	   boolean flag = false; 
       int i;
       for (i = 2; i <= num/2; i++){        
             if(i%num==0){
                 flag = true;
				 break;
             }if (!flag) {
             
	              System.out.println(num+"\nit is a prime number");
                   break; 
	              } else{
					  System.out.println(num+"\nit is not prime number");
					  break;
				  }
       }  
    }
}
  
       
   
