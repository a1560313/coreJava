package com.excel.phani;

public class Testing {
	public static void main(String[] args) {
		MyTesting test1 = new MyTesting();
		test1.i = 100;
		test1.j = 50;
		test1.callMe();
		
		MyTesting test2 = new MyTesting();
		test2.callMe();
		
		MyTesting.invokeMe();
		
	}
}