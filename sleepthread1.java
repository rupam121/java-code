
// EXAMPLE OF THREAD USING

class sleepthread1 extends Thread{
	public void run(){
		for(int i=0; i<=5; i++){
			try{
				sleep(1000,200);
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws Exception {
		sleepthread1 t = new sleepthread1();
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
