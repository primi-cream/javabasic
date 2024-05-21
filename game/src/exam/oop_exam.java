package exam;

import oop2.oc1_box;
import oop2.oop_class1; // 패키지가 다를 경우 public class만 로드
// default class는 로드하지 못합니다.

public class oop_exam {

	public static void main(String[] args) {
		oop2.oc1_box oc1 = new oc1_box();
//		oc1.age = 80; -> error : protected 적용되어 있어 패키지가 달라 변경불가
		oc1.abc();
//		System.out.println(oc1.age);
		oc1.agree = false;
		System.out.println(oc1.agree);
	}

}
