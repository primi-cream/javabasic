package io;

import java.io.BufferedReader;
import java.io.FileReader;

// FileReader => buffer
// buffer : Memory 활용하여 Data를 출력 또는 입력 (temp)
/*
 * Buffer는 임시 저장된 공간의 데이터이므로 read 또는 readLine 사용시
 * 무조건 데이터는 순차적으로 삭제 시킵니다. (if 같은 곳에서 사용해도 사용하는 순간 라인 하나씩 삭제)
 */
public class file6 {
	public static void main(String[] args) {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
			FileReader fr = new FileReader(url); // Reader, Writer 선언
			BufferedReader bf = new BufferedReader(fr);	// Buffer 선언
			
//			if(bf.readLine() != "") {
//				System.out.println(bf.readLine());
//				
//			}			
//			System.out.println(bf.readLine());
			
			// Server Memory : 4G => 100MB 정도 할당
			
			String msg = "";
			while((msg = bf.readLine())!=null) {
				System.out.println(msg);
			}
			
			
			
			/*
			while(true) {
				String msg = bf.readLine(); // msg에 저장  Buffer readLine : 공백포함 임시저장소 값 읽기
				
				if(msg != null) {
					System.out.println(msg);					
				} else {
					break;
				}
			}
			*/
			
			
			
			bf.close();	// Buffer 종료
			fr.close(); // FileReader 종료
			
		} catch(Exception e) {
			e.getMessage();
		}
	}
}
