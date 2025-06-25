package com.mani.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _09FileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\bzf\\Documents\\MyFolder\\Sample.txt");
		try {
			FileWriter fw=new FileWriter(file);
			fw.write(97);
			fw.write(" Hi How Are You!");
			fw.flush();
			fw.close();
			
			FileReader fr=new FileReader(file);
			int output = fr.read();
			while(output!=-1) {
				System.out.print((char)output);
				output=fr.read();
				}
			
			System.out.println();
			
			FileReader fr1=new FileReader(file);
			char[] ch=new char[(int)file.length()];
			System.out.println(ch.length);
			fr1.read(ch);
			for(char ch1:ch) {
				System.out.print(ch1);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
