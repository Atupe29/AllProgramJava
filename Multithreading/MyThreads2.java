class MyThread2 extends Thread{
      public void run(){
		for (int i = 0;i<50 ;i++ ){
           System.out.println(getName()+"Run"+i);
		}
      }
    public static void main(String []args){
		MyThread2 mt1 = new MyThread2();
        mt1.start();

        MyThread2  mt2 = new MyThread2();
        mt2.start();
        
        MyThread2 mt3 = new MyThread2();
        mt3.start();

    }

}