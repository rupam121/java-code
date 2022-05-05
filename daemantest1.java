//DaemonThread
//provide services to user thread
class daemantest1 extends Thread{
	//int i=0;
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
      //  create 3 thread:)
		daemantest1 t1 = new daemantest1();
		daemantest1 t2 = new daemantest1();//user thread last printed
		daemantest1 t3 = new daemantest1();
        
        t2.setDaemon(true);// Deamon thread
        //t3.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

	}
}