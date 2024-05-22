package io;

import java.io.*;
import java.util.ArrayList;

/*
 * 응용문제 info.txt를 이용하여 member.csv에 데이터를 입력시켜야 합니다.
 * comma 기준으로 각각의 data를 저장되도록
 * 코드를 작성하시오. 단, Stream, Writer 선택
 */

public class file22 {
	public static void main(String[] args) throws Exception{
		String path = "D:\\webpage\\agree\\src\\main\\java\\io\\info.txt";
		String copyPath = "D:\\webpage\\agree\\src\\main\\java\\io\\member.csv";
		new file22_box(path, copyPath);
	}
}


class file22_box{
	
	File f = null;
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	file22_box(String path, String copyPath) throws Exception{
		f = new File(path);
		try {
			// 원본파일
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			ArrayList<String> text = new ArrayList<String>();
//			text = br;
			// 복사할 파일
			f = new File(copyPath);
//			fw = new FileWriter(f);
//			bw = new BufferedWriter(fw);
			
//			bw.flush();
//			System.out.println(bw);
			
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			
		}
	}
}