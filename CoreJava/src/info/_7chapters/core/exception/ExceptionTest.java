package info._7chapters.core.exception;

public class ExceptionTest {

	public void callMe() throws Exception {
		System.out.println("I am in callMe Method");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("ExceptionTest.main() 1");
		System.out.println("ExceptionTest.main() 2");
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
//		try{
//			if(true){
				int i  = 20/0;
				System.out.println("ExceptionTest.main() 3 >>" + i);
//			}
//		}catch(Exception e){
//			System.out.println("ExceptionTest.main()");
//			e.printStackTrace();
//		}
		
		
		System.out.println("ExceptionTest.main() 4");
		System.out.println("ExceptionTest.main() 5");
		
		ExceptionTest test = new ExceptionTest();
		
		try{
			test.callMe();
			
		}catch(Exception exp){
			System.out.println("ExceptionTest.main()");
		}finally{
			System.out.println("Finally Block...");
		}
		
	}
}