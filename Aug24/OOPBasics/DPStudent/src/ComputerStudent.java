public class ComputerStudent extends Student {

    public ComputerStudent(String name, int age, double mark) {
        super(name, age, mark);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Hello World!");
    }
}
