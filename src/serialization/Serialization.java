package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {

	private static final long serialVersionUID = 1L;

	int value = 321 ;
	int addedValue;
public static void main(String[] args) throws IOException {
	OutputStream fileOut = new FileOutputStream("file.txt");
	ObjectOutput objOut = new ObjectOutputStream(fileOut);
	Serialization obj = new Serialization();
	objOut.writeObject(obj.addedValue);
	System.out.println("serialization completed");
	objOut.close();
	fileOut.close();
			
}		
}
