import java.util.*;
import java.util.stream.*;

public class FilterEvenNum {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> numbers = Arrays.asList(arr1);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}