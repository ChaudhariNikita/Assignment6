package Assignment6;

public class TestEngine {

	public static void main(String[] args) {
		Engine engine = new Engine("BMW", 617);
//		engine.start();
//		engine.stop();
//		engine.display();
		Car car = new Car("Aura", "Hundai", engine);
		car.start();
		car.stop();
		System.out.println("===========");
		car.carDisplay();
	}

}
