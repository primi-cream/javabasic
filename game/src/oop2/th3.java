package oop2;

import java.util.ArrayList;
import java.util.Arrays;

// Multi Thread 응용편
public class th3 {
	/*
	 * 응용문제
	 * Thread를 이용하여 각각의 배열의 값을 모두 더하는 결과출력
	 * 
	 */
	public static void main(String[] args) {
		Integer data1[] = {10,20,30,40,50,60,70,80,90};
		Integer data2[] = {5,10,15,20,25,30,35,40,45};
		Integer data3[] = {7,14,21,28,35,42,40,56,63};
		Integer[][] data = {data1,data2,data3};
		
		Object[] a = {data1,data2,data3};
		
//		Object 배열을 이용하여 여러개의 배열을 순차적으로 적용하기 위한 방법
//		Integer list[] = (Integer[])a[0]; 
		
		for(int i=0; i<3; i++) {
			new Thread(new th3_box(data[i])).start();
//			new Thread(new th3_box((Integer[])a[i])).start();
		}
	}
}



class th3_box extends Thread{
	ArrayList<Integer> all = null;

	public th3_box(Integer z[]) {
		this.all = new ArrayList<Integer>(Arrays.asList(z));
	}
	
	@Override
	public void run() {
		int sum = 0;
		for(Integer n : this.all) {
			sum+=n;
		}
		System.out.println("합산 : " + sum);
	}
}