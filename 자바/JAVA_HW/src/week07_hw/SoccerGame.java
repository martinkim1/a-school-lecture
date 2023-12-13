package week07_hw;

import java.util.Random;
import java.util.Scanner;

public class SoccerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int cnt = 0;
		int Mgoal = 0;
		int Cgoal = 0;
		
		System.out.println("축구 게임을 시작합니다.");
		
		while(true) {
			cnt ++;
			System.out.println("내가 공을 찹니다. 어느 쪽으로 차겠습니까?");
			System.out.println("왼쪽(1) 가운데(2) 오른쪽(3) 게임 끝(4)");
			
			int input = s.nextInt();
			int computer = r.nextInt(3)+1;
			
			if( input == 1 ) {
				System.out.println("왼쪽으로 공을 찹니다.");
			}
			else if( input == 2 ) {
				System.out.println("가운데로 공을 찹니다.");
			}
			else if( input == 3 ) {
				System.out.println("오른쪽으로 공을 찹니다.");
			}
			else if( input == 4 ) {
				System.out.println("무조건 골입니다.");
			}
			
			if( computer == 1 ) {
				System.out.println("골키퍼가 왼쪽으로 움직입니다.");			
			}
			else if( computer == 2 ) {
				System.out.println("골키퍼가 가운데로 움직입니다.");
			}
			else if ( computer == 3 ) {
				System.out.println("골키퍼가 오른쪽으로 움직입니다.");
			}
			
			if ( input != computer ) {
				System.out.println("골인입니다.");
				Mgoal++;
			} else if ( input == computer ) {
				System.out.println("아깝습니다!!! 골키퍼가 골을 막았습니다.");
			} else if ( input == 4 )
				Mgoal++;
			// 컴퓨터 차례
			System.out.println("내가 공을 막을 차례입니다. 어느 쪽으로 막겠습니까?");
			System.out.println("왼쪽(1) 가운데(2) 오른쪽(3) 게임 끝(4)");
			
			input = s.nextInt();
			computer = r.nextInt(3)+1;
			
			if( input == 1 ) {
				System.out.println("왼쪽으로 공을 막습니다.");
			}
			else if( input == 2 ) {
				System.out.println("가운데로 공을 막습니다.");
			}
			else if( input == 3 ) {
				System.out.println("오른쪽으로 공을 막습니다.");
			}
			else if( input == 4 ) {
				System.out.println("무조건 막습니다.");
			}
			
			if( computer == 1 ) {
				System.out.println("컴퓨터가 왼쪽으로 공을 찹니다.");			
			}
			else if( computer == 2 ) {
				System.out.println("컴퓨터가 가운데로 공을 찹니다.");
			}
			else if ( computer == 3 ) {
				System.out.println("컴퓨터가 오른쪽으로 공을 찹니다.");
			}
			
			if ( input == 4 ) {
				System.out.println("좋습니다!!! 골을 막았습니다.");
			} else if ( input == computer ) {
				System.out.println("좋습니다!!! 골을 막았습니다.");
			} else if ( input != computer ) {
				System.out.println("아.. 컴퓨터의 골인입니다.");
				Cgoal++;
			}
			
			System.out.println("내 골: "+Mgoal+",      컴퓨터 골: "+Cgoal+" ");
			if ( cnt == 5 ) {
				while(Mgoal == Cgoal) {
					System.out.println("동점입니다. 1번씩 더 공을 차서 승부를 결정합니다.");
					input = s.nextInt();
					computer = r.nextInt(3)+1;
					//넣을 차례
					if( input == 1 ) {
						System.out.println("왼쪽으로 공을 찹니다.");
					}
					else if( input == 2 ) {
						System.out.println("가운데로 공을 찹니다.");
					}
					else if( input == 3 ) {
						System.out.println("오른쪽으로 공을 찹니다.");
					}
					else if( input == 4 ) {
						System.out.println("무조건 골입니다.");
					}
					
					if( computer == 1 ) {
						System.out.println("골키퍼가 왼쪽으로 움직입니다.");			
					}
					else if( computer == 2 ) {
						System.out.println("골키퍼가 가운데로 움직입니다.");
					}
					else if ( computer == 3 ) {
						System.out.println("골키퍼가 오른쪽으로 움직입니다.");
					}
					
					if ( input == 4 ) {
						System.out.println("골인입니다.");
						Mgoal++;
					} else if ( input == computer ) {
						System.out.println("아깝습니다!!! 골키퍼가 골을 막았습니다.");
					} else if ( input != computer ) {
						System.out.println("골인입니다.");
						Mgoal++;
					}
					
					input = s.nextInt();
					computer = r.nextInt(3)+1;
					
					//막을차례
					if( input == 1 ) {
						System.out.println("왼쪽으로 공을 막습니다.");
					}
					else if( input == 2 ) {
						System.out.println("가운데로 공을 막습니다.");
					}
					else if( input == 3 ) {
						System.out.println("오른쪽으로 공을 막습니다.");
					}
					else if( input == 4 ) {
						System.out.println("무조건 막습니다.");
					}
					
					if( computer == 1 ) {
						System.out.println("컴퓨터가 왼쪽으로 공을 찹니다.");			
					}
					else if( computer == 2 ) {
						System.out.println("컴퓨터가 가운데로 공을 찹니다.");
					}
					else if ( computer == 3 ) {
						System.out.println("컴퓨터가 오른쪽으로 공을 찹니다.");
					}
					
					if ( input == 4 ) {
						System.out.println("좋습니다!!! 골을 막았습니다.");
					} else if ( input == computer ) {
						System.out.println("좋습니다!!! 골을 막았습니다.");
					} else if ( input != computer ) {
						System.out.println("아.. 컴퓨터의 골인입니다.");
						Cgoal++;
					}
					System.out.println("내 골: "+Mgoal+",      컴퓨터 골: "+Cgoal+" ");
				}
				System.out.print("나는 "+Mgoal+"골, 컴퓨터는 "+Cgoal+"골을 넣어 ");
				if(Mgoal > Cgoal) {
					System.out.println("내가 이겼습니다.");
				} else if(Mgoal < Cgoal) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				break;
			}
		}
		
	}

}
