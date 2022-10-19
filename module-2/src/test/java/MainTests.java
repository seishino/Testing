import com.test.module2.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTests {
    @Test
    void concat(){
        Main main = new Main();
        assertEquals(main.concat("test1", "test2"), "test1test2");
    }
}
