package oop2;
// interface는 class와 비슷한 성격을 가지고 있음 즉, 모든 메소드를 그룹화함
/*
 * private, protected 사용하지 못함
 * 
 * 
 */
public interface inter1 {
	public String names();	// 기본 메소드가 {} 없음
	public Integer age();
	
	//default : interface에서 유일하게 기본 메소드를 활용할 수 있는 선언문
	default void setbox(String id) {	//setter
		
	};
	
	default String getbox() {	//getter
		return null;
	}
}
