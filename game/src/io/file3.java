package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// 여러개의 라인이 있는 파일 내용 읽기
// FileReader : 읽기  FileWriter : 쓰기(저장)
public class file3 {
	public static void main(String[] args){
		try{
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
			FileReader fr = new FileReader(url);
			Scanner sc = new Scanner(fr);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			
//			do{
//				System.out.println(sc.nextLine());
//			}while(sc.hasNext()); 
			
			
//			System.out.println(sc.hasNext());	// 내용 존재 : true , 없음 : false
			// 해당 라인외에 경고메세지까지 출력이 됨
//			for(;;) {
//				String result = sc.next();
//				if(result != null) {
//					System.out.println(result);
//				} else {
//					break;
//				}
//			}
			
			sc.close();
			fr.close();
			// 추가 글쓰기
			file3_box fb = new file3_box();
			fb.file_write();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}


class file3_box{
	String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
	FileWriter fw = null;
	Scanner sc = null;
	
	public void file_write() throws Exception {
		System.out.println("추가 내용을 입력하세요 : ");
		this.sc = new Scanner(System.in);
		String msg = this.sc.nextLine();
		
		this.fw = new FileWriter(this.url,true);	// true는 추가(보존), false는 덮어씀(새롭게 삽입)
		this.fw.write("\n"+msg);
		
		System.out.println("저장 완료 되었습니다.");
		this.fw.close();
		this.sc.close();
	}
}
