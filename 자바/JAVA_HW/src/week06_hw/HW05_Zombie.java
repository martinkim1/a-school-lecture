package week06_hw;

import java.util.Random;
import java.util.Scanner;

public class HW05_Zombie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int zoms[] = new int[2];
		zoms[0] = 2;
		zoms[1] = 2;
		int hero = 1;
		int pos = 0;
		int cnt = 0;

		int map[] = new int[20];

		map[0] = hero;

		for (int i = 1; i < 20; i++) {
			map[i] = 0;
		}
		int zompos[] = { 6, 14 };
		map[zompos[0]] = zoms[0];
		map[zompos[1]] = zoms[1];
		while (true) {
			cnt++;
			System.out.println("-------- " + cnt + "번째 턴입니다. --------");
			for (int j = 0; j < map.length; j++) {
				System.out.print(map[j]);
			}
			System.out.println();
			System.out.print("1~3까지의 숫자중 하나를 입력하세요 >>> ");
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
			} else if (input == 3) {
				map[pos] = 0;
				int rand = r.nextInt(3) + 1;
				pos = pos + rand;
				if (pos > 19) {
					pos = 19;
				}
				map[pos] = 1;
			}
			for (int j = 0; j < zompos.length; j++) {
				if(pos != zompos[j])
					map[zompos[j]] = 0;					
			}
			for (int i = 0; i < zompos.length; i++) {
				zompos[i] = zompos[i] + r.nextInt(3) - 1;
			}

			if (zompos[0] <= 0 )
				zompos[0] = 0;
			else if (zompos[0] >= 19)
				zompos[0] = 19;

			if (zompos[1] <= 0)
				zompos[1] = 0;
			else if (zompos[1] >= 19)
				zompos[1] = 19;
			map[zompos[0]] = zoms[0];
			map[zompos[1]] = zoms[1];
			if (pos == zompos[0] || pos == zompos[1]) {
				System.out.println("좀비에게 잡혔습니다. 처음위치에서 다시 시작합니다.");
				pos = 0;
				zompos[0] = 6;
				zompos[1] = 14;
				map[0] = 1;
			}
			if (pos >= 19) {
				System.out.println("목적지에 도착했습니다. 게임을 종료합니다.");
				break;
			}
			System.out.println(pos);
			System.out.println(zompos[0]);
			System.out.println(zompos[1]);
		}
	}
}
