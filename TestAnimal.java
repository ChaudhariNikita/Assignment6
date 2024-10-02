package Assignment6;

abstract class Animal {

	abstract void sound();

	abstract void move();
}

class Dog extends Animal {

	public void sound() {

		System.out.println("The Dog Bark");
	}

	public void move() {
		System.out.println("Dog will Move");
	}

}

class Cat extends Animal {
	public void sound() {
		System.out.println("This Cat Meows");
	}

	public void move() {
		System.out.println("cat walk");
	}

}

class Bird extends Animal {

	void sound() {
		System.out.println("The bird chirps");
	}

	void move() {
		System.out.println(" bird flies");

	}

}

public class TestAnimal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.move();
		System.out.println("=========");
		Cat cat = new Cat();
		cat.sound();
		cat.move();
		System.out.println("=========");
		Bird bird = new Bird();
		bird.sound();
		bird.move();

	}

}
