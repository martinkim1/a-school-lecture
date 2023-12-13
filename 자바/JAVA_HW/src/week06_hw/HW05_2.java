package week06_hw;

import java.util.Scanner;

public class HW05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner howMany = new Scanner(System.in);

		System.out.println("학생 수를 입력하세요.");
		int num = howMany.nextInt();

		int kor[] = new int[num];
		int eng[] = new int[num];
		int math[] = new int[num];
		int sum[] = new int[num];
		double avg[] = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.println("국어, 영어, 수학 성적을 입력하세요.");
			kor[i] = howMany.nextInt();
			eng[i] = howMany.nextInt();
			math[i] = howMany.nextInt();
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3.0;
		}

		for (int i = 0; i < num; i++) {
			System.out.println(i + "번 학생의 성적 평균은 " + avg[i]);
		}
	}

}
