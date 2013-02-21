package info._7chapters.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteToDatFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream("object.dat"));

		Person per = new Person("Jayram","HYD","SW");
		
		output.writeObject(per);
		output.close();
		System.out.println("Before " + per);
		
		ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("object.dat"));

		Person perRead = (Person)input.readObject();
		
		System.out.println(" After "+perRead);
	}
}
