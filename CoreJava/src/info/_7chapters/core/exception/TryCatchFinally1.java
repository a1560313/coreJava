package info._7chapters.core.exception;


public class TryCatchFinally1 {

	public void callMe() throws Exception {
//		System.out.println("I am in callMe Method");
		
//		if(true)
			throw new Exception();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TryCatchFinally1 test = new TryCatchFinally1();
		int i = 3;
		try{
			i = 2/0;
			test.callMe();
		}catch(ArithmeticException arExp){
			System.out.println("I am in Arithemetic Exception..");
			i = 7;
		}catch(ArrayIndexOutOfBoundsException arExp){
			System.out.println("I am in Arithemetic Exception..");
			i = 7;
		}catch(Exception exp){
//			exp.printStackTrace();
			System.out.println("ExceptionTest.main()");
		}finally{
			System.out.println("Finally Block...");
			i = 6;
		}
		
		System.out.println("TryCatchFinally.main()" + i);
	}
}