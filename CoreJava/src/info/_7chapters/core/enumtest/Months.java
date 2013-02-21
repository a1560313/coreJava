package info._7chapters.core.enumtest;

enum Months{
		JAN(1),FEB(2),MAR(3),APRIL(4),MAY(5),JUNE(6),JULY(7),AUG(8),SEPT(9),OCT(10),NOV(11),DEC(2);
		
	Months(int monthInt){
		this.monthInt = monthInt;
	}
	
	private int monthInt;
	public int getMonth(){
		return this.monthInt;
	}
};