package ch09;

public class Student {
	//멤버 변수(필드) = 객체 속성
	String name;
	int num;
	String depart;
	double grade;

	//생성자 = 객체 생성시 객체를 초기화 시켜주는 역할
	public Student() {

	}
	public Student(String n, int m) {
		name = n;
		num = m;
	}
	
	public Student(String n, int m, String l) {
		name = n;
		num = m;
		depart = l;
	}
	
	//메소드 = 객체 동작
	public void study(int hour) {
		System.out.println(hour + "시간 공부하기");
	}
	
	public double showGrade() {
		return grade;
	}
	
}
