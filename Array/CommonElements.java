import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 7};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Use a HashSet to store elements of arr1
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // Find common elements
        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        System.out.println("Common elements: " + common);
    }
}