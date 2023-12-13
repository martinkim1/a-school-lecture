package week06_hw;

import java.util.Scanner;

public class HW05_Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// 맵 생성
		int map[][] = { {0, 0, 1, 1, 1},
						{1, 0, 0, 1, 1},
						{1, 1, 0, 0, 1},
						{1, 1, 1, 0, 1},
						{1, 1, 1, 0, 0} };
		
		int hero = 2; // 캐릭터 2로 출력
		int pos1 = 0; // 행
		int pos2 = -1; // 열
		int cnt = 0;
		int input = 0;
		
		while(true) {
			if(pos2 < 0) { // 시작위치 (0,-1)일때 배열 index오류 방지
				System.out.print("  [ 상(5) 하(2) 좌(1) 우(3) ]  를 입력하세요 >> ");
				input = s.nextInt();
				cnt++;
				System.out.println("                                            실행횟수: " + cnt);
				while(input != 3) {
					if(input != 3) {
						System.out.println("맵 밖으로 나가지 못합니다.");
					}
					for(int i=0; i < 5; i++) {
						for(int j=0; j < 5; j++) {
							System.out.print(map[i][j] + " ");
						}
						System.out.println();
					}
					System.out.print("  [ 상(5) 하(2) 좌(1) 우(3) ]  를 입력하세요 >> ");
					input = s.nextInt();
					cnt++;
					System.out.println("                                            실행횟수: " + cnt);
				}
				pos2 = pos2 + 1;
				map[pos1][pos2] = hero;
				for(int i=0; i < 5; i++) {
					for(int j=0; j < 5; j++) {
						System.out.print(map[i][j] + " ");
					}
					System.out.println();
				}
			} // 캐릭터가 (0,0)에 위치할때까지 반복
			System.out.print("  [ 상(5) 하(2) 좌(1) 우(3) ]  를 입력하세요 >> ");
			input = s.nextInt();
			cnt++;
			System.out.println("                                            실행횟수: " + cnt);
			if(input == 5) {
				map[pos1][pos2] = 0;
				pos1 = pos1 - 1;
				if (pos1 < 0) { // 시작위치 (0, 0)일때
					pos1 = 0;
					System.out.println("맵 밖으로 나가지 못합니다.");
				}
				if (map[pos1][pos2] == 1) {// 포지션을 옮겼을때 벽(1)과 만난다면 옮기기 전으로 돌아가라.
					pos1 = pos1 + 1;
					System.out.println("벽에 부딪혔습니다.");
				}
				map[pos1][pos2] = hero;
			} else if(input == 2) {
				map[pos1][pos2] = 0;
				pos1 = pos1 + 1;
				if (pos1 > 4) {
					pos1 = 4;
					System.out.println("맵 밖으로 나가지 못합니다.");
				}
				if (map[pos1][pos2] == 1) {
					pos1 = pos1 - 1;
					System.out.println("벽에 부딪혔습니다.");					
				}
				map[pos1][pos2] = hero;
			} else if(input == 1) {
				map[pos1][pos2] = 0;
				pos2 = pos2 - 1;
				if (pos2 < 0) { // 시작위치 (0, 0)일때
					pos2 = 0;
					System.out.println("맵 밖으로 나가지 못합니다.");
				}
				if (map[pos1][pos2] == 1) {
					pos2 = pos2 + 1;
					System.out.println("벽에 부딪혔습니다.");					
				}
				map[pos1][pos2] = hero;
			} else if(input == 3) {
				map[pos1][pos2] = 0;
				pos2 = pos2 + 1;
				if (map[pos1][pos2] == 1) {
					pos2 = pos2 - 1;
					System.out.println("벽에 부딪혔습니다.");					
				}
				map[pos1][pos2] = hero;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		
			//맵 출력
			for(int i=0; i < 5; i++) {
				for(int j=0; j < 5; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			if (pos1 == 4 && pos2 == 4) {
				System.out.println();
				System.out.println(cnt+"번 만에 목적지에 도착했습니다.");
				break;
			}
		}
		
	}

}
