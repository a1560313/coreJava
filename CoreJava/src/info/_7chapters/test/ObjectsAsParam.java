package info._7chapters.test;

class CheckEquality{
	String name;
	String rollno;
	
	public CheckEquality(String name , String rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
	public boolean equals(Object obj) {
		String name = ((CheckEquality)obj).name;
		String rollno = ((CheckEquality)obj).rollno;
		
		if(this.name == name && this.rollno == rollno)
			return true;
		else
			return false;
	}
}

public class ObjectsAsParam {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		CheckEquality ce1 = new CheckEquality("Jay","001");
		CheckEquality ce2 = new CheckEquality("Jay","002");
		
//		String str1 = "ONE";
//		String str2 = "ONE";
//		
////		System.out.println("ObjectsAsParam.main()" + (str1 == str2));
//		System.out.println("ObjectsAsParam.main()" + (str1.equals(str2)));
		System.out.println("ObjectsAsParam.main()" + ce1.equals(ce2));
		
	}
}