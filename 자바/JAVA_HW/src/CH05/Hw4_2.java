package CH05;

import java.util.*;

public class Hw4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("가위(1) 바위(2) 보(3)를 입력받으세요.");
		int cnt = 0;
		int c_cnt = 0;
		int u_cnt = 0;
		while (c_cnt < 3 && u_cnt < 3) {
			cnt++;
			if(cnt == 6) {
				System.out.println();
				System.out.println("5판동안 승부가 나지 않았습니다.");
				break;
			}
			int input = s.nextInt();
			int computer = r.nextInt(3) + 1;
			if (input == computer) {
				System.out.println("비겼습니다.");
			} else if ((input == 1 && computer == 3) || (input == 2 && computer == 1)
					|| (input == 3 && computer == 2)) {
				System.out.println("나: " + input + ", 컴퓨터: " + computer + ", 내가 이겼습니다.");
				u_cnt++;
				System.out.println("내가 이긴 횟수는 " + u_cnt + "회입니다.");
				if (u_cnt == 3) {
					System.out.println("게임을 종료합니다.");
				}
			} else if ((computer == 1 && input == 3) || (computer == 2 && input == 1)
					|| (computer == 3 && input == 2)) {
				System.out.println("나: " + input + ", 컴퓨터: " + computer + ", 컴퓨터가 이겼습니다.");
				c_cnt++;
				System.out.println("컴퓨터가 이긴 횟수는 " + c_cnt + "회입니다.");
				if (c_cnt == 3) {
					System.out.println("게임을 종료합니다.");
				}
			}
			if (input == 4) {
				System.out.println("가위바위보 게임을 중지(4) 합니다.");
				break;
			}
		}

	}

}