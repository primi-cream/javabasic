package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * Stream을 이용하여 구구단 8단 dan.txt로 저장되도록 합니다.
 * 
 * 
 */
public class file14 {
	public static void main(String[] args) {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\dan.txt";
		String mainText = "";
		int w = 1;
		while(w < 10) {
			mainText+=("8 * " + w + " = " + 8 * w + "\n");		
			w++;
		}
		
		try {
			FileOutputStream f = new FileOutputStream(url);			
			byte[] temp = mainText.getBytes();
			f.write(temp);
			f.flush();			
			f.close();		
		} catch (Exception e) {
			
		}
		
	}
}
