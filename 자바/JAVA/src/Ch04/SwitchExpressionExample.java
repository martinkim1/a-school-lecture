package Ch04;
import java.util.*;
public class SwitchExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char grade = s.next().charAt(0);
		// 화살표 -> 를 사용해 case문 작성.
		// -> 사용시 마지막에 break;를 쓴것과 동일.
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}
	}

}
