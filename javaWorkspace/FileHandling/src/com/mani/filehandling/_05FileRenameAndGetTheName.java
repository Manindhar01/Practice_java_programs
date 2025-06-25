package com.mani.filehandling;

import java.io.File;
import java.io.IOException;

public class _05FileRenameAndGetTheName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Documents\\MyFolder\\test.txt");
		try {
			file.createNewFile();
			File newFile=new File("C:\\Users\\bzf\\Documents\\MyFolder\\Sample.txt");
			boolean rename=file.renameTo(newFile);
			System.out.println("Renamed a file:"+rename);
			
			System.out.println("newFile Name is: "+newFile.getName());
			
			System.out.println(newFile.canExecute());
			System.out.println(newFile.canRead());
			System.out.println(newFile.canWrite());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
