package com.mani.filehandling;

import java.io.File;
import java.io.IOException;

public class _03CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Documents\\MyFolder\\test.txt");
		boolean present=file.exists();
		if(present==false) {
			try {
				boolean created=file.createNewFile();
				System.out.println("File created:"+created);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
