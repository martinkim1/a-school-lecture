package Ch07;

import java.util.Random;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = r.nextInt(6) + 1;
		
		String name1 = "김동연";
		String name2 = "김동연";
		int num = 0;
		
		char n1 = name1.charAt(1);
		System.out.println(n1);
		if(name1 == name2) {
			System.out.println("같다.");
		} // String은 참조타입이어서 번지수가 저장됨. 문자열 리터럴이 같기 때문에 출력.
		
		if(name1.equals(name2)) {
			System.out.println("같다.(2)");
		} // name1과 name2의 '내용'이 비교해서 같으면 출력.
	}

}
