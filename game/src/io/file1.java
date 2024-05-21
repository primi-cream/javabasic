package io;

import java.io.FileReader;

// oop > io > net > security > aop
// I/O : input, output
// inout : 키보드, 마우스, HDD, File
// ouput : 모니터, 프린터

// java.io > java.nio
// io는 무조건 예외처리를 사용해야 합니다.
public class file1 {

	public static void main(String[] args) {  // throws Exception {
//		FileReader fr = new FileReader("");	
		
		/*
		 * FileReader : 문자 데이터(ASCII)만 해당 됩니다.
		 * FileWriter : 문자 데이터 저장 파일 (ASCII)
		 */
		
		try {	// Load할 파일명과 경로가 올바른 상황이면 try 그 반대 상황은 catch
			FileReader fr = new FileReader("D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt");			
//			System.out.println(fr.getEncoding()); // 해당 파일 언어셋
//			System.out.println(fr.read()); // 데이터의 크기
			// 무한루프로 파일 전체를 읽어야 함
			while(true) {
				int size = fr.read();	// read() : 파일을 읽어들임(ASCII)
				System.out.println((char)size);
				if(size == -1) {	// 해당 파일에 더 이상 읽을 내용이 없을 경우
					break;					
				}
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
