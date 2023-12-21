import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class YamsTest {
    Yams yams = new Yams();
    @org.junit.Test
    public void brelanShouldReturn28(){
       assertEquals(yams.oneGame(List.of(1, 2, 3, 1, 1)),28);
    }

    @org.junit.Test
    public void squareShouldReturn35(){
        assertEquals(yams.oneGame(List.of(1, 1, 3, 1, 1)),35);
    }


    @org.junit.Test
    public void fullShouldReturn30(){
        assertEquals(yams.oneGame(List.of(1, 3, 3, 1, 1)),30);
    }

    @org.junit.Test
    public void yamsShouldReturn50(){
        assertEquals(yams.oneGame(List.of(1, 1, 1, 1, 1)),50);
    }


    @org.junit.Test
    public void chanceShouldReturn(){
        assertEquals(yams.oneGame(List.of(1, 4, 2,3, 5)),15);
    }

    @org.junit.Test
    public void ShouldReturn30(){
        assertEquals(yams.games(List.of(1, 4, 2,3, 5),List.of(1, 4, 2,3, 5)),30);
    }

}
