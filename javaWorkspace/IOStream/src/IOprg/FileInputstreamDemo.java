package IOprg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class FileInputstreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream(new File("C:/Users/bzf/Documents/demofile.txt"));
			System.out.println("file opened");
			
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				System.out.println("\nfile closed");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
		

	}

}
