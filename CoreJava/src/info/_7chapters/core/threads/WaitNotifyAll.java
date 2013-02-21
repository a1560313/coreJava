package info._7chapters.core.threads;
public class WaitNotifyAll{
	public static void main(String [] args) {            
		Calculator calculator = new Calculator();            
		
		new Reader(calculator).start();                      
		new Reader(calculator).start();                      
		new Reader(calculator).start();   
		
		calculator.start();
		}
}

class Reader extends Thread {                         
	Calculator c;                      
	public Reader(Calculator calc) {
		c = calc;                                             
	}
	public void run() {
		synchronized(c) {                                     
			try {                                                
				System.out.println("Waiting for calculation...");    
				c.wait();                                            
			} catch (InterruptedException e) {}                  
			System.out.println("Total is: " + Thread.currentThread().getName() +" "+ c.total);          
		}                                                    
	}                                      
}                                                    

class Calculator extends Thread {
	int total;                                           
	
	public void run() {
		synchronized(this) {                                 
			for(int i=0;i<100;i++) {                             
				total += i;                                          
			}
			notifyAll();                                         
		}                                                    
	}                                                    
}                                                    
