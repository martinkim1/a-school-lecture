package CH05;

import java.util.*;

public class Hw4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int hero = 1;
		int zombie1 = 7;
		int zombie2 = 15;
		int cnt = 0;
		
		while (hero < 20) {
			cnt++;
			System.out.println("-------- "+cnt+"번째 턴입니다. --------");
			System.out.print("1~3까지의 숫자중 하나를 입력하세요.");
			int move = s.nextInt();
			if (move == 1) {
				hero--;
				if(hero < 1) {
					hero = 1;
				}
				System.out.println("왼쪽으로 움직였습니다. 현재 위치는 " + hero + "입니다.");
			} else if (move == 2) {
				hero++;
				if(hero > 20) {
					hero = 20;
				}
				System.out.println("오른쪽으로 움직였습니다. 현재 위치는 " + hero + "입니다.");
			} else if (move == 3) {
				int rand = r.nextInt(3) + 1;
				hero = hero + rand;
				if(hero > 20) {
					hero = 20;
				}
				System.out.println("점프했습니다. 현재 위치는 " + hero + "입니다.");
			}

			int z_rand1 = r.nextInt(3) - 1;
			int z_rand2 = r.nextInt(3) - 1;

			zombie1 = zombie1 + z_rand1;
			System.out.print(" 좀비1의 좌표:"+zombie1+"  ");
			zombie2 = zombie2 + z_rand2;
			System.out.println("|  좀비2의 좌표:"+zombie2);
			

			if (hero == zombie1 || hero == zombie2) {
				System.out.println("좀비에게 잡혔습니다. 처음위치에서 다시 시작합니다.");
				hero = 1;
				zombie1 = 7;
				zombie2 = 15;

			}
		}
		System.out.println();
		System.out.println("★★★★★★ 미션 클리어!!! 목적지에 도착했습니다. ★★★★★★");
	}

}
