package week06_hw;

import java.util.Random;
import java.util.Scanner;

public class HW05_MineSweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int lm = r.nextInt(10); //지뢰1 생성
		int lm2 = r.nextInt(10); //지뢰2 생성 (1개 또는 2개 생성이기에 중복 가능)
		
		int map[] = new int[10]; //크기가 10인 맵 생성
		for (int i = 0; i < map.length; i++) {
			map[i] = 0;
		}//배열 0~9에 정수형 0을 대입.
		
		int hero = 1; //내 위치는 1로 표현
		int pos = -1; //배열에 넣을 내 캐릭터 위치
		
		while(true) {
			System.out.printf("1(한칸전진)또는 2(1~3칸 랜덤 점프) 입력 >> ");
			int input = s.nextInt();
			map[lm] = 2; //지뢰1 2로 표현
			map[lm2] = 2; //지뢰2 2로 표현
			if(input == 1) { 
				if(pos >= 0) 
				map[pos] = 0;
				pos++;
				map[pos] = hero;
			} else if (input == 2) {
				if(pos >= 0)
					map[pos] = 0;
				pos = pos + r.nextInt(3)+1;
				if(pos > 9)
					pos = 9;
				map[pos] = hero;
			}
			for (int i = 0; i < map.length; i++) {
				System.out.print(map[i]);
			}
			if(pos == lm || pos == lm2) {
				System.out.println();
				System.out.println("지뢰를 밟았습니다. 당신은 죽었습니다.");
				break;
			}
			if(pos >= 9) {
				System.out.println();
				System.out.println("목적지에 도착했습니다.");
				break;
			}
			System.out.println();
		}
	}

}
