package ch09;

import java.util.Random;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student("김동연", 1573);
		Student st3 = new Student("김동연", 1573, "인공지능소프트웨어");
		
		st1.name = "김동연";
		st1.num = 1573;
		st1.depart = "인공지능소프트웨어";
		st1.grade = 4.0;
		
		st1.study(5);
		double gr = st1.showGrade();
		Random r = new Random();
		int a = r.nextInt();
		
	}

}
