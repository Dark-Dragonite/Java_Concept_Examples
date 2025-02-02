package Decision_Making_Examples;

public class loopingExamples {

    /**
     * 1) An if statement has only one matching else statement
     * 
     * 2) The conditional expression of a for loop is evaluated first at start of
     * loop
     * execution
     * 
     * 3) A for Each loop can be used on any collection that implements
     * java.lang.iterable
     * 
     * Map && Set are do not implement interable
     * 
     * @param args
     */
    public static void main(String[] args) {
        int temp = 5;
        int max = 10;

        // this code compiles and runs without error
        //
        if (temp > 5)
            if (temp < max)
                System.out.println("Normal Temperature");
            else
                System.out.println("High Temperature");
        else
            System.out.println("Low Temperature");

        // above code is equivalent to
        if (temp > 5) {
            if (temp < max) {
                System.out.println("Normal Temperature");
            } else {
                System.out.println("High Temperature");
            }
        } else {
            System.out.println("Low Temperature");
        }

        for (var penguin : new int[] { 1, 2, 3 }) {
            System.out.println(penguin);
        }

        char wolf[] = { 'w', 'o', 'l', 'f' };
        int q = wolf.length;
        for (;;) {
            System.out.println(wolf[--q]);
            if (q == 0) {
                break;
            }
        }

        // Infinite loop since w is repeatedly set to r-1 each iteration of the loop
        // int r = 5;
        // for (int w = r - 1; r > -1; w = r - 1) {
        // System.out.println(w);
        // }

        // This code contains a compilation error due to unreachable code
        int nums[] = new int[] { 1, 2, 3 };
        // Integer nums2[] = new Integer[]{1,2,3};

        // for(int i: nums){
        // continue;
        // System.out.println(i);
        // }

        // print(nums);
        // print2(nums);
        // System.out.println("-----------------");
        // print3(nums);
        // print4(nums);

        anotherExample();

        // do while loop requires () around the while condition

        // do{
        // System.out.println("Hello");
        // }while Cont;
        boolean Cont = false;
        do {
            System.out.println("Hello");
            Cont = false;
        } while (Cont);
    }

    // These two methods print the same thing
    public static void print(int[] weather) {
        for (int i = 0; i < weather.length - 1; ++i) {
            System.out.println(weather[i]);
        }
    }

    static public void print2(int[] weather) {
        for (int i = 0; i < weather.length - 1; i++) {
            System.out.println(weather[i]);
        }
    }

    // These two methods do not pring the same thing
    public static void print3(int[] weather) {
        int count = 0;
        for (int i = 0; i < weather.length - 1; i++) {
            System.out.println("i=" + i);
            System.out.println(count++);
        }
    }

    static public void print4(int[] weather) {
        int count = 0;
        for (int i = 0; i < weather.length - 1; i++) {
            System.out.println("i=" + i);
            System.out.println(++count);
        }
    }

    public static void anotherExample() {
        int count = 0;
        ONE: for (int row = 1; row <= 3; row++) {
            TWO: for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    break TWO;
                count++;

                count++;
            }
            System.out.println(count);
        }
    }
}
