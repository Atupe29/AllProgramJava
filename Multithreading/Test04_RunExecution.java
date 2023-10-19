class MyRunnable implements Runnable {
    public void run(){
	System.out.println("From MyRunnable.run()");
    }
}

class MyThread extends Thread{
   
   MyThread(){
	super();
   }
  
  MyThread(Runnable target){
	super(target);
  }

@Override 
public void run(){
	System.out.println("From MyThread.run()");
    super.run();
  }
}

class Test04_RunExecution{
    public static void main(String[]args){
		
    Thread th1 = new Thread();
    th1.start();

    MyThread mt = new MyThread();
    mt.start();

    MyRunnable mr = new MyRunnable();
    mt.start();

    Thread th2 = new Thread(mr);
    th2.start();

    MyThread mt2 = new MyThread();
    Thread th3 = new Thread(mt);
    th3.start();
 
   Thread th4 = new Thread();
   th4.start();

  //

 Thread th5 = new MyRunnable();
  // th5.start();
  
  // Runnable r1 = new MyRunnable();
 //  r1.start();

//   Thread th6 = new Thread(r1);
  // th6.start();

   MyRunnable mr2 = new MyRunnable();
   MyThread mt2 = new MyThread(mr2);
   mt2.start();
   
   MyThread mt3 = new MyThread();
   MyThread mt2 = new MyThread(mt3);
   mt3.start();

   MyThread mt5 = new MyThread(mt5);
   mt5.start();
   }
}
