package com.mani.filehandling;

import java.io.File;

public class _04FileDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Videos\\Captures\\sample.mp3");
		file.delete();
		boolean present=file.exists();
		System.out.println("File Present:"+present);

	}

}
