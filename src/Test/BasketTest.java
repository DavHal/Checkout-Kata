package Test;

import com.davhal.Basket;
import com.davhal.Item;
import com.davhal.Order;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class BasketTest {

    @Before
    public void setUp() {
        Basket testBasketObject = null;
    }

    @Test
    public void basketIsInstanceOfTest(){

        Basket testBasketObject = new Basket();

        try {
            assertTrue(testBasketObject instanceof Order);
        }catch (Exception e){
            fail("basketIsInstanceOfTest Failed!" + e.getMessage());
        }
    }

    @Test
    public void totalCostMethodTest(){

        double totalTestValue = 1D;

        Basket testBasketObject = new Basket();
        testBasketObject.itemList.add(new Item("itemTest", totalTestValue, 'A' ));



    }


}
