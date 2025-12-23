//Flotten the given list using FlatMap
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

 public static void main(String[] args) {
    List<List<String>> nested = Arrays.asList(
    Arrays.asList("A", "B"),
    Arrays.asList("C", "D")
);
List<String> flat = nested.stream()
                          .flatMap(List::stream)
                          .collect(Collectors.toList());
System.out.println(flat); // [A, B, C, D]
    
}
}
