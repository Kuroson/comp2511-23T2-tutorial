package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        // Same thing
        strings.stream().forEach(x -> System.out.println(x));
        // Use if there is more than one line of code needed in lambda
        strings.stream().forEach(x -> {
            System.out.println(x);
        });

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        List<Integer> parsedStrings = strings2.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        strings2.stream().map(x -> Integer.parseInt(x)).forEach(x -> System.out.println(x));
    }
}