package sexual;

import java.util.Scanner;

public class sexualProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("학생수를 입력하세요.");
		int num = s.nextInt();
		
		Student student[] = new Student[num];

		
		for(int i=0; i<student.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름과 국영수 성적을 입력하세요.");
			String name = s.next();
			int kor = s.nextInt();
			int eng = s.nextInt();
			int math = s.nextInt();
			
			student[i] = new Student(name, kor, eng, math);
			
			student[i].average();
			char g = student[i].grade();
			System.out.println(" 등급은"+g+"입니다.");
		}
	}
}