package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class MyClass implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	public String role;
	
	
	MyClass(int id, String name, String role){
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	public String toString() {
		return ("id : " + id + " name : " + name + " role : " + role);
	}
}

public class SampleSeialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass(5, "santhiya", "Java Developer");
		OutputStream fileOut = new FileOutputStream("objFile.txt");
		ObjectOutput objOut = new ObjectOutputStream(fileOut);
		System.out.println("Going to start Serialization...");
		objOut.writeObject(obj);
		System.out.println("Completed Serialization...");
		objOut.close();
		
		InputStream fileIn = new FileInputStream("objFile.txt");
		ObjectInput objIn= new ObjectInputStream(fileIn);
		System.out.println("Going to start DeSerialization...");
		MyClass myClass = (MyClass) objIn.readObject();
		System.out.println(myClass);
		System.out.println("Completed Serialization...");
		objIn.close();
		
	}

}
