package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// servlet, spring => Java > jsp
public class file23 {
	public static void main(String[] args){
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\info.txt";
			
			try {
				// Object -> Writer -> PrintWriter
				
				// FIleWriter => PrintWriter(Javascript, IO기능)
				PrintWriter pw = new PrintWriter(url);	// 파일을 로드하여 해당 내용을 기록하는 클래스
				pw.write("홍길동");
				System.out.println(pw);
				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}
