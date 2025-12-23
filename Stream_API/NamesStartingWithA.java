package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesStartingWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Charlie", "Arjun");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());

        System.out.println("Names starting with A: " + filteredNames);
    }

}
