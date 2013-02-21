package info._7chapters.test;

class SuperClassTwo{
	String superName;
	public SuperClassTwo(String name){
		superName = "Super Name";
		System.out.println("SuperClass.SuperClass()");
	}
}

public class ConstructorExample extends SuperClassTwo {
	String name;
	String defaultValue;
	
//	public ConstructorExample() {
//		super();
//		defaultValue = "My Default value";
//		System.out.println("ConstructorExample.ConstructorExample()");
//	}
	public ConstructorExample(String name) {
		super(name);
//		this();//super()
		this.name = name;
		System.out.println("ConstructorExample.ConstructorExample(String name)");
	}
	public void callMe(){
		ConstructorExample conExa1 = new ConstructorExample("Jayram");
		
	}
	/**
	 * @param args
	 */
	public static void main(String... args) {
//		ConstructorExample conExa = new ConstructorExample();
//		conExa.name = "Mytseting";
//		System.out.println("ConstructorExample.main()"+ conExa.name);
//		
		System.gc();
		ConstructorExample conExa1 = new ConstructorExample("Jayram");
		
		System.out.println("ConstructorExample.main()"+ conExa1.name);
		System.out.println("ConstructorExample.main()"+ conExa1.defaultValue);
//		ConstructorExample conExa2 = new ConstructorExample("Excel");
	}
	
	protected void finalize( )
	{
		System.out.println("ConstructorExample.finalize()" + getClass());
	}

}