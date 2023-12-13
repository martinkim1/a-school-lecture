package Week10_fightGame;

import java.util.Random;

public class FightGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 캐릭터 생성
		Random r = new Random();
		Fighter me = new Fighter("동연", 200, new Random().nextInt(15) + 1);
		Boss boss = new Boss("보스", 300, new Random().nextInt(20) + 1);
        int round = 1;
        int gcnt = 0;
        int ucnt = 0;
        // 게임 진행
        while (me.health > 0 && boss.health > 0) {
        	System.out.println("라운드: " + round);
            	// 각 턴마다 공격
            	me.attack(boss);
            	while(true) {
            		int guardPercentage = r.nextInt(2);
            		if(guardPercentage == 0) {
                		guard();
                		gcnt++;
                		break;
                	}	
            		if (r.nextInt(20) == 0) {
            			boss.ultimate(me, boss);
            			ucnt++;
            		} else boss.attack(me);
            		break;
            	}            	
                
            // 각 캐릭터의 체력 출력
            System.out.println("나의 체력: " + me.health);
            System.out.println("보스의 체력: " + boss.health);
            System.out.println();
            round++;
        }

        // 최종 승부 판정
        if (me.health <= 0 && boss.health <= 0) {
            System.out.println("무승부!");
            System.out.println("가드 횟수: "+gcnt);
            System.out.println("필살기 횟수: "+ucnt);
        } else if (boss.health <= 0) {
            System.out.println("내가 이겼습니다!");
            System.out.println("가드 횟수: "+gcnt);
            System.out.println("필살기 횟수: "+ucnt);
        } else {
            System.out.println("보스가 이겼습니다!");
            System.out.println("가드 횟수: "+gcnt);
            System.out.println("필살기 횟수: "+ucnt);
        }
    }

	private static void guard() {
		// TODO Auto-generated method stub
		System.out.println("보스의 공격을 방어했습니다.");
	}
}

