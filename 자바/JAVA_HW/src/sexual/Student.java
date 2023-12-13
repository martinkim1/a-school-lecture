package sexual;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int avr;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public char grade() {
		char grade = ' ';
		if(avr > 90) {
			grade = 'A';
		} else if (avr >=80 ) grade = 'B';
		else if (avr >=70 ) grade = 'C';
		else if (avr >=60 ) grade = 'D';
		else grade = 'F';
		return grade;
	}
	
	public void average() {
		this.avr = (kor+eng+math) / 3;
		System.out.print(name+"의 평균점수는 "+avr+"이고");
	}
}
