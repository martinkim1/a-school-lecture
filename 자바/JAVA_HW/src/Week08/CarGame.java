package Week08;

import java.util.Random;
import java.util.Scanner;

class Car {
    String name;
    int maxSpeed;
    int speed;
    int acceleration;
    double distance;

    public Car(String name, int maxSpeed, int acceleration) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.distance = 0;
    }

    public void accelerate() {
        if (distance < 5000) {
        	speed += acceleration;
        	if (speed >= maxSpeed) {
        		speed = 100;
        	}
            distance += speed;
        }
    }

    public void brake() {
        if (distance > 0) {
        	speed -= acceleration;
        	if (speed <= 0) {
        		speed = 0;
        	}
            distance -= speed;
        }
    }

    public void displayDistance() {
        System.out.println("주행 거리: " + distance + " Km");
    }
}

public class CarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 내 자동차 생성
        Car myCar = new Car("My Car", 100, random.nextInt(20) + 1);

        // 컴퓨터 자동차 생성
        Car computerCar = new Car("Computer Car", 100, random.nextInt(20) + 1);

        int round = 0;

        while (true) {
            System.out.println("1번-엑셀, 2번-브레이크, 3번-주행거리 표시");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myCar.accelerate();
                    computerCar.accelerate();
                    break;
                case 2:
                    myCar.brake();
                    computerCar.brake();
                    break;
                case 3:
                    myCar.displayDistance();
                    computerCar.displayDistance();
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }

            // 10%의 확률로 장애물 발생
            if (random.nextInt(10) == 0) {
                myCar.speed = 0;
                System.out.println("장애물 발생! 나의 속도가 0으로 초기화되었습니다.");
            }
            
            // 한 턴이 끝나면 1바퀴를 돌았는지 확인
            if (myCar.distance >= 5000) {
                System.out.println("나의 자동차가 1바퀴를 돌았습니다!");
                break;
            }

            if (computerCar.distance >= 5000) {
                System.out.println("컴퓨터 자동차가 1바퀴를 돌았습니다!");
                break;
            }
            
            System.out.println("주행거리: " + myCar.distance);
            System.out.println("컴 주행거리: " + computerCar.distance);
            System.out.println("내 속도: " + myCar.speed);
            System.out.println("컴 속도: " + computerCar.speed); 
            round++;
        }

        // 결과 출력
        System.out.println("나의 자동차: " + round + "번 밟았습니다.");
        System.out.println("컴퓨터 자동차: " + round + "번 밟았습니다.");

        // 승부 판정
        if (myCar.distance >= 5000 && computerCar.distance >= 5000) {
            System.out.println("무승부입니다!");
        } else if (myCar.distance >= 5000) {
            System.out.println("나의 자동차가 이겼습니다!");
        } else {
            System.out.println("컴퓨터 자동차가 이겼습니다!");
        }

        scanner.close();
    }
}
