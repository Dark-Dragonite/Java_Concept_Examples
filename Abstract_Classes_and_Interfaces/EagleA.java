package Abstract_Classes_and_Interfaces;

public class EagleA extends AbstractBird {

    // EagleA must override and implement the abstract method getName()
    public String getName() {
        return "Eagle";
    }

    private void chirp() {
        System.out.println("Screech");
    }

    private void sleep() {
        System.out.println("Eagle sleeps");
    }

    private void eat() {
        System.out.println("Eagle eats");
    }

    private void fly() {
        System.out.println("Eagle flies");
    }

    public static void main(String[] args) {
        EagleA eagle = new EagleA();
        eagle.printName();
        eagle.fly();
        eagle.eat();
        eagle.sleep();
        eagle.chirp(); // Calling default method from BirdInterface
        BirdInterface.fly2();// Calling static method from BirdInterface

    }

}
