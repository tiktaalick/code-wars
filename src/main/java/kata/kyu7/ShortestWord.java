package kata.kyu7;

import java.util.Arrays;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {
    private ShortestWord() {
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .map(String::length)
                .min((lengthA, lengthB) -> lengthA - lengthB)
                .orElse(0);
    }

    public static int alternative(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .min()
                .orElse(0);
    }
}
