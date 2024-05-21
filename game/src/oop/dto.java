package oop;
// getter, setter : 데이터를 주고받는 역할을 하는 class

import java.util.ArrayList;

public class dto {
	String id, name, email, age;
	ArrayList<String> all_arr = new ArrayList<String>(); //전역 1차배열

	public String getId() { // getter (Retuen Method)
		return id;
	}

	public void setId(String id) { // setter (field 변수 데이터 삽입)
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	//전역 형태의 배열
	public ArrayList<String> make2(){
		this.all_arr.add(getName());
		return this.all_arr;
	}
	
	
	// 1차 배열
	public ArrayList<String> make(){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(getId());
		arr.add(getName());
		arr.add(getEmail());
		arr.add(getAge());
		return arr;
	}
	
	
	// 2차 배열
	public ArrayList<ArrayList<String>> data(){
		// 1차 배열 생성
		ArrayList<String> al = new ArrayList<String>();
		
		// 최종 2차 배열 생성 후 return 이용하여 데이터를 반환
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		
		return null;
	}
	
}
