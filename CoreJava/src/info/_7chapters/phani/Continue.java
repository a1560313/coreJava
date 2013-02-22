package com.excel.phani;

public class Continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			System.out.print(i + " ");
//			if (i%2 == 0) continue;
//			System.out.println("");
//		}
		for(int i = 0 ; i < 10 ; i++){
			if(i == 5) continue;
			System.out.println("Continue.main()" + i);
		}
	}
}
