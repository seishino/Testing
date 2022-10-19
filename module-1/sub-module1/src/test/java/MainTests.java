import com.test.submodule1.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTests {

    @Test
    public void addTests(){
        Main main = new Main();
        assertEquals(main.plus(1.0,2.0), 3.0, 0.0);
    }

    @Test
    public void addMultiply(){
        Main main = new Main();
        assertEquals(main.multiply(1.0,2.0), 2.0, 0.0);
    }

    @Test
    public void addDivide(){
        Main main = new Main();
        assertEquals(main.divide(1.0,2.0), 0.5, 0.0);
    }

    @Test
    public void addMinus(){
        Main main = new Main();
        assertEquals(main.minus(1.0,2.0), -1.0, 0.0);
    }
}
