package info._7chapters.phani;

public class WhileLoop {

	public static void main(String[] args) {
		int i =0;
		while(i<8) { // If the while condition is true ..then it goes inside..
			System.out.println("WhileLoop.main()" + i);
			i++;
		}
		
		i = 0;
		do {
			System.out.println("tick " + i);
			i++;
		} while(i < 8);
	}
}
