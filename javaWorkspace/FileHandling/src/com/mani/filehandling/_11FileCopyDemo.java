package com.mani.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _11FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis=new FileInputStream("C:\\Users\\bzf\\Documents\\Stark.jpg");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\bzf\\Documents\\Stark1.jpg");
			
			int i = fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			System.out.println(fos);
			fos.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
