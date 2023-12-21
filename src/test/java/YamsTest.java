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


    @org.junit.Test
    public void fullShouldReturn30(){
        assertEquals(yams.game(List.of(1, 3, 3, 1, 1)),30);
    }

    @org.junit.Test
    public void yamsShouldReturn50(){
        assertEquals(yams.game(List.of(1, 1, 1, 1, 1)),50);
    }


    @org.junit.Test
    public void chanceShouldReturn(){
        assertEquals(yams.game(List.of(1, 4, 2,3, 5)),15);
    }

}
