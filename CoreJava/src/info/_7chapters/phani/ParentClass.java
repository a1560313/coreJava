package com.excel.phani;

public class ParentClass {
	
	int assetValue = 1000;
	public ParentClass(){
		System.out.println("ParentClass.ParentClass()============");
	}
	public ParentClass(int assetValue){
		this.assetValue = assetValue;
	}
	
	protected void callSuper(){
		System.out.println("Call Super.....");
	}
}