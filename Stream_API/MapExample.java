import java.util.*;
import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");

        // Use map() to transform each string to uppercase
        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        // Print the result
        System.out.println("Uppercase names: " + upperNames);
    }
}