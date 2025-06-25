package com.mani.filehandling;

import java.io.File;

public class _06ListAllFileAndFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Documents");
		String[] listFileFolder = file.list();
		for(String s:listFileFolder) {
			System.out.println(s);
		}

	}

}
