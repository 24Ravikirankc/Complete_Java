import java.util.*;
import java.util.stream.*;

public class FilterExample {
    public static void main(String[] args) {
        // given array of integers
        
            Integer[] arr1 = {5, 8, 12, 3, 15, 20, 7};
        // Create an ArrayList of integers
        List<Integer> numbers = Arrays.asList(arr1);

        // Use Stream filter to get numbers greater than 10
        List<Integer> greaterThan10 = numbers.stream()
                                             .filter(n -> n > 10)
                                             .collect(Collectors.toList());

        // Print the result
        System.out.println("Numbers greater than 10: " + greaterThan10);
    }
}