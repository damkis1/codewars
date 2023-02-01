package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleExampleTest {

    @Test
    void evenTests() {
        assertEquals("23",MiddleExample.getMiddle("1234"));
        assertEquals("bc",MiddleExample.getMiddle("abcd"));
    }

    @Test
    void oddTests() {
        assertEquals("2",MiddleExample.getMiddle("123"));
        assertEquals("b",MiddleExample.getMiddle("abc"));
    }
}
