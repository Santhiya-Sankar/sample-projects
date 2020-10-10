package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
 
public class DeSerializeEmployee {
    
    public static void main(String[] args) throws IOException{
           try{
                  InputStream fin=new FileInputStream("C:\\Users\\santhiya.s\\Documents\\Spring-Projects\\SampleJavaProject\\src\\serialization\\ser.txt");
                  ObjectInput oin=new ObjectInputStream(fin);
                  
                  System.out.println("DeSerialization process has started, displaying employee objects...");
                  Employee emp;
                  
                  while(true) {
                	  try{
                		  emp=(Employee)oin.readObject();
                		  System.out.println(emp);
                	  }
                	  catch(EOFException e) {
			        	   System.out.println("EOF reached");
			        	   break;
			           }
           }
                  fin.close();
                  oin.close();
           }
                  catch(EOFException | ClassNotFoundException e){
                  e.printStackTrace();
           }
           
           System.out.println("Object deSerialization completed.");
           
           
    }
}
