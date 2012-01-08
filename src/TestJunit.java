import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: DW
 * Date: 12-1-7
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class TestJunit {
    @Test
    public void TestCalculator(){
        PriceCalculator cal = new PriceCalculator();
        assertEquals(1000,cal.calculate(1));
        assertEquals(2000,cal.calculate(2));
        assertEquals(4000,cal.calculate(3));
    }

    

}
