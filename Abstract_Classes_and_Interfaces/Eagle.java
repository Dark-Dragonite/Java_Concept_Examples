package Abstract_Classes_and_Interfaces;

public class Eagle extends Bird {

    // overriden method from Bird
    public String getType() {
        return "Eagle";
    }

    // printName() is inherited form bird and calls the overriden getType() method

    public static void main(String[] args) {
        new Eagle().printName(); // prints out eagle, because the overriden method is called
    }

}
