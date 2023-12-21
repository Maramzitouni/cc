import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class YamsTest {
    Yams yams = new Yams();
    @org.junit.Test
    public void brelanShouldReturn28(){
       assertEquals(yams.game(List.of(1, 2, 3, 1, 1)),28);
    }

    @org.junit.Test
    public void squareShouldReturn35(){
        assertEquals(yams.game(List.of(1, 1, 3, 1, 1)),35);
    }
}
