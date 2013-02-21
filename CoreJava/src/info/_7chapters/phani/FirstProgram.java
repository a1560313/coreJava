package info._7chapters.phani;

public class FirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World !!!");
//		FirstProgram fp = new FirstProgram();
//		fp.callMe();
		
//		int i = FirstProgram.calculate(1,2);
//		System.out.println("Calculation is "+ i);
		
		int j = 22;
//		j = 22+2;
		j += 2; // 22+2
		System.out.println("FirstProgram.main()" + j);
	}
	
	
	
	
	
	
	
	
	public static void print(int i , int j) {
//		System.out.println("FirstProgram.callMe()" + (i+j));
		int value = i+j;
		System.out.println("FirstProgram.print()"+ value);
	}
	
	public static int calculate(int i , int j) {
//		System.out.println("FirstProgram.callMe()" + (i+j));
		int value = i+j;
		return value;
	}
}