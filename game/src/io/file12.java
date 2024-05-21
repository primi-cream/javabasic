package io;

import java.io.FileInputStream;

// Stream 활용법 (FileInputStream)
// txt => byte
public class file12 {
	public static void main(String[] args) {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
			FileInputStream fs = new FileInputStream(url);
			System.out.println(fs.available());	// available() : 파일 용량
			
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
