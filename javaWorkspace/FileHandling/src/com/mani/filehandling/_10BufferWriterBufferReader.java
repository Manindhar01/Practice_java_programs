package com.mani.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _10BufferWriterBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\bzf\\Documents\\MyFolder\\test.txt");
		try {
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Tamil");
			bw.newLine();
			bw.write("English");
			bw.newLine();
			bw.write("Mathematics");
			bw.flush();
			bw.close();
			
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line = br.readLine();
			int lineCount=0;
			int sentenceCount=0;
			int wordCount=0;
			int charCount=0;
			while(line!=null) {
				
				String[] split = line.split("[.]");
				sentenceCount=sentenceCount+split.length;
				String[] split2 = line.split(" ");
				wordCount=wordCount+split2.length;
				charCount=charCount+line.length();
				lineCount++;
				System.out.println(line);
				line=br.readLine();
			}
			System.out.println("No of lines: "+lineCount);
			System.out.println("No of sentence:"+sentenceCount);
			System.out.println("No of word: "+wordCount);
			System.out.println("No of character"+charCount);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
