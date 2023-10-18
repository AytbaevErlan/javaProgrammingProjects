package lecture16.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> personalDetails = Map.of(
                8, "Alex",
                9, "Jack",
                2, "Bob",
                3, "Charlie",
                13, "Dean",
                1, "Eric",
                5, "Fredric",
                6, "Harry");

        List<Integer> validId = Arrays.asList(1, 2, 5, 8, 9, 13);

        List<String> reversedName = personalDetails.entrySet().stream().filter(entry -> validId.contains(entry.getKey()))
                .map(Map.Entry::getValue).filter(name -> name.length() % 2 != 0).map(Main::reversedString).collect(Collectors.toList());

        reversedName.forEach(System.out::println);

    }

    private static String reversedString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}


