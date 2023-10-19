class MuiltipleThreadWithSameLogic{
    public static void main(String[]args){

		MyThread3 mt1 = new MyThread3();
        mt1.start();

        MyThread3 mt2 = new MyThread3(10);
        mt2.start();

        MyThread3 mt3 = new MyThread3(20);
        mt3.start();

        for (int i = 0;i<20 ;i++ ){
             System.out.println("main:"+i);
        }
    }
}