package kata.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    private ArrayDiff() {
    }

    public static int[] justDoIt(int[] arrayA, int[] arrayB) {
        List<Integer> result = new ArrayList<>();

        Arrays.stream(arrayA).forEach(elementA -> {
            if (!Arrays.stream(arrayB).anyMatch(element -> element == elementA)) {
                result.add(elementA);
            }
        });

        return result.stream().mapToInt(i -> i).toArray();
    }
}
