import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> example = Arrays.asList("John", "Arthur", "andrade", "ana", "amy");

        Stream<String> exampleA = example.stream().filter(exA -> exA.startsWith("a") && exA.length() < 4);

        System.out.println("List without filtering: " + example);
        System.out.println("Stream filtered: " + exampleA.collect(Collectors.toList()));}
}