package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        sortAndPrintSortedResult(arr);


    }

    static void sortAndPrintSortedResult(String[] arr) {
        String res = Arrays.stream(arr)
                .flatMap(value -> Arrays.stream(value.split(",\\s+")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("\"" + res + "\"");
    }
}
