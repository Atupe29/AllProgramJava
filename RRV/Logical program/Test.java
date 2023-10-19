class MyThread extends Thread{
public void run(){
	for (int i = 20;i>1 ;i-- ){
         System.out.println("run :"+ i);
	 }
   }
}

public class Test {
public static void main(String[]args){
	MyThread mt = new MyThread();
mt.start();
for (int i = 1;i<20 ;i++ ){
System.out.println("main :"+i);
}
}
}