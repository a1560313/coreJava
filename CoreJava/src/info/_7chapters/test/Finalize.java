package info._7chapters.test;

public class Finalize {
	static int finalizeField = 0;
	String name;
	String defaultValue;
	public Finalize(String name) {
		this.name = name;
	}
	public void callMe(){
		System.out.println("Finalize.callMe()" + getClass());
	}
	/**
	 * @param args
	 */
	public static void main(String... args) {
		int i =0;

		while(true){
			Finalize fin = new Finalize("Name"+(i++));
			if(i == 100000) break;
		}
	}
	protected void finalize() {
		System.out.println("ConstructorExample.finalize()" + getClass() + " "+name + " Value ="+(finalizeField++));
		
	}
}