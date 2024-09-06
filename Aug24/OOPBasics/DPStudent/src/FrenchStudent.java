public class FrenchStudent extends Student {

	public FrenchStudent(String name, int age, double mark) {
		super(name, age, mark);
	}

	@Override
	public void speak() {
		super.speak();
		System.out.println("Bonjour");
	}
}
