package Java_Concept_Tutorial.Inheritance;

import java.util.*;

public class School {
    List<Student> students = new ArrayList();

    public void addStudent(String name, String number, int courses, int id) {
        Student s = new Student();
        s.name = name;
        s.phone = number;
        s.courses = courses;
        students.add(s);
    }

    public static void main(String[] args) {
        School madison = new School();// implicitly added constructor

        madison.addStudent("Mike Flannigan", "111-111-1111", 3, Student.id);
        madison.addStudent("Zoey Zacharova", "222-222-2222", 3, Student.id);

        System.out.println(madison.students.get(0).name);
        System.out.println(madison.students.get(1).name);
        System.out.println(madison.students.get(0).id);
        System.out.println(madison.students.get(1).id);

        GraduateStudent gs = new GraduateStudent("Computer Science");
        GraduateStudent.cannotOverride1();

        // gs= (student) gs;

        // Rules for casting objects
        // 1- casting a reference from a subtype to a supertype does not require an
        // explicit cast
        // 2- casting a reference from a super to sub type requires an explicit cast
        // 3- the compiler disallows cast to an unrelated class
        // 4- at runtime an invalid cast of a reference to an unrelated type results in
        // a classcastException being thrown
    }

}
