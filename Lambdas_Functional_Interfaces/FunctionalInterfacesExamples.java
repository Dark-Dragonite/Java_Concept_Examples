package Java_Concept_Tutorial.Lambdas_Functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfacesExamples {

    public static void main(String[] args) {

        /*
         * There are the main functional interfaces
         * --------------------------------
         * 1- Predicate<T> - boolean test(T t)
         * 2- Consumer<T> - void accept(T t)
         * 3- Function<T, R> - R apply(T t)
         * 4- Supplier<T> - T get()
         * 5- Comparator<T> - int compare(T t1, T t2)
         * 6- Comparable<T> - int compareTo(T t)
         */

        // Predicate Example
        // Predicates are functions that evaluate to a boolean
        // -----------------------------------------------------------------
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // we implement a Predicate with a lambda expression
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Filter the list using the predicate
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Consumer Example
        // consumers accept values but do not return any
        // -----------------------------------------------------------------
        List<String> names = Arrays.asList("Frodo", "Freddy", "Sam", "Tom");
        Consumer<String> printNames = n -> System.out.println(n);

        // Function Example
        // functions accept a value and return that same value after operating on it
        // good for modifying lists
        // -----------------------------------------------------------------
        List<String> namesWithMr = names.stream()
                .map(name -> "Mr. " + name)
                .collect(Collectors.toList());

        System.out.println(namesWithMr);

        // Supplier Example
        // suppliers provide values but do not accept any
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        Integer randomValue = randomSupplier.get();
        System.out.println("Random value: " + randomValue);

        List<Integer> randomValues = Arrays.asList(randomSupplier.get(), randomSupplier.get(), randomSupplier.get(),
                randomSupplier.get(), randomSupplier.get(), randomSupplier.get());
        System.out.println(randomValues);

        // Sort takes a Comparator to determine order
        randomValues.sort((a, b) -> a - b);// sorts ascending order
        System.out.println(randomValues);

        randomValues.removeIf((x) -> x <= 50);
        // removeIf takes a Predicate and removes all elements satisfying the condition

        randomValues.forEach(System.out::println);
        // forEach takes a Consumer and applies it to each element in the list

    }

}
