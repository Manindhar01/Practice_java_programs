package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter your video file location");
			String str=s.next();
			FileInputStream fis=new FileInputStream(str);
			FileOutputStream fos = null;
			
			int lastIndexOf = str.lastIndexOf(".");
			String substring = str.substring(lastIndexOf+1);
			if(substring.equals("mp4")) {
				String mp3="mp3";
				fos=new FileOutputStream(str.replace("mp4", mp3));
				int i=fis.read();
				while(i!=-1) {
					fos.write(i);
					i=fis.read();
				}
				System.out.println("your file is converted to audio");
	
				
			}
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
