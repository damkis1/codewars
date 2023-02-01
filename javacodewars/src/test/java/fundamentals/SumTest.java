package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {


    Sum s = new Sum();

    @Test
    public void test1() {
        assertEquals(-1, s.getSum(0, -1));
        assertEquals(1, s.getSum(0, 1));
    }

    @Test
    public void test3() {
        assertEquals(-15, s.getSum(-1, -5));
    }
    @Test
    public void test4() {
        assertEquals(14, s.getSum(5, -1));
    }
    @Test
    public void test2() {
        assertEquals(-1275, s.getSum(-50, 0));
    }
}
