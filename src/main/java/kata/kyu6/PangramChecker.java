package kata.kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence
 * "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is
 * irrelevant).
 * <p>
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and
 * punctuation.
 */
public class PangramChecker {
    public boolean check(String sentence) {
        List<String> pangramList = Arrays.stream(sentence.toLowerCase().split("")).collect(Collectors.toList());
        List<String> alphabetList = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(Collectors.toList());
        alphabetList.removeAll(pangramList);
        return alphabetList.isEmpty();
    }

    public boolean alternative(String sentence) {
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
