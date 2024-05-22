package io;

import java.io.*;
import java.nio.charset.Charset;

// csv 파일 로드
public class file21 {
	public static void main(String[] args) throws Exception{
		new file21_csv("data.csv");
	}
}

class file21_csv{
	String file_src = "";	// 파일 위치 및 파일명
	File f = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	public file21_csv(String url) throws Exception{
		this.file_src = "D:\\webpage\\agree\\src\\main\\java\\io\\" + url;
		this.file_csvload();
	}
	
	private void file_csvload() throws Exception{
		this.f = new File(this.file_src);
		try {
			// txt 외에 문서파일기본 euc-kr 로 언어셋 변환 후 출력
			this.fr = new FileReader(this.f, Charset.forName("euc-kr"));
			this.br = new BufferedReader(this.fr);
			String data = "";

			while((data = this.br.readLine()) != null) {	// 해당 CSV를 line 형태로 반복문 출력
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			this.br.close();
			this.fr.close();
		}
	}
}