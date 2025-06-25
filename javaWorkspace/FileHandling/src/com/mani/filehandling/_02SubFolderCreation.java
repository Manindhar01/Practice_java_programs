package com.mani.filehandling;

import java.io.File;

public class _02SubFolderCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Documents\\MyFolder\\subfolder1\\subfolder2\\subfolder3");
		boolean present=file.exists();
		System.out.println("Folder is Present:"+present);
		if(present==false) {
			file.mkdirs();
			present=file.exists();
			System.out.println("Folder is Present:"+present);
		}

	}

}
