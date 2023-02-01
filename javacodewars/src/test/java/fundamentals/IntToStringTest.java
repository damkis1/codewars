package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntToStringTest {

    @Test
    void tests() {
        assertEquals("67", IntToString.numberToString(67));
        assertEquals("123", IntToString.numberToString(123));
        assertEquals("999", IntToString.numberToString(999));
    }
}
