package kata.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DubstepTest {
    @Test
    public void Test1() {
        assertEquals("ABC", new DubStep().SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", new DubStep().SongDecoder("RWUBWUBWUBLWUB"));
    }

    @Test
    public void Test3() {
        assertEquals("WE ARE THE CHAMPIONS MY FRIEND", new DubStep().SongDecoder(
                "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

    @Test
    public void Test4() {
        assertEquals("I AM X", new DubStep().SongDecoder(
                "WUBWUBIWUBAMWUBWUBX"));
    }
}