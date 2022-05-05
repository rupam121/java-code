//multi threading
//DaemonThread
//Provide services to user thread
class deamontest2 extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			
			System.out.println("Deamon is working");
		}
		else{
			System.out.println("user thread work ");
		}
	}
	public static void main(String[] args) 
	{
		deamontest2 t1 = new deamontest2();
		deamontest2 t2 = new deamontest2();//user thread last printed
		deamontest2 t3 = new deamontest2();
       
        t1.setDaemon(true);// Deamon thread
        t3.setDaemon(true);// deamon thread
        t1.start();
        t2.start();
        t3.start();
	}
}