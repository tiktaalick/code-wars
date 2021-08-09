package kata.kyu6;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Write a function that takes a string of braces, and determines if the order of the braces is valid. It should
 * return true if the string is valid, and false if it's invalid.
 * <p>
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {
 * }. Thanks to @arnedag for the idea!
 * <p>
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 * <p>
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 * <p>
 * Examples
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */
public class BraceChecker {
    private static final List<String> OPENING = Arrays.asList("(", "[", "{");
    private static final List<String> CLOSING = Arrays.asList(")", "]", "}");

    public boolean isValid(String parenthesesBracketsAndBraces) {
        List<String> levels = new ArrayList<>();

        for (String element : Arrays.stream(parenthesesBracketsAndBraces.split("")).collect(Collectors.toList())) {
            if (OPENING.contains(element)) {
                levels.add(CLOSING.get(OPENING.indexOf(element)));
            } else if (CLOSING.contains(element) &&
                    (levels.isEmpty() || !element.equals(levels.get(levels.size() - 1)))) {
                return false;
            } else if (CLOSING.contains(element)) {
                levels.remove(levels.size() - 1);
            }
        }

        return true;
    }


    public boolean alternative(String parenthesesBracketsAndBraces) {
        Deque<Character> levels = new ArrayDeque<>();

        for (char c : parenthesesBracketsAndBraces.toCharArray()) {
            if (!levels.isEmpty() && isClosing(levels.peek(), c)) {
                levels.pop();
            } else {
                levels.push(c);
            }
        }

        return levels.isEmpty();
    }

    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }

}
