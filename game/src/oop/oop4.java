package oop;

public class oop4 {
	
		public static void main(String[] args) {
			
			oop4_box op4 = new oop4_box();
			op4.abc();
		}

	}

//	class Box{
//		public void abc() {
//			System.out.println("테스트");
//		}
//	}

	class oop4_box{
		// Overriding
		public void abc() {
			System.out.println("테스트");
		}
		
		public void abc(String a) {
			System.out.println("테스트");
		}
		
		public void abc(int a) {
			System.out.println("테스트");
		}
	

}
