package fundamentals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsFilterTest {
    @Test
    public void test(){
        assertEquals(List.of(1,2), StringsFilter.filterList(List.of(1,"d",2,"c")));
        assertEquals(List.of(-100,-1), StringsFilter.filterList(List.of(-100,"dsada",-1,"cdsasd", "dasdsa")));
        assertEquals(List.of(0,0), StringsFilter.filterList(List.of(0,"d",0,"c")));
    }
}
