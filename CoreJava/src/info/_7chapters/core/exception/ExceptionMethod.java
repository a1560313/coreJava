package info._7chapters.core.exception;

class SuperClass{
	public void calculations() throws Exception{
		throw new ArithmeticException();
	}
}

public class ExceptionMethod extends SuperClass{
	public void calculations() throws ArithmeticException{
//		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		
	}
}