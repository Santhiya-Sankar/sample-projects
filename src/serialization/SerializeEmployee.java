package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	private static final long serialVersionUID = 6959578945865861686L;
    private int id;
    private String name;
    
    public Employee() {
    	System.out.println("no - arg constructor of sub class");
    }
    
    public Employee(Integer id, String name) {
           this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + ", name=" + name + "]";
    }
    /*// used when using Externalizable interface
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(id);
		out.writeObject(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.id = in.readInt();
		this.name = (String) in.readObject();
	}
	*/
}
 
public class SerializeEmployee {
 
    public static void main(String[] args) {
 
           Employee object1 = new Employee(1, "santhiya");
           Employee object2 = new Employee(2, "sankar");
 
           try {
                  OutputStream fout = new FileOutputStream("C:\\Users\\santhiya.s\\Documents\\Spring-Projects\\SampleJavaProject\\src\\serialization\\ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, serializing employee objects...");
                  oout.writeObject(object1);
                  oout.writeObject(object2);
                  oout.close();
                  fout.close();
                  System.out.println("Object Serialization completed.");
                  
           } catch (IOException ioe) {
                  ioe.printStackTrace();
           }
 
    }
 
}


