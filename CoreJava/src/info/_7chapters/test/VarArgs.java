package info._7chapters.test;

public class VarArgs {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		// TODO Auto-generated method stub
		int i = 1_000;
		System.out.println("Testing.main()" + i);
		
		addMe(1,2,4,4,5,6,7);
	}
	public static void addMe(int... intArg){
		int len = intArg.length;
		int tempValue = 0;
		for(int i =0 ; i < len ;i++){
			tempValue += intArg[i];
		}
		System.out.println("Testing.addMe()" + tempValue);
	}
}