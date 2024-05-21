package exam;

import java.util.*;

public class exam10 {

	public static void main(String[] args) {
		new exam10_box().abc();
	}

}


class exam10_box{
	Integer[] numbers = {1,3,6,9,12,15,18,21,24,27};
	LinkedList<Integer> input = new LinkedList<Integer>(Arrays.asList(numbers));
	Scanner sc = null;
	
	public void abc() {
		sc = new Scanner(System.in);
		System.out.print("1~30까지 숫자 하나를 입력 : ");
		int no = sc.nextInt();
		boolean ck = true;
		if(no < 1 || no > 30) {
			System.out.println("지정된 범위의 수가 아닙니다.");
		} else {			
			for(Integer num : input) {
				if(num == no) {
					System.out.println("같은 숫자가 존재합니다.");
					ck = false;
					break;
				}
			}
			if(ck == true) {
				input.add(no);
				input.sort(null);
			}
		}
		System.out.println(input);
		abc();
	}
	
}