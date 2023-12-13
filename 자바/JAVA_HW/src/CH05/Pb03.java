package CH05;
import java.util.Random;
public class Pb03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		System.out.println("로또번호 6개를 추천합니다!");
		
		int a = r.nextInt(46)+1;
		int cnt = 0;
		
		while(cnt < 5) {
			System.out.print(a+", ");
			int b = r.nextInt(46)+1;
			while(a == b) {				
				b = r.nextInt(46)+1;
			}
			a = b;
			cnt++;
		}
		System.out.print(a);
	}

}
