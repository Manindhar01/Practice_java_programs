package com.mani.filehandling;

import java.io.File;

public class _07ListOnlyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Documents");
		File[] listFiles = file.listFiles();	//it show file and folder
		for(File f:listFiles) {
			if(f.isFile()) {			//it show only file
				System.out.println(f);
			}
		}
		System.out.println();
		for(File f:listFiles) {
			if(f.isDirectory()) {		//it show only folder
				System.out.println(f);
			}
		}

	}

}
