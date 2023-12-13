package Week08;
import java.util.Random;
import java.util.Scanner;

class Zombie {
    String name;
    int currentPosition;

    public Zombie(String name, int currentPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
    }

    public void move() {
        Random random = new Random();
        int moveDirection = random.nextInt(3) - 1; // -1, 0, 1 중 하나를 랜덤으로 선택
        currentPosition += moveDirection;

        // 현재위치가 화면 밖으로 나가지 않도록 조정
        currentPosition = Math.max(1, Math.min(currentPosition, 20));

        System.out.println(name + "의 현재 위치는 " + currentPosition + " 입니다.");
    }
}

class Hero {
    String name;
    int currentPosition;
    int lifeCount;

    public Hero(String name, int currentPosition, int lifeCount) {
        this.name = name;
        this.currentPosition = currentPosition;
        this.lifeCount = lifeCount;
    }

    public void jump() {
        Random random = new Random();
        int jumpDistance = random.nextInt(3) + 1; // 1 ~ 3까지의 랜덤한 값
        currentPosition += jumpDistance;
        System.out.println(name + "이(가) " + jumpDistance + " 만큼 점프하였습니다.");
    }

    public void leftMove() {
        currentPosition--;
        System.out.println(name + "이(가) 왼쪽으로 이동하여 현재 위치는 " + currentPosition + " 입니다.");
    }

    public void rightMove() {
        currentPosition++;
        System.out.println(name + "이(가) 오른쪽으로 이동하여 현재 위치는 " + currentPosition + " 입니다.");
    }
}

public class ZombieGame {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("좀비1", 7);
        Zombie zombie2 = new Zombie("좀비2", 15);
        Hero hero = new Hero("자기이름", 1, 3);

        Scanner scanner = new Scanner(System.in);

        while (hero.currentPosition < 20 && hero.lifeCount > 0) {
            // 주인공의 움직임
            System.out.println("1. 왼쪽으로 이동, 2. 오른쪽으로 이동, 3. 점프");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hero.leftMove();
                    break;
                case 2:
                    hero.rightMove();
                    break;
                case 3:
                    hero.jump();
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }

            // 좀비들의 움직임
            zombie1.move();
            zombie2.move();

            // 충돌 여부 확인
            if (hero.currentPosition == zombie1.currentPosition || hero.currentPosition == zombie2.currentPosition) {
                hero.lifeCount--;
                System.out.println("좀비에게 잡혔습니다. 현재 나의 생명은 " + hero.lifeCount + "개 남았습니다. 처음 위치에서 다시 시작합니다.");
                hero.currentPosition = 1;
            }
        }

        // 게임 결과 출력
        if (hero.lifeCount > 0) {
            System.out.println("미션 클리어!!! 목적지에 도착했습니다.");
        } else {
            System.out.println("생명이 0입니다. 게임을 종료합니다.");
        }

        scanner.close();
    }
}
