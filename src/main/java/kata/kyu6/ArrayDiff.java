package kata.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public static int[] alternative(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}
