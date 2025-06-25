package IOprg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr=new FileReader("C:/Users/bzf/Documents/demofile.txt");
			try {
				fw=new FileWriter("C:/Users/bzf/Documents/demofile.txt");
				int data;
				while((data=fr.read())!=-1) {
					fw.write(data);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
