package io;

import java.io.*;

// 파일 용량 체크로 업로드 (Buffered)
public class file17 {
	public static void main(String[] args) {
		
		String url = "D:\\product\\img1.png";	// 2MB
		String url2 = "D:\\product\\img2.jfif";	// 2MB 이하
		
		try {
			// BufferedInputStream : byte 내용을 temp(임시 메모리)에 저장
			// OutputStream : 사용시 파일명 변경 가능
			InputStream is = new FileInputStream(url2);
			BufferedInputStream bs = new BufferedInputStream(is);
			if(bs.available() > 2097152) {
				System.out.println("이미지는 최대 2MB 이하의 파일만 업로드 가능");
			} else {
				byte file[] = new byte[bs.available()];	// buffer로 해당 값을 byte로 변환
				FileOutputStream fs = new FileOutputStream("D:\\upload\\20240522.jfif");
//				int total = bs.read(file); 한개의 픽셀값 전체 사이즈
				
				bs.read(file);
				fs.write(file);
				fs.flush();
				fs.close();
				System.out.println("정상적으로 업로드 되었습니다.");
			}
			
			bs.close();
			is.close();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
