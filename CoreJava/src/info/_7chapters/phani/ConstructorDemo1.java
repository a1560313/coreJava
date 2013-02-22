package com.excel.phani;

class DogFamily2 {

	boolean hasTail;//camelCase
	String bread;
	String color;
	
	public DogFamily2() {
		this.hasTail = true;
	}
	
	public DogFamily2(String bread, String color){
		this();
		this.bread = bread;
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Has Tail ="+ hasTail +" Bread ="+ bread +" Color ="+color;
	}
}

public class ConstructorDemo1 {

	public static void main(String args[]) {
		
		DogFamily2 dog1 = new DogFamily2("GS","Black");
		System.out.println("ConstructorDemo.main()" + dog1);
	}
}
