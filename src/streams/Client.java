package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Collections.sort(numbers, (Integer i1, Integer i2) -> {
            return i1 - i2;
        });

    }
}
