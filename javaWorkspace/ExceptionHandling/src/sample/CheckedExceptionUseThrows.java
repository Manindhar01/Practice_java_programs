package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionUseThrows {
	
	void readFile() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedExceptionUseThrows ce=new CheckedExceptionUseThrows();
		try {
		ce.readFile();
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
