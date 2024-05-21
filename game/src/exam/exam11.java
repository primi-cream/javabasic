package exam;

/* 응용문제11 해당 데이터 배열에 대해 데이터값을 분석하는 프로세서를 제작해야 합니다. 해당 데이터는 http://mekeyace.kbsn.or.kr/infodata.txt에 있습니다. [결과] SKT 사용자 : 2 KT 사용자 : 3 LGT 사용자 : 1 */ public class exam11 {
	public static void main(String[] args) {
		new exam11_box().getUserCount();
	}
}

class exam11_box {
	String users[][] = { { "hong", "홍길동", "hong@gmail.com", "경기도", "010-1234-5678", "SKT" },
			{ "kang", "강감찬", "kang@naver.com", "인천광역시", "010-3344-5566", "KT" },
			{ "leesh", "이순신", "leesh@daum.net", "강원도", "010-5501-3366", "KT" },
			{ "hansb", "한석봉", "hansb@nate.com", "제주도", "011-4459-3233", "SKT" },
			{ "leesan", "이산", "korea_lee@gmail.com", "서울", "010-5050-5531", "LGT" },
			{ "do_jong", "정도전", "do_jong04@naver.com", "경기도", "010-5050-5531", "KT" } };

	public void getUserCount() {
		int sktCount = 0;
		int ktCount = 0;
		int lgtCount = 0;
		int count = 0;
		
		for (String[] user : users) {
			String tel = user[user.length - 1];
			switch (tel) {
			case "SKT":
				sktCount++;
				break;
			case "KT":
				ktCount++;
				break;
			case "LGT":
				lgtCount++;
				break;
			default:
				break;
			}
		}
		printing(sktCount, ktCount, lgtCount);
	}

	public void printing(int getSkt, int getKt, int getLgt) {
		Object tel[][] = { { "SKT", "KT", "LGT" }, { getSkt, getKt, getLgt } };
		for (int i = 0; i < tel[0].length; i++) {
			System.out.println(tel[0][i] + " 사용자 : " + tel[1][i]);
		}
	}
}
