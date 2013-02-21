package info._7chapters.core.exception;

//class ToStringTest{
//	public ToStringTest(String name , String place) {
//		this.name = name;
//		this.place = place;
//	}
//	String name;
//	String place;
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Name= "+name+" Place= "+place;
//	}
//}
public class UserException extends Exception{
	String message ;
	public UserException() {
		message = "User Defined Exception.....";
	}
	
	public UserException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
//		super.toString();
		return message;
	}
}
