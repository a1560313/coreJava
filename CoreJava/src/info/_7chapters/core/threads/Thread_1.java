package info._7chapters.core.threads;
/**
 * 
    NEW
    A thread that has not yet started is in this state.
    RUNNABLE
    A thread executing in the Java virtual machine is in this state.
    BLOCKED
    A thread that is blocked waiting for a monitor lock is in this state.
    WAITING
    A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
    TIMED_WAITING
    A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
    TERMINATED
    A thread that has exited is in this state.

 */
public class Thread_1 extends Thread{
	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();
		Thread t1 = new Thread(rt,"JayramThread");
		Thread t2 = new Thread(rt);
		Thread t3 = new Thread(rt);
		
		System.out.println("Thread_1.main()" + t1.isAlive() +" " + t1.getState());
		t1.start();
//		System.out.println("Thread_1.main()" + t1.isAlive() +" " + t1.getState());
		while(true){
			System.out.println("INSIDE " + t1.isAlive() +" " + t1.getState());	
			if(t1.getState().toString() == "TERMINATED") break;
		}
//		t2.start();
//		t3.start();
		System.out.println("Thread_1.main()" + t1.isAlive() +" " + t1.getState());
	}
}