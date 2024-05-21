package io;

import java.io.FileInputStream;
import java.util.Arrays;

// Stream 활용법 (FileInputStream)
// txt, jpg, png... => byte
// FileInputStream : 파일을 로드한 후 해당 내용을 byte로 변환하여 결과를 출력 
public class file12 {
	public static void main(String[] args) {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
			FileInputStream fs = new FileInputStream(url);
//			System.out.println(fs.available());	// available() : 파일 용량
			byte temp[] = new byte[fs.available()];
			fs.read(temp);	// byte 전체를 읽음
			String m = new String(temp,"UTF-8");
			System.out.println(m);
//			System.out.println(Arrays.toString(temp));
			fs.close();	
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
