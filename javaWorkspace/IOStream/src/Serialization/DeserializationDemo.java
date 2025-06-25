package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Users/bzf/Documents/emp.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object obj=ois.readObject();
		Employee emp=(Employee)obj;
		
		System.out.println("Employee id:"+emp.id);
		System.out.println("Employee name:"+emp.name);
		System.out.println("Employee salary:"+emp.salary);
		System.out.println("Employee ssn:"+emp.ssn);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
