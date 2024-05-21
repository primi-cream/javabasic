package oop2;
// Multi Thread (Interface) 활용
// web developer가 유일하게 Thread를 활용하는 경우 : API Server
// Javascript multi thread(4) : web worker
public class th2 {
	public static void main(String[] args) {		
		for(int i=0;i<10;i++) {
			th2_class th = new th2_class();
			th.abc(i);
			Thread tr = new Thread(th);	// Interface도 동일하게 Thread 호출
			//각 작업별로 Thread가 휴식기 및 활동을 각각 별개로 작업이 이뤄집니다.
			try {
				tr.sleep(1000);
				tr.start();
			} catch (Exception e) {
				System.out.println("Thread 문제 발생!!");
			}
		}
	}

}

// Interface Thread (Runnable) 활요하며 run 작동
class th2_class implements Runnable{
	int n = 0;
	public void abc(int z) {
		this.n = z;
	}
	@Override
	public void run() {	// run Method에 code 작성시 결과값은 다르게 출력됩니다.
		try {
//			Thread.sleep(5000);	// Thread.sleep : 휴식기 (시간) 1000 = 1초		
		} catch (Exception e) {
			System.out.println("Thread 오류발생!!");
		}
		System.out.println(this.n);
	}
}