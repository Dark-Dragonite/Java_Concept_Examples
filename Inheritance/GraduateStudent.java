package Java_Concept_Tutorial.Inheritance;

public class GraduateStudent extends Student {
    // inherited name,courses,phone, major field from Student class

    String branch = "Computer Science";

    public GraduateStudent(String branch) {
        this.branch = branch;
    }

    public static void cannotOverride1() {
        System.out.println("I am my own method only declared in GraduateStudent");
    }

    // public void cannotOverride2() {
    // final methods cannot be overriden
    // }

}
