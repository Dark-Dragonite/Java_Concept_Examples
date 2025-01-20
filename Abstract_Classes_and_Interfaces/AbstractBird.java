package Abstract_Classes_and_Interfaces;

/**
 * Abstract classes are classes that cannot be instantiated, but can be
 * extended.
 * 
 * Rules
 * 1- Abstract methods cannot contain a body/implementation, they must be
 * overriden by inheriting classes.
 * 2- Abstract classes cannot be marked as final, private, or protected
 * 3- Abstract classes do not need to contain abstract methods
 * 4- Abstract classes can contain non-abstract methods, variables, static and
 * instance methods, inner classes and constructors
 * 5- Abstract classes can have constructors, but they cannot be used.
 * 6- Abstract classes can be initialized only as part of the non-abstract
 * subclasses instantiation
 * 7- abstract modifier cannot be placed after the class keyword
 * 8- abstract methods cannot be static,private,final
 * 9- The first non-abstract subclass must implement all abstract methods.
 */
abstract class AbstractBird {
    public abstract String getName();

    public void printName() {
        System.out.println(getName());
    }

}
