package CH05;
import java.util.*;
public class Pb02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int a,b,c;
	
		a = r.nextInt(100)+1;
		b = r.nextInt(100)+1;
		while(a==b) {
			b = r.nextInt(100)+1;
		}
		c = r.nextInt(100)+1;
		while((c==a)||(c==b)) {
			c = r.nextInt(100)+1;	
		}
		System.out.println("첫번째 당첨자 번호" + a);
		System.out.println("두번째 당첨자 번호" + b);
		System.out.println("세번째 당첨자 번호" + c);
		}	
	}


