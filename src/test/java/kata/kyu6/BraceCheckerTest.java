package kata.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Examples
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */
class BraceCheckerTest {
    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid1() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testValid2() {
        assertEquals(true, checker.isValid("(){}[]"));
    }

    @Test
    public void testValid3() {
        assertEquals(true, checker.isValid("([{}])"));
    }

    @Test
    public void testValid4() {
        assertEquals(true, checker.isValid("(f[i{e}t]s)t"));
    }

    @Test
    public void testValid5() {
        assertEquals(true, checker.isValid(""));
    }

    @Test
    public void testInvalid1() {
        assertEquals(false, checker.isValid("(}"));
    }

    @Test
    public void testInvalid2() {
        assertEquals(false, checker.isValid("[(])"));
    }

    @Test
    public void testInvalid3() {
        assertEquals(false, checker.isValid("[({})](]"));
    }

    @Test
    public void testInvalid4() {
        assertEquals(false, checker.isValid(")"));
    }

    @Test
    public void testInvalid5() {
        assertEquals(false, checker.isValid("}(){"));
    }

    @Test
    public void testInvalid6() {
        assertEquals(false, checker.isValid("[}]{"));
    }

    @Test
    public void testInvalid7() {
        assertEquals(false, checker.isValid(")("));
    }


    @Test
    public void testAlternativeValid1() {
        assertEquals(true, checker.alternative("()"));
    }

    @Test
    public void testAlternativeValid2() {
        assertEquals(true, checker.alternative("(){}[]"));
    }

    @Test
    public void testAlternativeValid3() {
        assertEquals(true, checker.alternative("([{}])"));
    }

    @Test
    public void testAlternativeValid4() {
        // The alternative version does not support this case
        assertEquals(false, checker.alternative("(f[i{e}t]s)t"));
    }

    @Test
    public void testAlternativeValid5() {
        assertEquals(true, checker.alternative(""));
    }

    @Test
    public void testAlternativeInvalid1() {
        assertEquals(false, checker.alternative("(}"));
    }

    @Test
    public void testAlternativeInvalid2() {
        assertEquals(false, checker.alternative("[(])"));
    }

    @Test
    public void testAlternativeInvalid3() {
        assertEquals(false, checker.alternative("[({})](]"));
    }

    @Test
    public void testAlternativeInvalid4() {
        assertEquals(false, checker.alternative(")"));
    }

    @Test
    public void testAlternativeInvalid5() {
        assertEquals(false, checker.alternative("}(){"));
    }

    @Test
    public void testAlternativeInvalid6() {
        assertEquals(false, checker.alternative("[}]{"));
    }

    @Test
    public void testAlternativeInvalid7() {
        assertEquals(false, checker.alternative(")("));
    }
}