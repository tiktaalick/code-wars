package kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoToOneTest {

    @Test
    public void test1() {
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
    }

    @Test
    public void test2() {
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }

    @Test
    public void test3() {
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}
