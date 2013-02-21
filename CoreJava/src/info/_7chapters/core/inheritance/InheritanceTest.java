package info._7chapters.core.inheritance;

class SuperInheritance{
	
	public void callMe(){
		System.out.println("SuperInheritance.callMe()");
	}
}

/**
 * 
 * @author Jayram
 *
 */
class ChildOne extends SuperInheritance{
	public void callMe(){
		System.out.println("ChildOne.callMe()");
	}
	public void invokeMe(){
		System.out.println("ChildOne.invokeMe()");
	}
}

class ChildTwo extends SuperInheritance{
	public void callMe(){
		System.out.println("ChildTwo.callMe()");
	}
}
class ChildThree extends SuperInheritance{
	public void callMe(){
		System.out.println("ChildThree.callMe()");
	}
}

public class InheritanceTest{
	public static void main(String[] args) {
//		SuperInheritance sup = new SuperInheritance();
//		sup.callMe();
//		
//		ChildOne one = new ChildOne();
//		one.callMe();
//		
//		ChildTwo two = new ChildTwo();
//		two.callMe();
//		
//		ChildThree three = new ChildThree();
//		three.callMe();
//		
//		sup = new ChildOne();
//		sup.callMe();
//		
////		sup.invokeMe();
		SuperInheritance sup = null;
		
		sup = new ChildOne();
		sup.callMe();
		sup = new ChildTwo();
		sup.callMe();
		sup = new ChildThree();
		sup.callMe();
	}
}
