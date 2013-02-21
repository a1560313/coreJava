package info._7chapters.core.threads;
public class RunnableThread implements Runnable{
	static int i = 0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("State = "+Thread.currentThread().getState());
	}
}
