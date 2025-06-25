package IOprg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader("C:/Users/bzf/Documents/Sampledemo.txt");
			br=new BufferedReader(fr);
			
			String line;
			while((line=br.readLine())!=null) {
				StringTokenizer st=new StringTokenizer(line);
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
				System.out.println("the number of strings are:"+count);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
