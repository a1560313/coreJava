package info._7chapters.core.inheritance;

public class JayramEmp extends Employee implements Jumpable{
	@Override
	public void jump() {
		System.out.println("I can jump 3 feet");
		
	}
	@Override
	public void wearTie() {
		// TODO Auto-generated method stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BobarManAnimal dog = new BobarManAnimal();
	}
}