package ch08;

class Dog {
	String name;
	int age;
	
	public void bite() {
		System.out.println(name+"가 물었습니다.");
	}
	
	public void bark() {
		System.out.println(name+"가 짖었습니다.");
	}
}
public class DogTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		
		dog.name = "따띠";
		dog.age = 4;
		
		dog.bark();
		dog.bite();
	}
	
}
