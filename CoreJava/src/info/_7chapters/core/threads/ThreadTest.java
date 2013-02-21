package info._7chapters.core.threads;

//class MyThread extends Thread{
//	@Override
//	public void run() {
//		for(int i = 0 ; i < 5 ; i++)
//			System.out.println("MyThread.run()" + i);
//	}
//}

class MyThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(Thread.currentThread().getName()+ "  < > " + i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException exp){}
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
//		System.out.println("ThreadTest.main() " + Thread.currentThread().getName());
		
		Runnable runnable = new MyThread();
		
		Thread t1 = new Thread(runnable,"First");
		Thread t2 = new Thread(runnable,"Second");
		Thread t3 = new Thread(runnable,"Third");

		t1.start(); 
		t2.start();
		t3.start();
	}		
}