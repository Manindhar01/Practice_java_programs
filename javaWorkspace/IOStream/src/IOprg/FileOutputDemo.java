package IOprg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("C:/Users/bzf/Documents/Bike.jfif");
			fos=new FileOutputStream("C:/Users/bzf/Documents/Bike.jfif");
			
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
