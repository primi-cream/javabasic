package oop2;

public class oc1_box {
	//private 외부에서 변수값을 변경 못함
		private String user = "홍길동";
		// 같은 패키지에서는 핸들링 가능
		protected int age = 35;
		// 같은 패키지 및 다른 패키지 또한 변경 및 핸들링가능
		public boolean agree = true;
		
		public void abc() {
			System.out.println(this.user);
			System.out.println(this.age);
		}
}
