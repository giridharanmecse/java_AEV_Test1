import static org.junit.Assert.*;
import org.junit.Test;

public class TestMain {
    @Test
    public void testAddition() {
        assertEquals(10, Main.add(5, 5));
        assertEquals(20, Main.add(10, 10));
    }
}
