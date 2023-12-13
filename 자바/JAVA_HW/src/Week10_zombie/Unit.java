package Week10_zombie;

import java.util.Random;

public class Unit {
	Random r = new Random();
	String name;
	int pos;

	public Unit(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}
	
	public void left() {
		pos = pos - 1;
		if (pos < 0)
			pos = 0;
		System.out.println(name + "이 왼쪽으로 움직여서 현재 위치는 " + pos + "입니다.");
	}
	
	public void right() {
		pos = pos + 1;
		if(pos > 20)
			pos = 20;
		System.out.println(name + "이 왼쪽으로 움직여서 현재 위치는 " + pos + "입니다.");
	}
}
