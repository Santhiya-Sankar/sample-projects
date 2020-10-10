package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TOsDO Auto-generated method stub
		InputStream inputFile = new FileInputStream("file.txt");
		ObjectInput objInput = new ObjectInputStream(inputFile);
//		Serialization serial;
//		serial = (Serialization)objInput.readObject();
		System.out.println(objInput.readObject());
		System.out.println("Deserialization completed");
		objInput.close();
		inputFile.close();
	}

}
