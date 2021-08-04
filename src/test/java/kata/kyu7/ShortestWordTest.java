package kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestWordTest {

    @Test
    public void testFindShort() throws Exception {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
    }

    @Test
    public void testAlternative() throws Exception {
        assertEquals(3, ShortestWord.alternative("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.alternative("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.alternative("Let's travel abroad shall we"));
    }
}