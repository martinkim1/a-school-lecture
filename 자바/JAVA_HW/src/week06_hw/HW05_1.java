package week06_hw;

import java.util.Scanner;

public class HW05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int map[] = new int[30];
		map[0] = 1;
		int pos = 0;

		for (int i = 1; i < 30; i++) {
			map[i] = 0;
		}
		while (true) {
			for (int j = 0; j < map.length; j++) {
				System.out.print(map[j]);
			}
			System.out.println();
			System.out.println("왼쪽(1) 오른쪽(2)를(을) 입력해주세요.");
			int input = s.nextInt();

			if (input == 1) {
				map[pos] = 0;
				pos--;
				if (pos < 0) {
					pos = 0;
				}
				map[pos] = 1;
			} else if (input == 2) {
				map[pos] = 0;
				pos++;
				map[pos] = 1;
			} else
				System.out.println("잘못입력하셨습니다.");
			if (pos==29) {
				System.out.println("목적지에 도착했습니다.");
				break;
			}
		}

	}
}
