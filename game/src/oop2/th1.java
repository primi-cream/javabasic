package oop2;
//Multi Thread Environment (class를 로드하여 출력하는 형태)
// Thread란 기본으로 1개의 Thread로 작동을 합니다.
// Thread Class를 해당 Class로 Inheritance 한 후 Thread 선언하여 start()
// Method 활용 시 Multi Thread로 작업환경이 변경됩니다.
// 단, 웹 기본 속성은 Single Thread 입니다.
public class th1 {
	public static void main(String[] args) {
//		Single Thread 구성 코드
//		th1_box th = new th1_box();  
//		th.aaa();
//		th.bbb();
//		int w = 0;
//		do {
//			th.ccc(w);
//			w++;
//		}while(w <= 20);
		
		// Multi Thread 호출 및 코드 방식
		int w = 0;
		do {
			th2_box thb = new th2_box(w);
//			thb.zzz(); // 미작동 (Single Thread)
			Thread th = new Thread(thb);
			th.start(); // run() Method call
			w++;
		}while(w <= 20);
		
		
	}
}

//Multi-Thread
class th2_box extends Thread{
	int no = 0;
	
	public th2_box(int n) {
		this.no = n;
	}
	
	public void zzz() {	// Multi-Thread 미적용
//		System.out.println("zzz : " + n);
		System.out.println(this.no);
	}
	
	@Override
	public void run() { // Multi Thread Class를 적용한 Method
		System.out.println(this.no);
	}
}

//Single Thread
class th1_box{
	public void ccc(int z) {
		System.out.println("c : " + z);
	}
	
	public void aaa() {
		int w = 0;
		do {
			System.out.println("a : " + w);
			w++;
		}while(w <= 20);
	}
	
	public void bbb() {
		int w = 0;
		do {
			System.out.println("b : " + w);
			w++;
		}while(w <= 20);
	}
}
