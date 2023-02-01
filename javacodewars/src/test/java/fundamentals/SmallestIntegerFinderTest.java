package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestIntegerFinderTest {
    @Test
    public void test1(){
        int expected = -33;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{-10,5,10,-33,1000});
        assertEquals(expected,actual);
    }

    @Test
    public void test2(){
        int expected = -100;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{-100,5,10,-33,1000});
        assertEquals(expected,actual);
    }

    @Test
    public void test3(){
        int expected = 1000;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{2000,1000,10000,3333,1122});
        assertEquals(expected,actual);
    }
}
