import java.util.*;
import java.util.stream.*;

public class FilterStringWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Charlie", "Arjun");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());

        System.out.println("Names starting with A: " + filteredNames);
    }
}