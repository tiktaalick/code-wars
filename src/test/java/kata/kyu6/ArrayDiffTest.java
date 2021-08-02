package kata.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayDiffTest {

    @Test
    void testJustDoIt() {
        assertArrayEquals(new int[]{2}, ArrayDiff.justDoIt(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, ArrayDiff.justDoIt(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, ArrayDiff.justDoIt(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, ArrayDiff.justDoIt(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, ArrayDiff.justDoIt(new int[]{}, new int[]{1, 2}));
    }

    @Test
    void testAlternative() {
        assertArrayEquals(new int[]{2}, ArrayDiff.alternative(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, ArrayDiff.alternative(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, ArrayDiff.alternative(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, ArrayDiff.alternative(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, ArrayDiff.alternative(new int[]{}, new int[]{1, 2}));
    }
}