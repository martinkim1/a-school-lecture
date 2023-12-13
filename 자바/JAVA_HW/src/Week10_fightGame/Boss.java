package Week10_fightGame;

public class Boss extends Fighter{

	public Boss(String name, int health, int attackPower) {
		super(name, health, attackPower);
		// TODO Auto-generated constructor stub
	}
	
	public void ultimate(Fighter me, Fighter boss) {
		me.health = me.health - 20;
		boss.health = boss.health - 5;
		System.out.println("보스가 필살기를 시전하였습니다.");
	}
}
