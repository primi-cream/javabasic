package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Stream + Preader 응용편
/*
 * FileInputStream > InputStreamReader > BufferedReader
 * InputStream > InputStreamReader > BufferedReader (O)
 * InputStream > BufferedReader (X)
 * InputStream > BufferedInputStream (O)
 * InputStreamReader > BufferedReader (O)
 * 
 * 
 * ※ BufferedReader - close() 메모리 종료, BufferedWriter - flush() + close()
 * 
 */


public class file19 {
	public static void main(String[] args) throws Exception {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
		File f = new File(url);
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try{
			fos = new FileOutputStream(f);	// true를 사용해야함
			osw = new OutputStreamWriter(fos); // Stream을 Writer로 변환
			bw = new BufferedWriter(osw);	// Memory를 활용
			
			bw.append("이메일 정책 추가사항");
			bw.newLine();	//한 줄 내려쓰기
			bw.append("본 이메일 정책이 변경된 사항이 있습니다.");
			bw.flush();	// 메모리 공간을 차지하고 있는 것을 초기화 사용하지 않을 시 아래 내용 적용되지않음
			
			//input으로 출력
			InputStream is = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(is); 
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
		
			br.close();
			isr.close();
			is.close();
			
		} catch(Exception e) {
			e.getMessage();
		} finally {
			bw.close();
			osw.close();
			fos.close();
		}
	}
}
