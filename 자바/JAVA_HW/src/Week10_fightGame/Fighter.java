package Week10_fightGame;

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
