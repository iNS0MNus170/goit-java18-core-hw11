package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Petro", "Bogdan", "Oleg", "Dima", "Volodymyr", "Olena", "Marina", "Daniel");
        System.out.println(getOddIndexedNames(names));
    }

    static String getOddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> index + ". " + names.get(index))
                .collect(Collectors.joining(", "));
    }
}
