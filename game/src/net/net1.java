package net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

// Network JAVA
/*
 * 1. IP or Domain Address
 * 2. Port : 중복사용이 불가능 (단, TCP와 UDP로 구분될 경우 가능)
 * 3. TCP : 외부 연결 프로토콜, 전송속도 빠름
 * 4. UDP : 내부 연결 프로토콜, 전송속도 느림 (1:1일 경우 TCP보다 빠름)
 */

public class net1 {
	public static void main(String[] args) throws Exception{
			// getByName : 접속할 도메인 또는 IP 주소명을 말합니다.
			InetAddress ia = Inet4Address.getByName("google.com");
			
			System.out.println(ia.getHostName());	// Domain Name
			System.out.println(ia.getHostAddress());	// IP 출력
			// getAllByName : 접속할 도메인에 관련된 IP 모든 주소를 리스트 함
			InetAddress all[] = Inet4Address.getAllByName("daum.net");
			
			System.out.println(Arrays.toString(all));				
			
	}
}
