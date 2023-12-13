package Week10_zombie;
import java.util.*;
public class Hero extends Unit{
	
	int life;
	
	public Hero(String name, int pos, int life) {
		super(name, pos);
		this.life = life;
	}
	public void jump() {
		int a = r.nextInt(3) + 1;
		pos = pos + a;
		System.out.println(name+"이 "+a+"만큼 점프했습니다. 현재 위치는 "+pos+"입니다.");
	}
	public void move() {
		System.out.println("왼쪽(1), 오른쪽(2), 점프(3)");
		int a = r.nextInt();
		if(a==1) left();
		else if(a==2) right();
		else if(a==3) jump();
	}
}
