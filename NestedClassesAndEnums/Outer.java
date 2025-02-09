package NestedClassesAndEnums;

public class Outer {

    public class Inner {
        public int x = 5;

        public void doSomething() {
            System.out.println(x);
        }
    }

    public void callInner() {
        Inner in = new Inner();
        in.doSomething();
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.callInner();

        Inner in = out.new Inner(); // alternate syntax for instantiating an inner class

    }

}
