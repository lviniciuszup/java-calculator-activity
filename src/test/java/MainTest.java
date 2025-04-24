
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
  @Test
    public void testSoma(){
      assertEquals(5.0, Main.calcular(2.0, 3.0, '+'));
  }
  @Test
    public void testSub(){
      assertEquals(2.0, Main.calcular(5.0, 3.0, '-'));
  }
    @Test
    public void testMult(){
        assertEquals(6.0, Main.calcular(2.0, 3.0, '*'));
    }
    @Test
    public void testInvalid() {
        assertThrows(IllegalArgumentException.class, () ->{
            Main.calcular(5.0,2.0,'x');
        });
    }
}