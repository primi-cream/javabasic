package exam;
// IO, Network -> try~catch
/*
 * IO(buffered) => close, flush 	/ NIO  
 * File(IO) => 경로를 로드
 * Files(NIO) 
 * 
 * // String, char
 * FileReader, FileWriter => ASCII	 Handling	(문자한개씩)	Writer 시 반드시 close 사용
 * BufferedReader, BufferedWriter	(전체 - 메모리에 올려서 사용) => 단독사용(X)
 * 
 *  // Stream + Reader, Writer		/ Reader & Writer 오고가는 중간단계
 * InputStreamReader + BufferedReader
 * OuputStreamWriter + BufferedWriter
 * 
 *  // byte[] + read + available + String byte 변환(getBytes)
 * InputStream => FileInputStream, BufferedInputStream(단독 X, read/readLine)
 * OutputStream => FileOutputStream, BufferedOutputStream(단독 X, , read/readLine)
 * 
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * 응용문제 
 * 사용자가 도메인 명을 입력합니다. 예시) http://www.naver.com, http://nate.com
 * "이동할 URL을 입력하세요 : " 해당 입력된 모든 내용은 url.txt로 저장되도록 합니다. 
 * (이동할 URL을 입력하는 부분은 무한 루프. 단, 종료 입력 시 더 이상 질문하지 않습니다.)
 * 저장은 D:\\url.txt
 * 
 */
public class ex25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이동할 URL을 입력하세요 : ");
		String url = sc.nextLine();
		savelog(url);
		
		sc.close();
		
	}
	
	private static void savelog(String url) {
		try {
			InputStream is = new FileInputStream(url);
			BufferedReader br = new BufferedReader(null);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}