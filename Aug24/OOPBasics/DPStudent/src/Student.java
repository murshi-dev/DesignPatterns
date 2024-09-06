class Student {
    protected String name;
    protected int age;
    protected double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void speak() {
        System.out.println("Hi, my name is " + name);
    }
}
