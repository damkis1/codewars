package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryAdditionTest {
    @Test
    public void test(){
        assertEquals(Integer.toBinaryString(21),BinaryAddition.binaryAddition(10,11));
        assertEquals(Integer.toBinaryString(31),BinaryAddition.binaryAddition(20,11));
        assertEquals(Integer.toBinaryString(111),BinaryAddition.binaryAddition(65,46));
    }
}
