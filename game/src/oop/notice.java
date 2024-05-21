package oop;

import java.util.ArrayList;

// 공지사항 부분 - datalist(원시배열 + ArrayList(클래스))
public class notice {

	public static void main(String[] args) {
//		datalist data = new datalist();
		notice_list no = new notice_list();
//		ArrayList<String> al = new ArrayList<String>();
//		ArrayList<ArrayList<String>> pt = new ArrayList<ArrayList<String>>();
		
		
//		System.out.println(data.notice.length);
//		int w=0;
//		while(w < data.notice.length) {	
//			pt.add(no.abc(data.notice[w]));	;	
//			w++;
//		}
		
		System.out.println(no.printing());
//		no.printing(no.abc());		
//		System.out.println(no.printing());
		
		
	}

}

class notice_list{
//	public ArrayList<String> abc(String array[]){
//		ArrayList<String> ar = new ArrayList<String>();
//		for(int i=0; i<array.length; i++) {
//			ar.add(array[i]);
//		}
//		return ar;
//	}
	
	public ArrayList<ArrayList<String>> printing(){
		datalist data = new datalist();
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<ArrayList<String>> pt = new ArrayList<ArrayList<String>>();
		int w=0;
		int ww=0;
			while(w < data.notice.length) {			
				while(ww < data.notice[w].length) {
					ar.add(data.notice[w][ww]);
					ww++;
				}
				pt.add(ar);
				w++;					
			}	
		return pt;
	}
	
}