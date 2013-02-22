package com.excel.phani;

public class SwitchStatement{
	public static void main(String ...args){
//		for(int i=0; i<6; i++)
		int i = 2;
		
			if( i == 0){
				System.out.println("SwitchStatement.main() Zero");
			}else if( i == 1){
				System.out.println("SwitchStatement.main() ONE");
			}else if( i == 2){
				System.out.println("SwitchStatement.main() TWO");
			}else if( i == 3){
				System.out.println("SwitchStatement.main() THREE");
			}else if( i == 4){
				System.out.println("SwitchStatement.main() FOUR");
			}
			System.out.println("SwitchStatement.main()");
			
			
			switch(i) {
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i is one.");
				break;
			case 2:
				System.out.println("i is two.");
				break;
			case 3:
				System.out.println("i is three.");
				break;
			default:
				System.out.println("i is greater than 3.");
			}
	}
}

class SampleSwitch {
	public static void main(String args[]) {
		for(int i=0; i<6; i++)
			switch(i) {
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i is one.");
				break;
			case 2:
				System.out.println("i is two.");
				break;
			case 3:
				System.out.println("i is three.");
				break;
			default:
				System.out.println("i is greater than 3.");
			}
	}
}
//================================
class MissingBreak {
	public static void main(String args[]) {
		for(int i=0; i<12; i++)
			switch(i) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("i is less than 5");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("i is less than 10");
				break;
			default:
				System.out.println("i is 10 or more");
			}
	}
}
//====================================
class Switch {
	public static void main(String args[]) {
		int month = 4;
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Autumn";
			break;
		default:
			season = "Bogus Month";
		}
		System.out.println("April is in the " + season + ".");
	}
}

