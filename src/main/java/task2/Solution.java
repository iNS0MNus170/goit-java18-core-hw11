package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Petro", "Bogdan", "Oleg", "Dima", "Volodymyr", "Olena", "Marina", "Daniel");
        System.out.println(sortDescendingUpperCase(names));
    }

    static List<String> sortDescendingUpperCase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
