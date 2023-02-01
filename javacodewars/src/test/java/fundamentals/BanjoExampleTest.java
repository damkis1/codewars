package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BanjoExampleTest {
    @Test
    public void PeopleThatPlayBanjo(){
        assertEquals("Marcin does not play banjo", Banjo.areYouPlayingBanjo("Marcin"));
        assertEquals("Robert plays banjo", Banjo.areYouPlayingBanjo("Robert"));
        assertEquals("rafał plays banjo", Banjo.areYouPlayingBanjo("rafał"));
        assertEquals("agnieszka does not play banjo", Banjo.areYouPlayingBanjo("agnieszka"));
    }
}
