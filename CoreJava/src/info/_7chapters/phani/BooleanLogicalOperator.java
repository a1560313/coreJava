package com.excel.phani;

class BooleanLogicalOperator {
	public static void main(String args[]) {
			int i = 14;
			int j = 20;
			
			if(i++ > 9 || j++ > 10){
				System.out.println("BooleanLogicalOperator.main()");
			}else if (i++ > 9){
				System.out.println("In the else block...");
			}else if(i++ > 20){
				
			}else{
				//True...
			}
			
			//System.out.println("Value is : " + i + " "+ j);
			System.out.println("Ternary Operator "+ ((i > 15) ? "Greater than 15" : "Less than") );
			
			for(int k = 0 ; k < 10 ; k++){
				System.out.println("BooleanLogicalOperator.main()" + k);
			}
	}
}