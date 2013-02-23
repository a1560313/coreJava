package com.excel.phani;

public class SuperExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChildClass child0 = new ChildClass();
		child0.childAsset();
		child0.myParentAsset();
		child0.totalAsset();
		System.out.println("============================================");
		
		ChildClass child1 = new ChildClass(100);
		child1.childAsset();
		child1.myParentAsset();
		child1.totalAsset();
		
		ChildClass child2 = new ChildClass(100,true);
		child2.childAsset();
		child2.myParentAsset();
		child2.totalAsset();
		
		ChildClass child3 = new ChildClass(2000,100,true);
		child3.childAsset();
		child3.myParentAsset();
		child3.totalAsset();
		
		
	}
}
