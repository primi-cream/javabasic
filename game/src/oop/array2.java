package oop;
// 반복문 + 1차 원시배열
public class array2 {

	public static void main(String[] args) {
		Integer data[] = {10, 20, 30, 40};
		int ea = data.length;
		for(int i=0; i<ea; i++) { // 배열번호 0부터 시작, 배열 갯수만큼
//			System.out.println(data[i]); // 배열값 출력
		}
		
		// 해당 배열의 모든 값을 합한 결과값을 출력 
		Integer data2[] = {9, 22, 6, 8, 32};
		int sum = 0;
		for(int i=0; i<data2.length; i++) {
			sum+=data2[i];
		}
		
		System.out.println(sum);
	}

}
