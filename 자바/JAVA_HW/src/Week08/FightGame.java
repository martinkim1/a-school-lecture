package Week08;

import java.util.Random;

class Fighter {
    String name;
    int health;
    int attackPower;

    public Fighter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Fighter opponent) {
        int damage = new Random().nextInt(attackPower) + 1;
        opponent.health -= damage;
        System.out.println(name + "이(가) " + opponent.name + "에게 " + damage + "의 데미지를 입혔습니다.");
    }
}

public class FightGame {
    public static void main(String[] args) {
        // 캐릭터 생성
        Fighter ryu = new Fighter("류", 100, new Random().nextInt(20) + 1);
        Fighter ken = new Fighter("켄", 200, new Random().nextInt(10) + 1);
        int round = 1;

        // 게임 진행
        while (ryu.health > 0 && ken.health > 0) {
        	System.out.println("라운드: " + round);
            // 각 턴마다 공격
            ryu.attack(ken);
            ken.attack(ryu);

            // 각 캐릭터의 체력 출력
            System.out.println("류의 체력: " + ryu.health);
            System.out.println("켄의 체력: " + ken.health);
            System.out.println();
            round++;
        }

        // 최종 승부 판정
        if (ryu.health <= 0 && ken.health <= 0) {
            System.out.println("무승부!");
        } else if (ryu.health <= 0) {
            System.out.println("켄이 이겼습니다!");
        } else {
            System.out.println("류가 이겼습니다!");
        }
    }
}
