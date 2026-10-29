package OOPs;

// Interface
interface Sports {
    void play();
}

// Abstract class
abstract class Person {
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Method overloading
    void display(String message) {
        System.out.println(message);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method
    abstract void work();
}

// Inheritance
class Student extends Person implements Sports {

    private String course;

    // Constructor + super
    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Method overriding
    @Override
    void work() {
        System.out.println(getName() + " is studying.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing.");
    }

    void displayStudent() {
        super.display();
        System.out.println("Course: " + course);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Student s = new Student("Ansh", 20, "AIML");

        // Encapsulation
        System.out.println(s.getName());
        s.setAge(21);

        // Display methods
        s.displayStudent();
        s.display("Welcome to Java OOPs!");

        // Runtime polymorphism
        Person p = new Student("Rahul", 19, "CSE");
        p.work();

        // Interface method
        s.play();
    }
}