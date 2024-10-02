package Assignment6;

public class Person {
	final private String name;
	final private int age;

	public Person() {
		name = "ABC";
		age = 40;
	}

	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.display();

	}

}
