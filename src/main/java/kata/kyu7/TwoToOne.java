package kata.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible,
 * containing distinct letters - each taken only once - coming from s1 or s2.
 * <p>
 * Examples:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 * <p>
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {
    private TwoToOne() {

    }

    public static String longest(String a, String b) {
        return Arrays.stream((a.concat(b)).split("")).distinct().sorted().collect(Collectors.joining());
    }
}
