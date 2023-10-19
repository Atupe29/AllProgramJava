import java.io.*;
class Addition{
public static void main(String[]args){
	try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter First Integer Number:");
        String fno = br.readLine();
 
        System.out.print("Enter Second Integer Number:");
        String sno = br.readLine();

        int i = Integer.parseInt(fno);
        int j = Integer.parseInt(sno);
        
        int k = i+j;
        System.out.println("Result:"+k);   
	}catch(NumberFormatException e){
		System.out.println("Please pass only Integer");
    }catch(IOException e){
		e.printStackTrace();
    }
  }
}