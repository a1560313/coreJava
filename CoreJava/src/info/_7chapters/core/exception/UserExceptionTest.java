package info._7chapters.core.exception;
public class UserExceptionTest {
	public static void userMethod() throws UserException{
		if(true)
			throw new UserException("Something Wrong");
	}
	
	private static int calc(int i , int j){
		assert true : "Value of j is =" +j;
	
		return i/j;
	}
	
	public void callME(){
		
	}
	
	public static void main(String arg[]){
		System.out.println("UserExceptionTest.main()" + calc(4,1));
	}
}
