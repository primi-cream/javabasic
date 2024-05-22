package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// StreamWriter, StreamReader (Stream + Reader,Writer)
public class file18 {
	public static void main(String[] args) {
		//String data = "유재석";
		try {
			System.out.print("입력값 : ");
			// InputStreamReader :Stream +Reader 로 변환가능한 라이브러리
			// Stream [byte], Reader [String]
			InputStreamReader isr = new InputStreamReader(System.in);			
//			int data = isr.read(); read를 사용하면 , Buffered에 loss 데이터 발생
			
			//InputStreamReader -> BufferReader
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());	// 입력된 모든 값 출력
			
			//OutputStreamWriter
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
//			OutputStreamWriter bw = new OutputStreamWriter(System.in);
//			BufferedWriter bw = new BufferedWriter(osw);
//			Bufferedwriter = 
			String msg = "고객님의 포인트는 10000 입니다.";
			
//			bw.write(msg);
//			
//			bw.close();
			osw.close();
			br.close();
			isr.close();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
