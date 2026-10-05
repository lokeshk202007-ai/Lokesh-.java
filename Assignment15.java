class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Lokesh", 20);

        System.out.println(s);
    }
}
