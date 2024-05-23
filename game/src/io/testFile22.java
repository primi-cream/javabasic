package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class testFile22 {

	public static void main(String[] args) {
		String inputPath = ".\\src\\io\\info.txt";
        String outputPath = ".\\src\\io\\member.csv";
       
        new testFile22_box(inputPath, outputPath);
        
	}

}


class testFile22_box{
	
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	List<String> li = null;
	
	public testFile22_box(String in, String out) {
		try {
			this.fr = new FileReader(in);
			this.br = new BufferedReader(fr);
			this.li = new ArrayList<String>();
			
			String text;
			while((text = br.readLine()) != null) {
				this.li.add(text);
			}
			
			this.fw = new FileWriter(out, Charset.forName("euc-kr"));
			this.bw = new BufferedWriter(fw);
			
			for(String line : this.li) {
				this.bw.write(line + "\n");
				this.bw.flush();
			}
			
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
	
}