package io;

import java.io.FileOutputStream;
//FileOutputStream : 파일에 사용자가 입력한 내용을 저장하는 기능 
public class file13 {
	public static void main(String[] args) {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
			String ag = "[개인정보 보호에 대한 약관]\n";
			FileOutputStream os = new FileOutputStream(url, true);	// true : 이어쓰기, false : 새롭게 데이터 생성
			byte[] data = ag.getBytes();
			os.write(data);
//			os.flush();	// Stream에 있는 잔류 byte를 모두 출력 후 빈 공간으로 변경  
			os.close();
		} catch(Exception e) {
			
		} finally {
			
		}
	}
}
