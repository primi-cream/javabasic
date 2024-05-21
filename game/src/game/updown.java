package game;

import java.util.Scanner;

// 업 & 다운 게임
public class updown {

	public static void main(String[] args) {
		new ud().gm();
	}

}

class ud{
	int pc, user;
	int count = 0; // 게임 실패 횟수
	Scanner sc = null;
	public void gm() {
		// random 사용법
		/*
		int a = (int)Math.ceil(Math.random()*10);
		int b = (int)Math.floor(Math.random()*10);
		int c = (int)Math.round(Math.random()*10);
		*/
		// 추가 옵션 : 기회는 총 3번 입니다. 3번 이상 틀릴 경우 "컴퓨터 승리"라고 출력
		// 
		pc = (int)Math.ceil(Math.random()*20);
		sc = new Scanner(System.in);
		do {
			System.out.print("1~20까지의 숫자 하나를 입력하세요 : ");
			user = sc.nextInt(); // 사용자가 입력하는 숫자 값
			if(pc != user) {
				if(pc < user) {
					System.out.println("Down 입니다.");					
				} else {
					System.out.println("Up 입니다.");
				}
				count++;
			} else {
				System.out.println("정답입니다.");
				break;
			}
			if(count == 3) {
				System.out.println("컴퓨터 승리");
				break;
			}
		}while(true);
	}
}