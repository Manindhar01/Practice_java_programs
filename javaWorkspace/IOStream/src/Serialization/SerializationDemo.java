package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("C:/Users/bzf/Documents/emp.ser");
			oos=new ObjectOutputStream(fos);
			
			Employee emp=new Employee(1,"hari",20000,1234);
			oos.writeObject(emp);
			System.out.println("Employee object serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
