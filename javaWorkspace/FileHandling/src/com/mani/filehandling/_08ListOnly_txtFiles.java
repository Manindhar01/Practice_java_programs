package com.mani.filehandling;

import java.io.File;

public class _08ListOnly_txtFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Documents");
		File[] listFiles = file.listFiles();
		for(File f:listFiles) {
			
			if(f.isFile()) {
			String Filename = f.getName();
			int lastIndexOf = Filename.lastIndexOf(".");
			String extension = Filename.substring(lastIndexOf+1);
			if(extension.equals("txt")) {
				if(f.length()>8000)
			System.out.println(Filename+" size: "+f.length());
			}
		}
		}

	}

}
