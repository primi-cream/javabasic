package oop2;

public interface inter2 {
	public String data[] = {"유재석", "강호동", "신동엽", "정상훈", "아이유"};
	public void money();
}

//기존 내용외에 추가적인 메소드 및 전역변수 자료형이 있을 경우 기존 interface를 로드 후 추가 옵션 코드를 작성함

/*
 * [핵심]
 * 1. extends로 interface를 로드 시 기존에 있는 default 변경 유/무 선택
 * 2. 새로운 메소드를 생성 시 implements를 한 class에 추가 메소드를 Override 해야함
 * 3. 즉시 실행되는 메소드는 없음
 * 
 */
interface inter2_2 extends inter2{
	Integer p = 1000;
	public void point();
}