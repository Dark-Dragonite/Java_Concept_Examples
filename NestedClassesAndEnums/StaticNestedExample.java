package NestedClassesAndEnums;

public class StaticNestedExample {

    static class StaticNestedClass {
        private int memberVar = 1;
    }

    public static void main(String[] args) {
        StaticNestedClass nested = new StaticNestedClass();
        System.out.println(nested.memberVar);
    }

}
