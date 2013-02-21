package info._7chapters.phani;

public class ForLoop {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		
		for(int i = 0 ; i < nums.length; i++){
			System.out.println("ForLoop.main()" + nums[i]);
		}

		// Enhanced For Loop
		for(int j : nums){
			System.out.println("ForLoop.main()" + j);
		}
	}
}
