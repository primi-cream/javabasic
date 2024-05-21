package exam;

public class exam6 {

	public static void main(String[] args) {
		new exam6_box();
	}

}



class exam6_box{
	public exam6_box() {
		int numArr[] = {60,39,42,7,93,26,38,41,9,12,71};
		int sum = 0;
		int w = 0;
		while(w < numArr.length) {
			if(w == 0 || w%2 == 0)
				sum+=numArr[w];
				
			w++;
		}
		
//		while(w < numArr.length) {
//			sum+=numArr[w];
//			w+=2;
//		}
		
		System.out.println("최종 결과 값 : " + sum);
		
	}
}