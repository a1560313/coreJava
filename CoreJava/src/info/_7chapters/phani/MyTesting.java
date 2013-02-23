package com.excel.phani;

public class MyTesting{
	
	public MyTesting(){
		System.out.println("MyTesting.MyTesting()");
	}
	
	public MyTesting(String name) {
		this();
	}
	
	int i = 30; // Instance 
	static int j = 40; // Class
	public void callMe(){
		int k = 20;
		System.out.println("K Value =" + k +" J Value = "+j +" I value = "+i);
	}
	
	/**
	 * This is a static method
	 */
	public static void invokeMe() {
		System.out.println("MyTesting.invokeMe()" + j);
	}
	/**
	 * This is a static block
	 */
	static{
		System.out.println("MyTesting.staticBlock()" + j);
	}
	
	public void thisExample(){
		
		System.out.println("MyTesting.thisExample()"+ this.i);
	}
	
	public void thisExample(String name){
		System.out.println("MyTesting.thisExample()"+ this.i);
	}
}