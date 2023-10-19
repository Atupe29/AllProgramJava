class MyThread3 extends Thread{
     int x;
     MyThread3(){
		 x=5;
     }
     MyThread3(int x){
		this.x=x;
     }
     public void run(){
		for (int i=0;i< this.x ;i++ ){
             
            System.out.println(getName()+"Run: "+i);
		}
     }
}