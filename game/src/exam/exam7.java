package exam;

import java.util.ArrayList;

public class exam7 {

	public static void main(String[] args) {
		int numArr[] = {60,39,42,7,93,26,38,41,9,12,71};
		
		
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		int w = 0;
		while(w < numArr.length) {
			
			if(numArr[w]%2 == 0) {
				evenList.add(numArr[w]);
			} else {
				oddList.add(numArr[w]);
			}	
			w++;
		}
		
		System.out.println("짝수 클래스 배열 : " + evenList);
		System.out.println("홀수 클래스 배열 : " + oddList);

	}

}
