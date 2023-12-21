import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class YamsTest {
    Yams yams = new Yams();
    @org.junit.Test
    public void shouldReturn0(){
       assertEquals(yams.game(),0);
    }
}
