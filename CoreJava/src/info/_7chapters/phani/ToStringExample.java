package com.excel.phani;

class Person {
	int height;
	int weight;
	String color;
	
	@Override
	public String toString() {
		//return "Height = "+ height +" Weight ="+weight+" Color = "+ color;
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}

public class ToStringExample {
	public static void main(String args[]) {
		Person p = new Person();
		p.height = 10;
		p.color = "White";
		p.weight = 30;
		
		System.out.println("ToStringExample.main()" + p);
	}
}
