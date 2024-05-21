package oop;

import java.util.Scanner;

// 사용자 데이터를 이용한 배열 값 출력하기
/*
 * {"김민지" ,"서은진" ,"명동건" ,"강휘"},
 * {"A" ,"B" ,"AB" ,"O" ,"B"},
 * {"SKT" ,"KT" ,"LGT" ,"LGT" ,"KT"}
 * 
 * 1.사용자 중 KT 고객명만 출력시키시오. 
 * 
 */
public class array6 {
	public static void main(String[] args) {
		dataPrint dp = new dataPrint();
		dp.abc();

	}

}



class dataPrint{
	public void abc() {
		final String data[][] = {
			{"김민지" ,"서은진" ,"김선숙" ,"명동건" ,"강휘"},
			{"A" ,"B" ,"AB" ,"O" ,"B"},
			{"SKT" ,"KT" ,"LGT" ,"LGT" ,"KT"}
		};
		
		
		for(int i=0; i<data[0].length; i++) {
			if(data[2][i].equals("KT")) {
//				for(int j=0; j<data.length; j++) {
					System.out.println(data[0][i]);
//				}				
			}
		}
	}
}