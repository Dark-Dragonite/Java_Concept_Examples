package Java_Concept_Tutorial.Inheritance;

public class Student {
    String name;
    int courses = 0;
    static int id = 0;
    String phone = "111-111-1111";
    final String major = "Engineering";

    static {
        System.out.println("Student class is loaded");
    }

    {
        id++;
    }

    public Student() {

    }

    public static void speak() {
        System.out.println("I Just got accepted;");
    }

    private void cannotOverride1() {
        System.out.println("I am my own method only available in Student");
        // attempting to override would create a new method entirely
        // private methods aren not inherited
    }

    final public void cannotOverride2() {
        System.out.println("I am a final");
        // final methods cannot be overriden
    }

    // public static void assignCourses(int x) {
    // courses = x;
    // }
    // Problem: compiler error, cannot make static reference to non static
    // field
    // Why: Static methods can be called without an instance of the class
    // if that is done courses wont be an instance that can be assigned a value.

    public static void main(String[] args) {
        Student.speak(); // static method invocation

    }

}
