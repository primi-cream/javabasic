package exam;

public class exam3 {

	public static void main(String[] args) {
		new exam3_box();
	}

}



class exam3_box{
	public exam3_box() {
		int num = (int)Math.ceil(Math.random()*9);
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d%n", num, i, num*i);
		}
	}
}