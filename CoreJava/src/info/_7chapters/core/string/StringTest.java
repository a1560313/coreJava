package info._7chapters.core.string;

public class StringTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int val = 500000;
		long start = System.currentTimeMillis();
		String str = "HELLO how are u doing";
		str.charAt(0);
		String str1 = "ONE";
		
		String str2 = "one";
		str1.equalsIgnoreCase(str2);
		
		System.out.println(str.substring(8,10));
		
		StringBuffer strLoop = new StringBuffer();
		for(int i=0 ; i< val;i++){
			strLoop.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Buffer" + (end-start));
		
		start = System.currentTimeMillis();
		StringBuilder strbuild = new StringBuilder();
		for(int i=0 ; i< val;i++){
			strbuild.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("BUilder" + (end-start));
	}
}