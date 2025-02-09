package NestedClassesAndEnums;

public class BadInnerExample {
    private class Bad {
    }

    public void makeInner() {
        new Bad();
    }

    public static void badMethod() {
        new Bad(); // compiler error
    }

}

public class AnotherInner {

    public void accessOuter() {
        new Bad();
    }

    Bad b = new Bad();
}
