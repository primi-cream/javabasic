package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * I/O 기초 응용편
 * 파일은 gugu.txt로 java에서 생성 되어야하며, 사용자가 다음과 같이 입력을 합니다.
 * 
 * 구구단을 입력하세요 : 
 * gugu.txt에 사용자가 입력한 구구단을 모두 출력되어야 합니다.
 * 
 * 6을 입력 시 
 * 6 * 1 = 6
 * 6 * 2 = 12
 * ...
 * 6 * 9 = 54
 * 
 */
public class file5 {
	
	public static void main(String[] args) {
		
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\";
		try {
			new file5_io(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


class file5_io{
	StringBuilder sb = null;
	File f = null;
	Scanner sc = null;
	FileWriter fw = null;
	FileReader fr = null;
	String fileName = "gugu.txt";
	
	
	public file5_io(String url){
		
		try {
			// 파일 생성부
			this.sb = new StringBuilder();
			this.sb.append(url);
			this.sb.append(this.fileName);
			this.f = new File(String.valueOf(sb));
			this.f.createNewFile();
			
			// 사용자 입력
			sc = new Scanner(System.in);	// 이부분 넣지 않아 NullPoint Exception 발생
			System.out.print("구구단을 입력하세요 : ");
			int num = sc.nextInt();
			
			String msg = "";
			//구구단
			for(int i=1; i<10; i++) {
				msg+=(num + "*" + i + "=" + num*i + "\n");
			}
			// msg 추가
			// FileWriter 시 : int, Integer, double, float 해당 숫자형은 데이터 저장시 글자 깨짐 => notepad는 모두 String으로 구성되어 있으므로
			this.fw = new FileWriter(url+this.fileName,true);	// fileName을 넣지 않았었음. NullPoint Exception 발생
			this.fw.write("\n" + msg);		
			
		} catch(Exception e) {
			System.out.println(e);
		} finally{
			this.sc.close();
			
			try {
				this.fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}		
	}
}