package com.excel.phani;

class DogFamily {

	boolean hasTail;//camelCase
	String theBread;
	String color;
	
	public DogFamily() {
		System.out.println("Constructor is invoked....");
		this.hasTail = true;
		this.theBread = "Add IT";
		this.color = "White";
	}
	
	public DogFamily(boolean hasTail){
		System.out.println(" Parameterized Constructor is invoked....");
		this.hasTail = hasTail;
		this.theBread = "Add IT";
		this.color = "White";
	}
	
	public DogFamily(boolean hasTail, String bread, String color){
		this.hasTail = hasTail;
		theBread = bread;
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Has Tail ="+ hasTail +" Bread ="+ theBread +" Color ="+color;
	}
}

public class ConstructorDemo {

	public static void main(String args[]) {

		DogFamily dog = new DogFamily();
		
		DogFamily dog1 = new DogFamily(true,"GS","Black");
		
		DogFamily dog2 = new DogFamily(false,"Aski","White");
		
		//		dog.hasTail = true;
		//		dog.bread = "German";
		//		dog.color = "black";

		System.out.println("ConstructorDemo.main()" + dog1);
	}
}
