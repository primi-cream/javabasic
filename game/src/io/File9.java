package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File9 {
	public static void main(String[] args) throws Exception {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\member.txt";
		// nio Files를 이용한 데이터 저장
		String msg = "에이핑크2";
//		Integer msg = 50000;
		
		Path path = Paths.get(url);	// nio 경로
		
//		Files.write(path, msg.getBytes());	// nio write (경로, 문자열.getBytes(), 언어셋)
		
		
		// StandardOpenOption: 파일 형태를 삭제,추가,생성
		// StandardOpenOption.APPEND: 기존파일을 보존하며 새로운 파일을 추가
		// StandardOpenOption.WRITE : 기존 데이터 덮어쓰기 => CREATE와 거의 같음
		// StandardOpenOption 미사용 : 기존 데이터 삭제 후 새로운 데이터 추가
		// StandardOpenOption.CREATE_NEW : 새로운 파일을 생성하여 데이터를 추가
		// StandardOpenOption.CREATE : 해당 경로에 파이명이 없을 경우 생성 후 데이터 추가
		// StandardOpenOption.DELETE_ON_CLOSE : 파일 삭제
		Files.write(path, msg.getBytes(), StandardOpenOption.APPEND);
	}
}
