package info._7chapters.test;

public class EnhancedForLoop {

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
		int tempValue = 0;
//		for(int i =0 ; i < intArg.length ;i++){
//			tempValue += intArg[i];
//		}
//		System.out.println("Testing.addMe()" + tempValue);
		
		for(int i : intArg){
			tempValue += intArg[i];
		}
		System.out.println("EnhancedForLoop.addMe()" + tempValue);
	}
}