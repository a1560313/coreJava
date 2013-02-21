package info._7chapters.core.innerclass;

public class OuterClass {
	public String outerStr = "Outer String";
	
	class InnerClass {
		String str = "Inner String...";
		public void callInnerMe(){
			System.out.println("OuterClass.InnerClass.callInnerMe()" + outerStr);
		}
	}
	
	public void outerMethod(){
		System.out.println("OuterClass.outerMethod()" + new OuterClass().new InnerClass().str);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InnerClass inner = new OuterClass().new InnerClass();
		inner.callInnerMe();
		
		OuterClass oc  = new OuterClass();
		oc.outerMethod();
	}
}
