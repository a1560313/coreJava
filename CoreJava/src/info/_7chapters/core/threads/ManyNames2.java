package info._7chapters.core.threads;
class NameRunnable implements Runnable {

	public void run() {
		//		synchronized(this){
		for (int x = 1; x <= 50; x++) {
			System.out.println("Run by "
					+ Thread.currentThread().getName()
					+ ", x is " + x);
			try {
				Thread.sleep(1000);
				} catch (InterruptedException ex) { }
		}
		//		}
	}
}
public class ManyNames2 {
	public static void main(String [] args) {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		
		
		one.setName("ONE");
		
		two.setName("TWO");
		three.setName("THREE");

		//		one.setPriority(1);
		//		two.setPriority(10);
		//		three.setPriority(1);

		one.start();
		two.start();
		three.start();
	}
}