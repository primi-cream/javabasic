package exam;

public class exam5 {

	public static void main(String[] args) {
		new exam5_box();
	}

}


class exam5_box{
	public exam5_box(){
		int[] numArr = {10,20,15,3,9,22,8,3,27};
		int c = 0;
		int sum = 0;
		do {
			sum+=numArr[c];
			c++;
		}while(c<numArr.length);
		
		System.out.println("최종 결과 값 : " + sum);
	}
}