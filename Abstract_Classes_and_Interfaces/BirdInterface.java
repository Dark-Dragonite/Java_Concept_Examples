package Abstract_Classes_and_Interfaces;

/* 
 * Interfaces are a way to achieve abstraction in Java
 * 
 * the abstract modifier is added implicitly to interfaces if not declared explicitly
 * 
 * Rules
 * 1- Interfaces cannot be instantiated
 * 2- top-level types cannot be marked private or protected
 * 3- Interfaces are assumed to be abstract and are cannot be final
 * 4- Interfaces may contain zero or more abstract methods
 * 5- An Interface can extend any number of interfaces
 * 6- An Interface may be cast to any reference that inherits the interface, 
 * although this may produce an exception at runtime if the classes are not related
 *  
 */
public interface BirdInterface {
    public abstract void fly();

    // Abstract method (implicitly public and abstract)
    void eat();

    // Default and static methods (introduced in Java 8)
    default void chirp() {
        System.out.println("Chirp chirp");
    }

    static void fly2() {
        System.out.println("flying");
    };

}

// Another interface to demonstrate extending multiple interfaces
interface AnimalInterface {
    void sleep();
}

// BirdInterface extending another interface
interface AdvancedBirdInterface extends BirdInterface, AnimalInterface {
    void nest();
}
