package exam;

public class exam4 {

	public static void main(String[] args) {
		int w = 0;
		int count = 0; 
		while(w < 10) {
			int num = (int)Math.ceil(Math.random()*20);
			if(num%2 == 0) {
				count++;				
			}
			w++;
		}
		
		System.out.println("짝수는 총 " + count + "개");
	}

}
