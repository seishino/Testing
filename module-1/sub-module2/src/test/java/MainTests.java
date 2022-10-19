import com.test.submodule2.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTests {
    @Test
    void convert(){
        Main main = new Main();
        assertEquals(main.convertCelciusToFahrenheit(25.0), 77.0, 0.0);
    }
}
