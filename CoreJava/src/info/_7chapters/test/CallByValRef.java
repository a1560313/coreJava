package info._7chapters.test;

import org.apache.log4j.Logger;

class CheckEquality1{
	String name;
	String rollno;

	public CheckEquality1(String name , String rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

public class CallByValRef{
	private static Logger log = Logger.getLogger(CallByValRef.class);

	public static void callValue(int i , int j){
		if(log.isInfoEnabled())
			log.info(" Before I =" + i +" J = "+ j);

		i = 2;
		j = 3;
		if(log.isInfoEnabled())
			log.info(" AFter I =" + i +" J = "+ j);
	}

	public static void callRef(CheckEquality1 chk){
		if(log.isInfoEnabled())
			log.info("CallByValRef.callRef()" + chk.name);
		chk.name = "Rout";
	}

	public static void main(String... args) {
		CheckEquality1 chk = new CheckEquality1("Jay", "001");
		log.info("Before " + chk.name);

		callRef(chk);

		log.info("After " + chk.name);
		log.debug("I m in debbuggin....");
		log.debug("I m in debbuggin....");
		log.info("I m in info....");
	}
}
/**
Trace
Debug
Info
Warn
Error
Fatal
*/