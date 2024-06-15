package task4;

import java.util.Random;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        long seed = new Random().nextLong(1000000L);
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        createInfiniteRandomStream(seed, a, c, m)
                .forEach(System.out::println);
    }

    public static Stream<Long> createInfiniteRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
