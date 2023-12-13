package CH05;

import java.util.*;

public class Hw4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int wizard = 10;
		int worrior = 20;

		while (true) {
			System.out.println("공격하려면 1을 누르세요.");
			int start = s.nextInt();
			if (start == 1) {
				int wi_damage = r.nextInt(11) + 15;
				int wo_damage = r.nextInt(11) + 5;

				wizard = wizard - wo_damage;
				worrior = worrior - wi_damage;
				System.out.println("마법사 HP : " + wizard + ", 전사 HP : " + worrior + " 입니다.");
				if (worrior <= 0 && wizard <= 0) {
					System.out.println("마법사와 전사가 동시에 죽었습니다.");
					break;
				} else if (wizard <= 0 && worrior > 0) {
					System.out.println("마법사가 죽었습니다.");
					break;
				} else if (worrior <= 0 && wizard > 0) {
					System.out.println("전사가 죽었습니다.");
					break;
				}
			} else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}