package com.excel.phani;

class Box {
	double width;
	double height;
	double depth;
	Double doubleWidth;
}

public class BoxDemo2 {
	
	static Box mybox3;

	public static void main(String args[]) {
				
		Box mybox1 = new Box();
		//Box mybox2 = new Box();
		
		double vol;
		// assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		Box mybox2 = mybox1;
		
		/* assign different values to mybox2's
			instance variables */
//		System.out.println("mybox2.width " + mybox2.doubleWidth);
		System.out.println("======mybox1.width " + mybox1.width +"  mybox2.width "+ mybox2.width);
//		System.out.println("Box 3" + mybox3);
		
//		mybox3 = new Box();
		
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		// compute volume of first box
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume is " + vol);
		// compute volume of second box
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume is " + vol);
	}
}
