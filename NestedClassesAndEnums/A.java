package NestedClassesAndEnums;

public class A {
    private int x = 1;

    public class B {
        private int x = 2;

        public class C {
            private int x = 3;

            public void getAllX() {
                System.out.println(x); // 3
                System.out.println(this.x); // 3
                System.out.println(B.this.x); // 2
                System.out.println(A.this.x); // 1
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
        B.C c = b.new C();
        c.getAllX();
    }
}
