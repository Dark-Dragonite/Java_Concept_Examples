package Decision_Making_Examples;

/**
 * Switch statements are a faster way to perform multiple if else decisions
 * Switch supports the below data types:
 * byte && Byte
 * int && Integer
 * short && Short
 * char && Character
 * String
 * enum
 * var if the type of var evaluates to one of the above types
 * 
 * Switch does not support floating points(float/double 4.0f, 2.0) and boolean
 * types as well as long or its Wrapper class
 * 
 * case statements in a switch must evaluate to a compile time constant value
 */
public class switchExample1 {
    public static void main(String[] args) {
        int switcher = 0;

        switch (switcher) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("No Match Found");
        }

        switch (switcher) {
        }

    }

    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public void badMethod(final int thursday, int sunday, DayOfWeek dayOfWeek) {
        int otherday = 0;

        switch (otherday) {
            case 1:
                System.out.println("1");
                break;

            // thursday is not compile time constant
            // case thursday:
            // System.out.println("4");
            // break;

            // sunday is snot constant
            // case sunday:
            // break;

            // dayOfWeek is not of type int
            // case dayOfWeek.MONDAY:
            // System.out.println("Monday");
            // break;

        }
    }
}
