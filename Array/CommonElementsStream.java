import java.util.*;
import java.util.stream.*;

public class CommonElementsStream {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {3, 4, 5, 6, 7};

        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);

        List<Integer> common = list1.stream()
                                    .filter(list2::contains)
                                    .distinct()
                                    .collect(Collectors.toList());

        System.out.println("Common elements: " + common);
    }
}