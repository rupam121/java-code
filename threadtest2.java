

 // THREAD CREAT BY IMPLEMENTING RUNNABLE

class thread1 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Thread1: "+i);
		}
	}
}
class thread2 implements Runnable{
    public void run(){
    	for(int i=0;i<5;i++){
    		System.out.println("Thread2: "+i);
    	}
    }
}

class threadtest2{
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		obj1.start();
		obj2.start();
	}
}