package com.excel.phani;

public class ChildClass extends ParentClass{
	
	int myAsset;
	boolean hasBike;
	boolean hasElectricGuitar;
	
	public ChildClass(){
		this.myAsset = 10;
		System.out.println("ChildClass.ChildClass()");
	}
//	
	public ChildClass(int myAsset){
		this.myAsset = myAsset;
		this.hasBike = true;
		System.out.println("ChildClass.ChildClass()");
	}
//	
	public ChildClass(int myAsset , boolean hasEGuitar) {
//		this.hasBike = true;
//		this.myAsset = myAsset;
//		this.hasBike = true;
		this(myAsset);
		this.hasElectricGuitar = true;
//		System.out.println("ChildClass.ChildClass()");
	}
	
	public ChildClass(int parentAsset ,int myAsset , boolean hasEGuitar) {
		super(parentAsset);
		this.myAsset = myAsset;
		this.hasElectricGuitar = true;
	}
	public void childAsset(){
		System.out.println("Child Assset is "+ myAsset +" Has a bike ="+ hasBike +" Has EGuitar ="+ hasElectricGuitar);
	}

	public void myParentAsset(){
		System.out.println("My Parent Asset ="+ assetValue);
	}
	
	public void totalAsset(){
		System.out.println("Total Asset ="+ (assetValue + myAsset));
		super.callSuper();
	}
}